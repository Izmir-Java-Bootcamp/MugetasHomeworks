package com.kodluyoruz.soru3;

import java.time.LocalDate;

public class Course {

    public String name;
    public Student[] students;
    public int capacity;
    public int numberOfStudent;

    public Course(String name) {
        this.name = name;
        this.capacity = 40;
    }

    public Course(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public int getNumberOfStudents() {
        return numberOfStudent;
    }

    public String getCourseName() {
        return name;
    }

    public Student[] getStudents() {
        return students;
    }

    public boolean addStudent(Student student) {
        return false;
    }

    public boolean dropStudent(Student student) {
        return false;
    }

    public void increaseCapacity() {
        this.capacity = this.capacity + 5;
    }

    public Student getBestStudent() {
      Student bestStudent= students[0];

       for (Student student: students){
           if (bestStudent.gpa.compareTo(student.gpa)<0){
               bestStudent=student;
           }

       }

        return bestStudent;
    }

    public Student getYoungestStudent() {

        Student youngest = students[0];

        for (Student student : students) {

            if (youngest.pd.birthDate.compareTo(student.pd.getBirthDate()) > 0) {
                youngest = student;
            }
        }

        return youngest;
    }

    public void clear() {

    }

    public void list() {

    }

    public String toString() {

        String ids = "";

        for (Student student : students) {
            ids = ids + student.id + ",";
        }
        return name + numberOfStudent + ids;
    }

}

