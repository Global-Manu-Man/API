package com.example.modelo;

import javax.persistence.*;

@Entity
@Table
@Access(AccessType.FIELD)
public class User  extends ParetEntity{
    private static final long serialVersionUID = -5865616151308758783L;

    @Column(name = "first_name", nullable = false, length = 255)
    private String firstname;

    @Column(name = "first_surname", nullable = false, length = 255)
    private String firstsurname;

    @Column(name = "second_surname", nullable = true, length = 255)
    private String secondsurname;

    @Column(name = "phone", nullable = true, length = 255)
    private String phone;

    @Column(name = "address", nullable = false, length = 255)
    private String address;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getFirstsurname() {
        return firstsurname;
    }

    public void setFirstsurname(String firstsurname) {
        this.firstsurname = firstsurname;
    }

    public String getSecondsurname() {
        return secondsurname;
    }

    public void setSecondsurname(String secondsurname) {
        this.secondsurname = secondsurname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstname='" + firstname + '\'' +
                ", firstsurname='" + firstsurname + '\'' +
                ", secondsurname='" + secondsurname + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

}
