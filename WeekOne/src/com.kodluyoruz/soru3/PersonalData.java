package com.kodluyoruz.soru3;

import java.time.LocalDate;

public class PersonalData {

    public PersonalData(LocalDate birthDate, long ssn) {
        this.birthDate = birthDate;
        this.ssn = ssn;
    }

    public PersonalData(int year, int month, int day, long ssn) {
        this.birthDate = LocalDate.of(year, month, day);
        this.ssn = ssn;
    }

    public LocalDate birthDate;
    public String address;
    public long ssn;


    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getAddress() {
        return address;
    }

    public long getSSN() {
        return ssn;
    }

    public void setAddress(String address1) {
        this.address = address1;
    }

}

