package ua.opnu;

import java.util.ArrayList;

public class Student {
    private final String name;
    private final int year; // від 1 до 4
    private final ArrayList<String> courses;

    public Student(String name, int year) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        if (year < 1 || year > 4) {
            throw new IllegalArgumentException("Year must be between 1 and 4");
        }
        this.name = name;
        this.year = year;
        this.courses = new ArrayList<>();
    }

    public void addCourse(String courseName) {
        if (courseName == null || courseName.isEmpty()) {
            throw new IllegalArgumentException("Course name cannot be empty");
        }
        courses.add(courseName);
    }

    public void dropAll() {
        courses.clear();
    }

    public int getCourseCount() {
        return courses.size();
    }

    public String getName() {
        return name;
    }

    public int getTuition() {
        return year * 20000;
    }

    public int getYear() {
        return year;
    }

    public static void main(String[] args) {
        Student s1 = new Student("Іван Петренко", 2);

        s1.addCourse("Програмування");
        s1.addCourse("Математика");
        s1.addCourse("Операційні системи");

        System.out.println(s1.getName() + ": кількість вивчаємих дисциплін - " + s1.getCourseCount());
        System.out.println(s1.getName() + ": рік навчання - " + s1.getYear());
        System.out.println(s1.getName() + ": заплатив за навчання - " + s1.getTuition());
    }
}
