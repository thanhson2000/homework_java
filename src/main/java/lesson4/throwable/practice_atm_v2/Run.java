package lesson4.throwable.practice_atm_v2;

import java.util.Scanner;

/**
 * thuc thi
 *
 * @author thanhson2000 phansonbs2000@gmail.com
 * @version 17/05/2024 01:12
 * @since JDK11
 */
public class Run {
    public static void main(String[] args) {
        UserList list = new UserList();
        Scanner sc = new Scanner(System.in);
        System.out.println("Vui long nhap id: ");
        String id = sc.nextLine();
        System.out.println("Vui long nhap nhap khau: ");
        String password = sc.nextLine();
        if(list.testLogin(id,password)){
            System.out.println("Welcome, "+list.getName(id));
            System.out.println("Vui long nhap so tien can rut:");
            double expertedMoney = sc.nextDouble();
            if(list.testWithDraw(id,expertedMoney)){
                System.out.println("Good bye, Hen gap lai");
            }
        }else{
            System.out.println("Id mat khau khong dung");
        }
    }
}
