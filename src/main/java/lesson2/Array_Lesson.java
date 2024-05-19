package lesson2;

import java.util.StringTokenizer;

/**
 * hoc ve array chuoi
 *
 * @author thanhson2000 phansonbs2000@gmail.com
 * @version 07/05/2024 19:47
 * @since JDK11
 */
public class Array_Lesson {

    static void stringTokenizer1(String str1){
        StringTokenizer strToken1 = new StringTokenizer(str1);
        while(strToken1.hasMoreTokens()){
            System.out.println(strToken1.nextToken());
        }
    }

    static void stringTokenizer2(String str){
        StringTokenizer strToken2 = new StringTokenizer(str,"/");
        while(strToken2.hasMoreTokens()){
            System.out.println(strToken2.nextToken());
        }
    }
    public static void main(String[] args) {
        String str1 = "a34era56a";
        String str2 = "qwe";
        System.out.println("str1.compareTo(str2) = " + str1.compareTo(str2));
        System.out.println("str1.replace('a','1') = " + str1.replace('a', '1'));
        System.out.println("str1.substring(2,4) = " + str1.substring(2, 4));

        /*
        StringBuilder ： sẽ dùng thay String khi dữ liệu lớn, và đồng bộ khi thao tác nhiều luồng
        StringBuffer : sẽ dùng thay String khi dữ liệu lớn, và không đồng bộ
         */
        String input = "Hello, my name is Son";
        String input1 = "Hello/,/my/name/is/Son";
        stringTokenizer2(input1);
    }
}
