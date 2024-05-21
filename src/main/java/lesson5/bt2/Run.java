package lesson5.bt2;

import java.util.Scanner;

/**
 * chay thu
 *
 * @author thanhson2000 phansonbs2000@gmail.com
 * @version 21/05/2024 21:20
 * @since JDK11
 */
public class Run {
    public static void main(String[] args) {
        boolean isLogined = false;
        Student currentStudent;
        Manager manager = new Manager();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Xin nhap id: ");
            String id = input.nextLine();
            if (manager.authentication(id) != null) {
                System.out.println("Id chinh xac!");
                isLogined = true;
                currentStudent = manager.authentication(id);
                break;
            } else {
                System.out.println("Id khong ton tai");
            }
        }

        if(isLogined){
            System.out.println("1. In ra thông tin sinh viên của bạn ");
            System.out.println("2. In ra thông tin sinh viên có điểm trung bình cao nhất");
            System.out.println("3. In ra thông tin sinh viên có điểm trung bình thấp nhất");
            System.out.println("4. In ra thông tin sinh viên có tuổi lớn nhất ");
            System.out.println("5. In ra thông tin sinh viên có tuổi nhỏ nhất");
            System.out.println("6. Thoát chương trình");
            System.out.print("Xin ban nhap lua chon: ");
            int select = input.nextInt();

            switch (select){
                case 1:
                    manager.getInfo(currentStudent);
                    break;
                case 2:
                    manager.getInfoOfHighestScoreStudent();
                    break;
                case 3:
                    manager.getInfoOfLowestScoreStudent();
                    break;
                case 4:
                    manager.getInfoOfHighestAgeStudent();
                    break;
                case 5:
                    manager.getInfoOfLowestAgeStudent();
                    break;
                case 6:
                    System.out.println("Good bye, Hen gap lai");
                    break;
            }
        }
    }
}
