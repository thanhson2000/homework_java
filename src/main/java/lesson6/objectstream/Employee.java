package lesson6.objectstream;

import java.io.Serializable;

/**
 * employee
 *
 * @author thanhson2000 phansonbs2000@gmail.com
 * @version 28/05/2024 20:07
 * @since JDK11
 */
public class Employee implements Serializable {
    public Employee(int id, String name, int age, float salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public Employee(){}

    private int id;
    private String name;
    private int age;
    private float salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}
