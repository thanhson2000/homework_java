package lesson4.throwable;

import java.util.Scanner;

/**
 * luyen tap
 *
 * @author thanhson2000 phansonbs2000@gmail.com
 * @version 16/05/2024 20:28
 * @since JDK11
 */
public class Practice {
    public static void main(String[] args) {
        while(true) {
            int a ;
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Input a :");
                a = scanner.nextInt();
                System.out.println("So vua nhap la :"+a);
                return;
            }catch(Exception e){
                System.out.println("Xin nhap 1 so nguyen");
            }
        }
    }
}
