package lesson4.throwable.practice_atm_v2;

/**
 * thong tin cu the cua ng dungf
 *
 * @author thanhson2000 phansonbs2000@gmail.com
 * @version 16/05/2024 22:43
 * @since JDK11
 */
public abstract class UserInfo {

    abstract Boolean testLogin(String id, String password);
    abstract Boolean testWithDraw(String id, double expectedWithDraw);

    abstract String getName(String id);
}
