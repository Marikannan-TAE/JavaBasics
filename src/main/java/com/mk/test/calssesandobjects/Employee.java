package com.mk.test.calssesandobjects;

public class Employee {

    private String name ="";
    private double experience =0.0;
    private double salary = 0.0;

    public  Employee(String name,double experience, double salary)
    {
        this.name = name;
        this.experience = experience;
        this.salary = salary;
    }

    public void printDetail()
    {
        System.out.println("\n*** In PrintDetails() ***");
        System.out.println("Name: " +name+" Year of Experience: "+experience+ "  Salary: "+salary);
        return;
    }

    public String getName() {
        return name;
    }

    public double getExperience() {
        return experience;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void updateEmployeeDetails(String name, double experience,double salary)
    {
        this.setName(name);
        this.setExperience(experience);
        this.setSalary(salary);
    }
}
