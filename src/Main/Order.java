/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author cung.nguyen
 */
public class Order {
    private static final AtomicInteger count = new AtomicInteger(0);
    private int code;
    private Date date;
    private String employeeName;
    private String userName;
    private String bookName;
    private int quantity;
    private double price;
    private double totalMoney;
    

    public Order() {
    }

    public Order(Date date, String employeeName, String userName, String bookName, int quantity, double price, double totalMoney) {
        code = count.incrementAndGet();
        this.date = date;
        this.employeeName = employeeName;
        this.userName = userName;
        this.bookName = bookName;
        this.quantity = quantity;
        this.price = price;
        this.totalMoney = totalMoney;
    }

    public int getCode() {
        return code;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(double totalMoney) {
        this.totalMoney = totalMoney;
    }

    
    
    @Override
    public String toString() {
        return "Order{" +"code: "+ code + ", date=" + date + ", employeeName=" + employeeName + ", userName=" + userName + ", bookName=" + bookName + ", quantity=" + quantity + ", price=" + price + ", totalMoney=" + totalMoney + '}';
    }

    
    
    
    

    
}
