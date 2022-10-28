package Thuchanh2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Long", 17, "QB");
        Student student2 = new Student("Quan", 30, "DN");
        Student student3 = new Student("Nhan", 15, "Hue");

        Map<Integer, Student> studentMap = new HashMap<Integer, Student>();
        studentMap.put(1,student1);
        studentMap.put(2,student2);
        studentMap.put(3,student3);
        studentMap.put(4,student1);
        for(Map.Entry<Integer, Student> student : studentMap.entrySet()){
            System.out.println(student.toString());
        }
        System.out.println(".....SET");
        Set<Student> students = new HashSet<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student1);
        for (Student student: students) {
            System.out.println(student.toString());
        }
    }
}



