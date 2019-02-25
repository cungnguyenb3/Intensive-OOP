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
public class User extends Person{
    private String username;
    private String password;
    private int isAdmin;

    public User(){
    }
    public User(String username, String password, int isAdmin) {
        this.username = username;
        this.password = password;
        this.isAdmin = isAdmin;
    }

    public User(String username, String password, int isAdmin, String code, String name, int age, double phone, String address, double acountNumber) {
        super(code, name, age, phone, address, acountNumber);
        this.username = username;
        this.password = password;
        this.isAdmin = isAdmin;
    }
    public User(String name, int age, double phone, String address, String username, String password) {
        super(name, age, phone, address);
        this.username = username;
        this.password = password;
        this.isAdmin = 0;
    }
    

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(int isAdmin) {
        this.isAdmin = isAdmin;
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
                ", username: "+ this.getUsername() + "]" + ", password: "+ this.getPassword();
    }

    
}