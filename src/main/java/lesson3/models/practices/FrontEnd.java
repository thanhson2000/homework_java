package lesson3.models.practices;

/**
 * frontend
 *
 * @author thanhson2000 phansonbs2000@gmail.com
 * @version 14/05/2024 21:01
 * @since JDK11
 */
public class FrontEnd {
    public void vietBaoCao(Leader leader){
        leader.baoCaoTienDo();
    }

    public static void main(String[] args) {
        FrontEnd frontEnd = new FrontEnd();
        frontEnd.vietBaoCao(new Leader() {
            @Override
            float baoCaoTienDo() {
               return (float)55.50;
            }
        });
    }
}
