package lesson3.models.practices;

/**
 * leader
 *
 * @author thanhson2000 phansonbs2000@gmail.com
 * @version 14/05/2024 20:59
 * @since JDK11
 */
public abstract class Leader {
    /*
    abstract class gom nhung phuong thuc abstract hoac nhung phuong thuc binh thuong
     */
    abstract float baoCaoTienDo();
    void tienDo(){
        System.out.println("Tien do la :"+baoCaoTienDo());
    }
}
