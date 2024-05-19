package lesson4.throwable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * exception
 *
 * @author thanhson2000 phansonbs2000@gmail.com
 * @version 16/05/2024 20:03
 * @since JDK11
 */
public class Exception1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;
        System.out.println("Input a: ");
        a = input.nextInt();
        System.out.println("Input b: ");
        b = input.nextInt();
        try {
            System.out.println("Ket qua phep thuong: " + a / b);
            System.out.println("hahahaha");
        } catch (ArithmeticException e) {
            System.out.println("Loi chia cho 0, vui long nhap lai");
        }
        System.out.println("Ket qua phep cong: " + (a + b));
    }
}
