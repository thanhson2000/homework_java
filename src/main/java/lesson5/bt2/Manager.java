package lesson5.bt2;

import java.util.ArrayList;
import java.util.Collections;

/**
 * chuong trinh quan ly sinh vien
 *
 * @author thanhson2000 phansonbs2000@gmail.com
 * @version 21/05/2024 21:05
 * @since JDK11
 */
public class Manager {
    private ArrayList<Student> studentArrayList = new ArrayList<>();
    private ArrayList<Float> scoreList = new ArrayList<Float>();
    private ArrayList<Integer> ageList = new ArrayList<Integer>();

    private void compiler() {
        Student[] studentList = {
                new Student("001", "Son1", 20, 8.5F),
                new Student("002", "Son2", 21, 6.4F),
                new Student("003", "Son3", 22, 7.3F),
                new Student("004", "Son4", 23, 9.5F),
                new Student("005", "Son5", 24, 5.8F)
        };
        for (Student student : studentList) {
            studentArrayList.add(student);
        }
    }

    public Manager() {
        compiler();

    }

    public Student authentication(String id) {
        for (Student student : studentArrayList) {
            if (student.getId().equals(id)) {
                return student;
            }
        }
        return null;
    }

    public void getInfo(Student student) {
        System.out.println("Id: " + student.getId());
        System.out.println("Ten sinh vien : " + student.getName());
        System.out.println("Tuoi : " + student.getAge());
        System.out.println("Diem trung binh: " + student.getScore());
    }


    public void getInfoOfHighestScoreStudent() {
        Student highestScoreStudent = null;
        for (Student student : studentArrayList) {
            scoreList.add(student.getScore());
            if (Collections.max(scoreList) == student.getScore()) {
                highestScoreStudent= student;
            }
        }
        getInfo(highestScoreStudent);
    }

    public void getInfoOfLowestScoreStudent() {
        Student lowestScoreStudent = null;
        for (Student student : studentArrayList) {
            scoreList.add(student.getScore());
            if (Collections.min(scoreList) == student.getScore()) {
                lowestScoreStudent = student;
            }
        }
        getInfo(lowestScoreStudent);
    }

    public void getInfoOfHighestAgeStudent() {
        Student highestAgeStudent = null;
        for (Student student : studentArrayList) {
            ageList.add(student.getAge());
            if (Collections.max(ageList) == student.getAge()) {
                highestAgeStudent = student;
            }
        }
        getInfo(highestAgeStudent);
    }

    public void getInfoOfLowestAgeStudent() {
        Student lowestAgeStudent = null;
        for (Student student : studentArrayList) {
            ageList.add(student.getAge());
            if (Collections.min(ageList) == student.getAge()) {
                lowestAgeStudent = student;
            }
        }
        getInfo(lowestAgeStudent);
    }

}
