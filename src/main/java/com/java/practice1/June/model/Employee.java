package com.java.practice1.June.model;

public class Employee {
    int id;
    String name;
    String department;
    String designation;
    double salary;
    String email;
    String phoneNumber;
    String address;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    Employee(int id, String name, String department, String designation, double salary, String email, String phoneNumber, String address) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.designation = designation;
        this.salary = salary;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }
    /**
     * get field
     *
     * @return id
     */
    public int getId() {
        return this.id;
    }

    /**
     * set field
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * get field
     *
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * set field
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get field
     *
     * @return department
     */
    public String getDepartment() {
        return this.department;
    }

    /**
     * set field
     *
     * @param department
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * get field
     *
     * @return designation
     */
    public String getDesignation() {
        return this.designation;
    }

    /**
     * set field
     *
     * @param designation
     */
    public void setDesignation(String designation) {
        this.designation = designation;
    }

    /**
     * get field
     *
     * @return salary
     */
    public double getSalary() {
        return this.salary;
    }

    /**
     * set field
     *
     * @param salary
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * get field
     *
     * @return email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * set field
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * get field
     *
     * @return phoneNumber
     */
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * set field
     *
     * @param phoneNumber
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * get field
     *
     * @return address
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * set field
     *
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }
}
