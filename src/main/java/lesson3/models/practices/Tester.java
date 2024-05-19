package lesson3.models.practices;

/**
 * tester
 *
 * @author thanhson2000 phansonbs2000@gmail.com
 * @version 14/05/2024 20:58
 * @since JDK11
 */
public class Tester {
    public void vietBaoCao(Leader leader){
        leader.baoCaoTienDo();
    }

    public static void main(String[] args) {
        Tester tester = new Tester();
        tester.vietBaoCao(new Leader() {
            @Override
            float baoCaoTienDo() {
                return (float)40.5;
            }
        });
    }
}
