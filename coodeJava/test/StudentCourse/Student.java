/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StudentCourse;

import java.util.*;

/**
 *
 * @author Durjay
 */
public class Student {

    private String name;
    private double grade;

    ArrayList<String> courses = new ArrayList<>();

    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public double getGrade(double grade) {
        return grade;
    }

    public void addCourse(String title) {
        courses.add(title);
    }

    public void removeCourse(String title) {
        courses.remove(title);
    }

    public ArrayList<String> getCourses() {
        return courses;
    }

    public String toString() {
        return "Student name: " + name + "\nGrade: " + grade;
    }

}
