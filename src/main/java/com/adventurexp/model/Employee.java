package com.adventurexp.model;

public class Employee {

    private int employeeId;
    private String name;
    private int phoneNumber;
    private String email;

    public Employee() {
    }

    public Employee(int employeeId,
                    String name,
                    int phoneNumber,
                    String email) {

        this.employeeId = employeeId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}