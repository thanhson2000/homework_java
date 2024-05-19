package lesson4.throwable.practice_atm_v3;

import java.util.Scanner;

/**
 * thuc thi
 *
 * @author thanhson2000 phansonbs2000@gmail.com
 * @version 18/05/2024 23:21
 * @since JDK11
 */
public class Run {
    static boolean isLogined = false;

    public static void main(String[] args) {
        UserBase user = new User2();
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Xin nhap id: ");
            String id = input.nextLine();
            System.out.println("Xin nhap mat khau:");
            String password = input.nextLine();
            if (user.checkLogin(id, password)) {
                System.out.println("Welcome!!!");
                isLogined = true;
                break;
            } else {
                System.out.println("Id hoac mat khau khong dung, xin nhap lai");
            }
        }
        while (isLogined) {
            System.out.println("Xin nhap so tien can rut:");
            double expectedMoney;
            try {
                Scanner scanner = new Scanner(System.in);
                expectedMoney = scanner.nextDouble();
                if (user.checkWithDraw(expectedMoney) == false) {
                    System.out.println("So tien can rut khong hop le, xin nhap lai");
                } else {
                    System.out.println(user.getInfo());
                    System.out.println("Good bye, Hen gap lai");
                    break;
                }
            }catch(Exception e){
                System.out.println("So tien can rut phai duoc nhap bang so");
            }
        }

    }
}




