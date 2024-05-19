package lesson4.throwable.practice_atm_v3;

/**
 * nguoi dung 1
 *
 * @author thanhson2000 phansonbs2000@gmail.com
 * @version 18/05/2024 22:55
 * @since JDK11
 */
public class User1 extends UserBase{
    final private String ID = "001";
    final private String PASSWORD = "123456";
    final private String NAME = "SON1";
    private double currentBalance = 10_000_000.00;


    @Override
    public Boolean checkLogin(String id,String password) {
        setId(id);
        setPassword(password);
        if(getId().equals(ID) && getPassword().equals(PASSWORD)){
            return true;
        }
        return false;
    }

    @Override
    public Boolean checkWithDraw(double expectedMoney) {
        setExpectedMoney(expectedMoney);
        if(getExpectedMoney() <= currentBalance && getExpectedMoney() >0){
            currentBalance -= getExpectedMoney();
            return true;
        }
        return false;
    }

    @Override
    public String getInfo(){
        setName(NAME);
        return "Ten nguoi dung: "+getName()+", so du hien tai la: "+currentBalance;
    }
}
