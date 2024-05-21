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
<<<<<<< HEAD
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
=======
    ArrayList<Student> studentArrayList = new ArrayList<>();
    ArrayList<Float> scoreList = new ArrayList<Float>();
    ArrayList<Integer> ageList = new ArrayList<Integer>();
    private Student currentStudent;
    public Manager(){
        Student student1 = new Student("001","Son1",20,8.5F);
        Student student2 = new Student("002","Son2",21,9.6F);
        Student student3 = new Student("003","Son3",22,7.3F);
        Student student4 = new Student("004","Son4",23,8.2F);
        Student student5 = new Student("005","Son5",24,5.8F);
        studentArrayList.add(student1);
        studentArrayList.add(student2);
        studentArrayList.add(student3);
        studentArrayList.add(student4);
        studentArrayList.add(student5);

    }

    public Student authentication(String id){
        for (Student student : studentArrayList) {
            if(student.getId().equals(id)){
                currentStudent = student;
>>>>>>> 373327ad0916bf5df125c3d9b756b73b40940419
                return student;
            }
        }
        return null;
    }

<<<<<<< HEAD
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
=======
    public void getInfo(Student student){
        System.out.println("Id: "+student.getId());
        System.out.println("Ten sinh vien : "+student.getName());
        System.out.println("Tuoi : "+student.getAge());
        System.out.println("diem trung binh"+student.getScore());
    }


    public void getInfoOfHighestScoreStudent(){
        for (Student student : studentArrayList) {
            scoreList.add(student.getScore());
            if(Collections.max(scoreList)==student.getScore()){
                getInfo(student);
            }
        }
    }

    public void getInfoOfLowestScoreStudent(){
        for (Student student : studentArrayList) {
            scoreList.add(student.getScore());
            if(Collections.min(scoreList)==student.getScore()){
                getInfo(student);
            }
        }
    }

    public void getInfoOfHighestAgeStudent(){
        for (Student student : studentArrayList) {
            ageList.add(student.getAge());
            if(Collections.max(ageList)==student.getAge()){
                getInfo(student);
            }
        }
    }

    public void getInfoOfLowestAgeStudent(){
        for (Student student : studentArrayList) {
            ageList.add(student.getAge());
            if(Collections.min(ageList)==student.getAge()){
                getInfo(student);
            }
        }
>>>>>>> 373327ad0916bf5df125c3d9b756b73b40940419
    }

}
