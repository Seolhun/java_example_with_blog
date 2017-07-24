package com.example.comparator.part2;

import com.example.comparator.Student;

import java.util.*;

public class ComparatorMain2 {
    public static void main(String[] agrs){
        String[] students = new String[]{"Ave","Steve","Jane","David","Shaw","Rooney","Ronaldo","Trial",};
        List<Student> studentsList = new ArrayList<>();

        for (int i = 0; i <students.length; i++) {
            studentsList.add(new Student((int)(Math.random()*100), students[i]));
        }

        Collections.sort(studentsList);
        System.out.println("----- No 기준 ----");
        for (Student tempStudent: studentsList) {
            System.out.println(tempStudent.toString());
        }


        Collections.sort(studentsList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println("----- Name 기준 ----");
        for (Student tempStudent: studentsList) {
            System.out.println(tempStudent.toString());
        }
    }
}