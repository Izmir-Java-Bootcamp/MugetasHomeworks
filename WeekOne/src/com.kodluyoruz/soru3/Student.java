package com.kodluyoruz.soru3;

public class Student {

    public String name;
    public Long id;
    public Double gpa;
    public PersonalData pd;

    public Student(String name, long id, double gpa, PersonalData pd) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
        this.pd = pd;

    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;

    }

    public Double getGpa() {
        return gpa;

    }

    public PersonalData getPd() {
        return pd;

    }

    public String toString() {
 return name + id + gpa;

    }
}
