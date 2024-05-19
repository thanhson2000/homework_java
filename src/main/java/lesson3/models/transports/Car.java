package lesson3.models.transports;

/**
 * car
 *
 * @author thanhson2000 phansonbs2000@gmail.com
 * @version 14/05/2024 21:37
 * @since JDK11
 */
public class Car implements Transport, SoftWare{
    @Override
    public void turnOn() {
        System.out.println("Turn on");
    }

    @Override
    public void turnOff() {
        System.out.println("Turn off");
    }

    @Override
    public void install() {
        System.out.println("Install SoftWare");
    }

    @Override
    public void uninstall() {
        System.out.println("Uninstall Software");
    }


}
