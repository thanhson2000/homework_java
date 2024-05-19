package lesson4.throwable.practice_atm_v1;

/**
 * thong tin khach hang
 *
 * @author thanhson2000 phansonbs2000@gmail.com
 * @version 16/05/2024 21:04
 * @since JDK11
 */
public class User1 extends User{
    private final String ID = "001";
    private final String PASSWORD = "123456";
    double balance = 10_000_000;

    public User1(String id, String password, double money) {
        super(id, password, money);
    }

    private String welcome(){
        return "Welcome";
    }

    @Override
    Boolean testLogin(String id, String password) {
        if(getId().equals(ID) && getPassword().equals(PASSWORD)){
            System.out.println(welcome());
            return true;
        }
        return false;
    }

    @Override
    Boolean testWithDraw(double expectedWithDraw) {
        if (expectedWithDraw<balance){
            balance -= expectedWithDraw;
            return true;
        }
        return false;
    }
}
