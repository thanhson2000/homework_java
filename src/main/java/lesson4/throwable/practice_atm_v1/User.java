package lesson4.throwable.practice_atm_v1;

/**
 * cac thong tin co ban cua nguoi dung
 *
 * @author thanhson2000 phansonbs2000@gmail.com
 * @version 16/05/2024 21:49
 * @since JDK11
 */
public abstract class User {
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password.trim();
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        if(money>0) {
            this.money = money;
        }else{
            System.out.println("So tien nhap vao phai lon hon 0");
        }
    }

    public User(String id, String password, double money){
        this.id= id;
        this.password = password;
        this.money = money;
    }
    private String id;
     private String password;
     private Double money;

     abstract Boolean testLogin(String id, String password);

     abstract Boolean testWithDraw(double expectedWithDraw);

}
