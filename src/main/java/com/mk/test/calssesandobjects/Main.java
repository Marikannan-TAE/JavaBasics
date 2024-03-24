package com.mk.test.calssesandobjects;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n*** In PrintDetails() ***");
        Employee e1 = new Employee("MKM",8.0,500000);
        System.out.println("Name (e1): " +e1.getName());
        System.out.println("Experience (e1) :"+e1.getExperience());

        Employee e2 = new Employee("KKM",7.0,350000);

          /* Student allice = new Student();
        System.out.println("Student object (Alice):"+allice);
        System.out.println("Student object (Alice):"+allice.getClass());

        Student bob = new Student();
        System.out.println("Student object (Bob):"+bob);
        System.out.println("Student object (Bob):"+bob.getClass());

        System.out.println("allice equals Bob):"+allice.equals(bob));*/


        /*System.out.println("\n*** In PrintDetails() ***");
        System.out.println("Name (e2): " +e2.getName());
        System.out.println("Experience (e2) :"+e2.getExperience());
        System.out.println("Salary of (e2) :"+e2.getSalary());*/


        /*Updating value by setters*/
            /*e2.setName("Marikannan");
            e2.setExperience(7.3);
            e2.setSalary(380000.00);*/

        /*Using method to update value - Inside the method we used setters to update*/
        e2.updateEmployeeDetails("MK",9.3,3800000);
        e2.printDetail();

        Employee e3 = new Employee("Eula",6,2600000);
        String name = e3.getName();
        double experience = e3.getExperience();
        double salary = e3.getSalary();
        System.out.format("***Name: %s, Experience:%.1f, Salary: %.2f",name,experience,salary);
    }
}
