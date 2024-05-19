package lesson4.throwable.practice_atm_v3;

/**
 * thong tin co ban cua khach hang
 *
 * @author thanhson2000 phansonbs2000@gmail.com
 * @version 18/05/2024 22:37
 * @since JDK11
 */
public abstract class UserBase {
    private String id;
    private String name;
    private String password;
    private double expectedMoney;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if(id.equals(null) || id.length() == 0){
            System.out.println("Id khong duoc de trong");
            this.id = null;
        }
        this.id = id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.equals(null) || name.length() == 0){
            System.out.println("Ten tai khoan khong duoc de trong");
            this.name = null;
        }
        this.name = name.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(password.equals(null) || password.length() ==0){
            System.out.println("Mat khau khong duoc de trong");
            this.password = null;
        }
        this.password = password;
    }

    public double getExpectedMoney() {
        return expectedMoney;
    }

    public void setExpectedMoney(double expectedMoney) {
        if(expectedMoney<=0){
            System.out.println("So tien can rut phai lon hon 0");
        }
        this.expectedMoney = expectedMoney;
    }

    public abstract Boolean checkLogin(String id,String password);

    public abstract Boolean checkWithDraw(double expectedMoney);

    abstract public String getInfo();
}

