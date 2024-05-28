package lesson6.objectstream;

import java.util.ArrayList;

/**
 * class chuc nang
 *
 * @author thanhson2000 phansonbs2000@gmail.com
 * @version 28/05/2024 20:34
 * @since JDK11
 */
public class Management {
    public ArrayList<Employee> employees = new ArrayList<>();

    public ArrayList<Employee> updateInfo(int id, String name, int age, float salary){
        Employee employee = new Employee(id,name,age,salary);
        employees.add(employee);
        return employees;
    }
    
    public Employee findById(int id){
        for (Employee employee : employees) {
            if (id == employee.getId()){
                 return employee;
            }
        }
        return null;
    }


    public ArrayList<Employee> deleteEmployee(int id){
        for (Employee employee : employees) {
            if(id == employee.getId()){
                employees.remove(employee);
            }
        }
        return employees;
    }

}
