package lesson3.models.practices;

/**
 * backend
 *
 * @author thanhson2000 phansonbs2000@gmail.com
 * @version 14/05/2024 21:05
 * @since JDK11
 */
public class BackEnd {
    public void vietBaoCao(Leader leader){
        leader.baoCaoTienDo();
    }

    public static void main(String[] args) {
        BackEnd backEnd = new BackEnd();
        backEnd.vietBaoCao(new Leader() {
            @Override
            float baoCaoTienDo() {
                return 30/100;
            }
        });
    }
}
