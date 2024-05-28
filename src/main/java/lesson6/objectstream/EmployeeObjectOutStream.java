package lesson6.objectstream;

import java.io.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * objectStream
 *
 * @author thanhson2000 phansonbs2000@gmail.com
 * @version 28/05/2024 20:09
 * @since JDK11
 */
public class EmployeeObjectOutStream {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Management management = new Management();
        int count = 0;

        while (count < 3) {
            System.out.printf("1. Cap nhat thong tin cua nhan vien moi \n2. Xoa nhan vien theo id\n");
            System.out.println("Nhap yeu cau: ");
            int i = scanner.nextInt();
            switch (i) {
                case 1:
                    System.out.println("Nhap id");
                    int id = scanner.nextInt();

                    System.out.println("Nhap ten");
                    String name = scanner.next();

                    System.out.println("Nhap tuoi");
                    int age = scanner.nextInt();

                    System.out.println("Nhap luong");
                    float salary = scanner.nextFloat();

                    management.updateInfo(id, name, age, salary);
                    break;
                case 2:
                    System.out.println("Nhap id can xoa");
                    int deleteId = scanner.nextInt();
                    management.deleteEmployee(deleteId);
                    break;
            }
            count++;
        }

        try {
            OutputStream outputStream = new FileOutputStream("/Users/thanhsonphan/Downloads/Employees.dat");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(management.employees);
            objectOutputStream.flush();
            objectOutputStream.close();
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
