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
public class Book {
    private String code;
    private String name;
    private String category;
    private double price;
    private int quantity;
    private Author author;
   

    public Book(String code, String name, String category, double price, int quantity, Author author) {
        this.code = code;
        this.name = name;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
        this.author = author;
        
    }
    
    public Book( String name, Author author, String category, double price, int quantity) {
        this.name = name;
        this.author = author;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    
    public void add(){}
    public void update(){}
    public void delete(){}
    
    @Override
    public String toString() {
        return "Book@[Name: " + this.getName() + ", Author: " + this.getAuthor() + ", category: "+ this.getCategory() + ", price: "+ this.getPrice() +
                ", quantity: "+ this.getQuantity() ;
    }
    
}