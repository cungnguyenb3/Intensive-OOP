/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import static Main.Login.userName;
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
    
    public static void manageBook(){
        System.out.println("");
        System.out.println("--------------------------------------------");
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
            case 1: Book.viewAllBook();
                    break;
            case 2: Book.searchBook();
                    break;
            case 3: Book.addBook();
                    break;
            case 4: User.adminFrame();   
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
            if (userName.trim().equalsIgnoreCase("admin")) {
                manageBook();
            } else {
                User.userFrame();
            }
        } else if (chooseNumber == 2) {
            System.exit(0);
        }
        else{
            System.out.println("Please enter the correct number");
        }
    }
    
    public static void addBook(){
        System.out.println("");
        System.out.println("--------------------------------------------");
        int chooseNumber;
        String searchBook;
        Scanner scan = new Scanner(System.in);
        
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
        
        System.out.println("Your book already add: "+book.getName());
        listBook.add(book);
        
        System.out.println("Press 1 to continue add, press 2 to come back the main board, press 3 to exit");
        chooseNumber = scan.nextInt();
        switch (chooseNumber) {
            case 1:
                addBook();
                break;
            case 2:
                manageBook();
                break;
            case 3:
                System.exit(0);
            default:
                System.out.println("Please enter the correct number!");
                break;
        }
    }
    
    public static void searchBook(){
        System.out.println("");
        System.out.println("--------------------------------------------");
        int chooseNumber;
        String searchBook;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the book's name");
        searchBook = scan.nextLine();
        for(Book book: listBook){
            if (searchBook.trim().equalsIgnoreCase(book.getName()) ) {
                System.out.println(book.toString());
                System.out.println("Press 1 to continue search, press 2 to go back, press 3 to exit");
                chooseNumber = scan.nextInt();
                if (chooseNumber == 1) {
                    searchBook();
                }else if(chooseNumber == 2){
                    manageBook();
                }else if(chooseNumber == 3){
                    System.exit(0);
                }
                else {
                    System.out.println("Please enter the correct number!");
                }
            }else{
                System.out.println("The book is not found");
                System.out.println("Press 1 to continue search, press 2 to go back , press 3 to exit");
                chooseNumber = scan.nextInt();
                switch (chooseNumber) {
                    case 1:
                        searchBook();
                        break;
                    case 2:
                        manageBook();
                        break;
                    case 3:
                        System.exit(0);
                    default:
                        System.out.println("Please enter the correct number!");
                        break;
                }
            }
        }
    }
    
    @Override
    public String toString() {
        return "Book@[Name: " + this.getName() + ", Author: " + this.getAuthor() + ", category: "+ this.getCategory() + ", price: "+ this.getPrice() +
                ", quantity: "+ this.getQuantity() ;
    }
    
}