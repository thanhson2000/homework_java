package lesson5.bt2;

/**
 * thong tin sinh vien
 *
 * @author thanhson2000 phansonbs2000@gmail.com
 * @version 21/05/2024 21:03
 * @since JDK11
 */
public class Student {
    public Student(String id, String name, int age, float score){
        this.id = id;
        this.name = name;
        this.age = age;
        this.score = score;
    }
    private String id;
    private String name;
    private int age;
    private float score;

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }
}
