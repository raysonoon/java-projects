/* Employee class that models an employee with an ID, name & salary */

public class Employee {

    // Declare private variables
    private int id;
    private String firstName, lastName;
    private int salary, increasedSalary;

    // Constructors
    // Employee with given id, first name & last name
    public Employee(int ID, String first, String last, int pay) {
        id = ID;
        firstName = first;
        lastName = last;
        salary = pay;
    }

    // Public methods
    // returns ID
    public int getId() {
        return id;
    }

    // returns first name
    public String getFirstName() {
        return firstName;
    }

    // returns last name
    public String getLastName() {
        return lastName;
    }

    // returns full name
    public String getName() {
        return firstName + " " + lastName;
    }

    // returns salary
    public int getSalary() {
        return salary;
    }

    // set new salary
    public void setSalary(int newSalary) {
        salary = newSalary;
    }

    // returns annual salary
    public int getAnnualSalary() {
        return salary * 12;
    }

    // raise salary
    public int raiseSalary(int percent) {
        increasedSalary = salary * (100 + percent) / 100;
        salary = increasedSalary;
        return salary;
    }

    // returns string description of instance
    public String toString() {
        return "Employee[id=" + id + ",name=" + firstName + " " + lastName + ",salary=" + salary + "]";
    }
}