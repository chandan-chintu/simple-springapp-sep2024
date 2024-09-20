package com.firstspringapp.demo.simple_springapp.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {

    private int empid;
    private String name;
    private String email;
    private Address address;

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    @Autowired
    public void setAddress(Address address) {
        this.address = address;
    }

    public Employee(){

    }
    public Employee(int empid, String name, String email, Address address) {
        this.empid = empid;
        this.name = name;
        this.email = email;
        this.address = address;
    }
}
