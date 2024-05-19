package lesson2;

/**
 * huong doi tuong
 *
 * @author thanhson2000 phansonbs2000@gmail.com
 * @version 07/05/2024 20:57
 * @since JDK11
 */
public class Calculator {
    public Integer add(int a, int b){
        return a+b;
    }

    public Integer sub(int a, int b){
        return a-b;
    }

    public Integer mul(int a, int b){
        return a*b;
    }

    public double div ( int a, int b){
        return a/b;
    }

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.add(1,2);
        cal.sub(1,2);
        cal.mul(1,2);
        cal.div(1,2);
    }
}
