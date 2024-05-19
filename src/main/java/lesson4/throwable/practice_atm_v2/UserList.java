package lesson4.throwable.practice_atm_v2;

import java.util.*;

/**
 * danh sach thong tin khach hang
 *
 * @author thanhson2000 phansonbs2000@gmail.com
 * @version 16/05/2024 23:46
 * @since JDK11
 */
public class UserList extends UserInfo{
    @Override
    public Boolean testLogin(String id, String password) {
        Map<String,String> idPassword = new LinkedHashMap<>();
        idPassword.put("001","123456");
        idPassword.put("002","1234567");
        if(idPassword.containsKey(id)){
            if(password.equals(idPassword.get(id))){
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public Boolean testWithDraw(String id, double expectedWithDraw) {
        Map<String,Double> idBalance = new LinkedHashMap<>();
        idBalance.put("001",10000000.0);
        idBalance.put("002",5000000.0);


        if(idBalance.containsKey(id)){
            double lastestBalance = idBalance.get(id);
            if(expectedWithDraw<idBalance.get(id)){
                System.out.println("Rut tien thanh cong!");
                idBalance.put(id,lastestBalance-expectedWithDraw);
                System.out.println("So du tai khoan: "+idBalance.get(id));
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public String getName(String id){
        Map<String,String> idName = new LinkedHashMap<>();
        idName.put("001","Son");
        idName.put("002","Quynh");
        if(idName.containsKey(id)){
            return idName.get(id);
        }
        return null;
    }


    /*
    public static void main(String[] args) {
        Map<String,String> idPassword = new LinkedHashMap<>();
        idPassword.put("001","123456");
        idPassword.put("002","1234567");

        Map<String,String> idName = new LinkedHashMap<>();
        idName.put("001","Son");
        idName.put("002","Quynh");

        Map<String,Double> idBalance = new LinkedHashMap<>();
        idBalance.put("001",10_000_000.0);
        idBalance.put("002",5_000_000.0);

    }

     */



}
