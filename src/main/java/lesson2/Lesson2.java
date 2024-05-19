package lesson2;

import java.util.Scanner;

/**
 * tiet 2
 *
 * @author thanhson2000
 * @version 22/04/2024 21:18
 * @since JDK11
 */
public class Lesson2 {
    public boolean isSoNguyenTo(int input){
        if(input == 0 || input == 1){
            return false;
        }
        for( int i = 2; i < Math.sqrt(input);i++){
            if(input %i == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean isSoHoanHao(int input){
        if(input == 0 || input ==1){
            return false;
        }
        int sumOfDivisions = 1;
        for (int i = 2; i <= Math.sqrt(input) ; i++) {
            if( input % i == 0){
                sumOfDivisions += i;
                if (i != input / i){
                    sumOfDivisions += input/i;
                }
            }
        }

        return sumOfDivisions==2*input;
    }

    public static void main(String[] args) {
        Lesson2 ls = new Lesson2();
        Scanner input = new Scanner(System.in);
        System.out.print("Xin vui long nhap so duong : ");
        int a = input.nextInt();

        String resultSHH = ls.isSoHoanHao(a) ? "la so hoan hao" : "khong phai so hoan hao";
        String resutlSNT = ls.isSoNguyenTo(a) ? "la so nguyen to" : "khong phai so nguyen to";

        System.out.println(resultSHH);
        System.out.println(resutlSNT);
    }
}
