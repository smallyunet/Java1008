package com.ychs168.java.lesson;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class StudentDisplay {
    public static void main(String[] args) {
        Student s1 = new Student("1001","wy",98);
        Student s2 = new Student("1002","hp",100);
        Student s3 = new Student("1003","lh",99);
        List<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        for (Student s : studentList) {
            System.out.println(s);
        }
    }
}

class Student implements Serializable {
    String studentId;
    String studentName;
    int score;

    public Student() {

    }

    public Student(String studentId, String studentName, int score) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.score = score;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", studentName='" + studentName + '\'' +
                ", score=" + score +
                '}';
    }
}
