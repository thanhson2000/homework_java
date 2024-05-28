package lesson6.objectstream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * objectInputStream
 *
 * @author thanhson2000 phansonbs2000@gmail.com
 * @version 28/05/2024 20:20
 * @since JDK11
 */
public class EmployeeObjectInputStream {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            InputStream inputStream = new FileInputStream("/Users/thanhsonphan/Downloads/Employees.dat");
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            ArrayList<Employee> employees = (ArrayList) objectInputStream.readObject();
            System.out.println("Nhap yeu cau: ");
            int i = scanner.nextInt();
            switch (i){
                case 1:
                    System.out.println("Nhap ten can tim");
                    String name = scanner.next();
                    for (Employee employee : employees) {
                        if (employee.getName().equals(name)){
                            System.out.println(employee.getId()+" "+employee.getName()+" "+employee.getAge()+" "+employee.getSalary());
                        }
                    }
                    break;
                case 2:
                    for (Employee employee : employees) {
                        System.out.println(employee.getId()+" "+employee.getName()+" "+employee.getAge()+" "+employee.getSalary());
                    }
                    break;
            }


            objectInputStream.close();
            inputStream.close();
        }catch(IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
