package lesson3.models;


/**
 * macbook
 *
 * @author thanhson2000 phansonbs2000@gmail.com
 * @version 14/05/2024 20:24
 * @since JDK11
 */
public class Macbook extends ABComputer {
//    public Macbook(String name, String model, int price,String color){
//        super(name,model,price,color);
//    }

    @Override
    public void turnOnComputer() {
        System.out.println("Turn on computer");
    }
}
