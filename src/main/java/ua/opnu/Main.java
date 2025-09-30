package ua.opnu;

public class Main {
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
