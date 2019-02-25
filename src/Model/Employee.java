/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author thuy.cao
 */
public class Employee extends Person{
    private String position;
    private int salary;

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee(){
        
    }
    public Employee(String position, int salary) {
        this.position = position;
        this.salary = salary;
    }

    public Employee( String name, int age, double phone, String address, double acountNumber, String position, int salary) {
        super(name, age, phone, address, acountNumber);
        this.position = position;
        this.salary = salary;
    }

    @Override
    public void Add() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Update() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Delete() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String toString() {
        return "User@[Name: " + this.getName() + ", age: " + this.getAge() + ", phone: "+ this.getPhone() + ", address: "+ this.getAddress() +
                ", acountNumber: "+ this.getAccountNumber() + "]" + ", position: "+ this.getPosition() + ", salary: "+ this.getSalary();
    }
}