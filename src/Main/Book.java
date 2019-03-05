/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import static Main.Login.isUser;
import Main.User;

import java.util.ArrayList;
import java.util.Scanner;

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
   
    public Book(){}
    
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
    
    public static ArrayList<Book> listBook = new ArrayList<Book>();
    public static ArrayList<Book> listBuyBook = new ArrayList<Book>();
    
    public void manageBook(){
        System.out.println("");
        System.out.println("--------------------------------------------");
        
        Book bookDefault = new Book();
        User userDefault = new User();
        
        int chooseNumber;
        System.out.println("---Manage User---");
        System.out.println("1. View all book");
        System.out.println("2. Search");
        System.out.println("3. Add book");
        System.out.println("4. Come back the admin frame");
        System.out.println("5. Exit");
        Scanner scan = new Scanner(System.in);
        chooseNumber = scan.nextInt();
        switch (chooseNumber){
            case 1: bookDefault.viewAllBook();
                    break;
            case 2: bookDefault.searchBook();
                    break;
            case 3: bookDefault.addBook();
                    break;
            case 4: userDefault.adminFrame();   
                    break;
            case 5: System.exit(0);
                    break;
            default:
                    System.out.println("Please choose the correct number");
        }
    }
    
    public static void viewAllBook(){
        System.out.println("");
        System.out.println("--------------------------------------------");
        
        Book bookDefault = new Book();
        User userDefault = new User();
        
        int chooseNumber;
        System.out.println("This is the list book");
        for (Book book : listBook) {
            System.out.println(book.toString());
        }
        System.out.println("");
        System.out.println("Press 1 to go back, press 2 to exit");
        Scanner scan = new Scanner(System.in);
        chooseNumber = scan.nextInt();
        if (chooseNumber == 1) {
            if (isUser == 1) {
                bookDefault.manageBook();
            } else if(isUser == 0) {
                userDefault.userFrame();
            }
        } else if (chooseNumber == 2) {
            System.exit(0);
        }
        else{
            System.out.println("Please enter the correct number");
        }
    }
    
    public void addBook(){
        System.out.println("");
        System.out.println("--------------------------------------------");
        int chooseNumber;
        String searchBook;
        Scanner scan = new Scanner(System.in);
        
        Book bookDefault = new Book();
        
        String name;
        String category;
        Author author;
        double price;
        int quantity;

        System.out.println("************Add Book Form*************");
        System.out.println("Enter book's name:");
        name = scan.nextLine();
        System.out.println("Plese input the author:");
        author = Author.addAuthor();
        System.out.println("Enter book's category:");
        category = scan.nextLine();
        System.out.println("Enter book's price:");
        price = scan.nextDouble();
        System.out.println("Enter book's quantity:");
        quantity = scan.nextInt();
        
        Book book = new Book(name, author, category, price, quantity);
        
        System.out.println("Your book already add: " + book.getName());
        listBook.add(book);
        
        System.out.println("Press 1 to continue add, press 2 to come back the main board, press 3 to exit");
        chooseNumber = scan.nextInt();
        switch (chooseNumber) {
            case 1:
                addBook();
                break;
            case 2:
                bookDefault.manageBook();
                break;
            case 3:
                System.exit(0);
            default:
                System.out.println("Please enter the correct number!");
                break;
        }
    }
    
    public void searchBook(){
        System.out.println("");
        System.out.println("--------------------------------------------");
        
        Book bookDefault = new Book();
        User userDefault = new User();
        
        int flag = 0;
        int chooseNumber;
        String searchNameBook;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the book's name");
        searchNameBook = scan.nextLine();
        for (Book book: listBook) {
            if(book.getName() != null && book.getName().contains(searchNameBook)) {
                System.out.println(book.toString());
                
                if (isUser == 1) {
                    System.out.println("Press 1 to continue search, press 2 to update this book, press 3 to delete this book, "
                        + "press 4 to go back the user board, press 5 to exit");
                    chooseNumber = scan.nextInt();
                    switch (chooseNumber) {
                        case 1:
                            searchBook();
                            break;
                        case 2:
                            book.updateBook(book);
                            break;
                        case 3:
                            listBook.remove(book);
                            bookDefault.viewAllBook();
                            break;
                        case 4:
                            bookDefault.manageBook();
                            break;
                        case 5:
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Please enter the correct number!");
                            break;
                    }
                }else if(isUser == 0){
                    System.out.println("Press 1 to continue search, press 2 to buy this book"
                        + "press 3 to go back the user board, press 4 to exit");
                    chooseNumber = scan.nextInt();
                    switch (chooseNumber) {
                        case 1:
                            searchBook();
                            break;
                        case 2:
                            Order order = new Order(2-3-2018;);
                            break;
                        case 3:
                            userDefault.userFrame();
                            break;
                        case 4:
                            System.exit(0);
                        default:
                            System.out.println("Please enter the correct number!");
                            break;
                    }
                }
                
            }else{
                flag = 0;
            }
        }
        if (flag == 1) {
            bookDefault.searchBack();
        }else{
            System.out.println("The book is not found");
            bookDefault.searchBack();
        }
    }
    
    public void searchBack(){
        int chooseNumber;
        
        Book bookDefault = new Book();
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Press 1 to continue search, press 2 to come back the main board, press 3 to exit");
        chooseNumber = scan.nextInt();
        switch (chooseNumber) {
            case 1:
                searchBook();
                break;
            case 2:
                bookDefault.manageBook();
                break;
            case 3:
                System.exit(0);
            default:
                System.out.println("Please enter the correct number!");
                break;
        }  
    }
    
        public void updateBook(Book book){
        
        int chooseNumber;
        String name;
        String category;
        Author author;
        double price;
        int quantity;

        Scanner scan = new Scanner(System.in);
        System.out.println("************Update Book Form*************");
        System.out.println("Enter book's name:");
        name = scan.nextLine();
        System.out.println("Plese input the author:");
        author = Author.addAuthor();
        System.out.println("Enter book's category:");
        category = scan.nextLine();
        System.out.println("Enter book's price:");
        price = scan.nextDouble();
        System.out.println("Enter book's quantity:");
        quantity = scan.nextInt();
  
        book.setName(name);
        book.setCategory(category);
        book.setPrice(price);
        book.setQuantity(quantity);        
        
        System.out.println("Update success!");
        System.out.println("Press 1 to update again, press 2 to comeback main frame,press 3 to view all book, press 4 to exit");
        chooseNumber = scan.nextInt();
        switch (chooseNumber){
            case 1: updateBook(book);
                    break;
            case 2: manageBook();
                    break;
            case 3: viewAllBook();
                    break;
            case 4: System.exit(0);
                    break;
            default:
                    System.out.println("Please choose the correct number");
        }  
    }

    public void buyBook(Book book, User user){
    }
    
    @Override
    public String toString() {
        return "Book@[Name: " + this.getName() + ", Author: " + this.getAuthor() + ", category: "+ this.getCategory() + ", price: "+ this.getPrice() +
                ", quantity: "+ this.getQuantity() ;
    }
    
}