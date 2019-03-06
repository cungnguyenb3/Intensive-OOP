/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author thuy.cao
 */
abstract public class Person {
    int code;
    protected String name;
    protected int age;
    protected double phone;
    protected String address;
    protected double accountNumber;
    
public Person(){
}
public Person(int code,String name,int age,double phone,String address,double acountNumber){
    this.code = code;
    this.name = name;
    this.age = age;
    this.phone = phone;
    this.address = address;
    this.accountNumber = accountNumber;
}

public Person(String name,int age,double phone,String address,double acountNumber){
    this.name = name;
    this.age = age;
    this.phone = phone;
    this.address = address;
    this.accountNumber = accountNumber;
}

public Person(String name,int age,double phone,String address){
    this.name = name;
    this.age = age;
    this.phone = phone;
    this.address = address;
}

public void setCode(int code){
    this.code = code;
    
}
public int getCode(){
    return code;
}
public void setName(String name){
    this.name = name;
    
}
public String getName(){
    return name;
}
public void setPhone(double phone){
    this.phone = phone;
    
}
public double getPhone(){
    return phone;
}
public void setAge(int age){
    this.code = code;
    
}
public int getAge(){
    return age;
}
public void setAddress(String address){
    this.address = address;
    
}
public String getAddress(){
    return address;
}
public void setAccountNumber(double accountNumber){
    this.accountNumber = accountNumber;
    
}
public double getAccountNumber(){
    return accountNumber;
}

public abstract String toString();
}