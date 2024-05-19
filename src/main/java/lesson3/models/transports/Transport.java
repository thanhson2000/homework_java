package lesson3.models.transports;

/**
 * phuong tien giao thong
 *
 * @author thanhson2000 phansonbs2000@gmail.com
 * @version 14/05/2024 21:25
 * @since JDK11
 */
public interface Transport {
    /*
    interface chỉ có thể khai báo phương thức public abstract, hoặc các phương thức hằng final.
     */
    public void turnOn();
    public void turnOff();
}
