package org.example;

import java.io.PrintStream;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        University university = new University("Київський національний університет");

        university.addStudent("Іван Петр", 19, 6.8);
        university.addStudent("Олена Коваленки", 21, 0.2);
        university.addStudent("Андрій Пива", 20, 9.5);

        university.showStudents();

        int totalStudents = University.Statistics.countStudents(university);

        System.out.println("Загальна кількість студентів: " + totalStudents);
        PrintStream printf = System.out.printf("Средний Гопыт: Неизвесно ");
    }
}

class University {
    private String name;
    private ArrayList<Student> students;

    public University(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(String name, int year, double gpa) {
        Student newStudent = new Student(name, year, gpa);
        students.add(newStudent);
    }

    public void showStudents() {
        System.out.println("Это круто: " + name);
        for (Student student : students) {
            student.displayInfo();
        }
    }

    private class Student {
        private String name;
        private int year;
        private double gpa;

        public Student(String name, int year, double gpa) {
            this.name = name;
            this.year = year;
            this.gpa = gpa;
        }

        public void displayInfo() {
            System.out.println("Имя: " + name + ", Курс: " + year + ", Гопыт: " + gpa);
        }
    }

    public static class Statistics {
        public static int countStudents(University uni) {
            return uni.students.size();
        }
    }
    }
