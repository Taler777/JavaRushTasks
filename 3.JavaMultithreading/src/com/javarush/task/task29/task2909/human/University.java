package com.javarush.task.task29.task2909.human;

import java.util.ArrayList;
import java.util.List;

public class University {
    private List<Student> students = new ArrayList<Student>();
    private String name;
    private int age;
    private String university;

    public University(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student getStudentWithAverageGrade(double averageGrade) {
        for (Student student : students) {
            if (student.getAverageGrade() == averageGrade) return student;
        }
        return null;
    }

    public Student getStudentWithMaxAverageGrade() {
        Student student = null;
        double maxAverageGrade = 0.0;
        for (Student currentStudent : students) {
            if (currentStudent.getAverageGrade() > maxAverageGrade) {
                student = currentStudent;
                maxAverageGrade = currentStudent.getAverageGrade();
            }
        }
        return student;
    }
/*
6.4. Разделение запроса и модификатора. Раздели метод getStudentWithMinAverageGradeAndExpel
 на Student getStudentWithMinAverageGrade() и void expel(Student student).
 Первый метод должен возвратить студента с минимальным средним балом,
а второй - отчислить переданного студента (удалять из списка students).
 */
    public Student getStudentWithMinAverageGrade() {
        Student student = null;
        double minAverageGrade = 1000.0;
        for (Student currentStudent : students) {
            if (currentStudent.getAverageGrade() < minAverageGrade) {
                student = currentStudent;
                minAverageGrade = currentStudent.getAverageGrade();
            }
        }
        return student;
    }

    public void expel(Student student){
        students.remove(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
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
}