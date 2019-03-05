/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.Date;

/**
 *
 * @author cung.nguyen
 */
public class Order {
    private int code;
    private Date date;
    private Employee employee;
    private User user;
    private double totalMoney;
    private Book book;

    public Order() {
    }

    public Order( Date date, Employee employee, User user, double totalMoney, Book book) {
        this.date = date;
        this.employee = employee;
        this.user = user;
        this.totalMoney = totalMoney;
        this.book = book;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
    
   

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(double totalMoney) {
        this.totalMoney = totalMoney;
    }

    public void buyBook(Book book,Employee employee,User user){
    
    }
    
    @Override
    public String toString() {
        return "Order{" + "code=" + code + ", date=" + date + ", employee=" + employee + ", user=" + user + ", totalMoney=" + totalMoney + '}';
    }
    
}
