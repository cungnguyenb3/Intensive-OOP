/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.util.Scanner;
import java.util.*;


/**
 *
 * @author cung.nguyen
 */
public class Main {
    public static String userName;
    public static String password;
    
    public static ArrayList<User> listUser = new ArrayList<User>();
    public static ArrayList<Author> listAuthor = new ArrayList<Author>();
    public static ArrayList<Book> listBook = new ArrayList<Book>();
    public static ArrayList<Employee> listEmployee = new ArrayList<Employee>();
    
    public static void main(String[] args) {
        mainFrame();
    }
    public static void mainFrame(){
        int chooseNumber;
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Have you had User? Press 1 to login, press 2 to register!");
        chooseNumber = scan.nextInt();
        if (chooseNumber == 1) {
            loginForm();
        }
        else if(chooseNumber == 2) { 
            registerForm();   
        }
    }
    
    public static void loginForm(){
        System.out.println("");
        System.out.println("--------------------------------------------");
        
        int chooseNumber;
        Scanner scan = new Scanner(System.in);
        System.out.println("Online Book Sale");
        System.out.println("*********************");
        System.out.println("************Login Form*************");
        System.out.println("Enter Username");
        userName = scan.nextLine();
        System.out.println("Enter Password");
        password = scan.nextLine();

//      for(User user: listUser){
            if(userName.trim().equalsIgnoreCase("username") && password.trim().equalsIgnoreCase("password")){
                userFrame();     
            } else if(userName.trim().equalsIgnoreCase("admin") && password.trim().equalsIgnoreCase("password")){
                adminFrame();
            } else {
                System.out.println("Your accout is not corect!");
                System.out.println("Press 1 to login again, press 2 to comeback main frame, press 3 to exit");
                chooseNumber = scan.nextInt();
                if (chooseNumber == 1) {
                    loginForm();
                }else if (chooseNumber == 2) {
                    mainFrame();  
                }else{
                    System.exit(0);
                }
            }
//      }
    }
    
    public static void registerForm(){
        System.out.println("");
        System.out.println("--------------------------------------------");
        
        int chooseNumber;
        String name;
        int age;
        double phone;
        String address;
        String username;
        String password;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("************Register Form*************");
        System.out.println("Enter your name:");
        name = scan.nextLine();
        System.out.println("Enter you age:");
        age = scan.nextInt();
        System.out.println("Enter you phone:");
        phone = scan.nextInt();
        System.out.println("Enter your address:");
        address = scan.nextLine();
        address = scan.nextLine();
        System.out.println("Enter your username:");
        username = scan.nextLine();
        System.out.println("Enter your password:");
        password = scan.nextLine();
  
        User user = new User( name, age, phone, address,username, password);
        listUser.add(user);
        
        System.out.println("Register success!");
        System.out.println("Press 1 to register again, press 2 to comeback main frame, press 3 to login, press 4 to exit");
        chooseNumber = scan.nextInt();
        switch (chooseNumber){
            case 1: registerForm()    ;
                    break;
            case 2: mainFrame();
                    break;
            case 3: loginForm();
                    break;
            case 4: System.exit(0);
                    break;
            default:
                    System.out.println("Please choose the correct number");
        }
        
        System.out.println("Name: "+user.getName());
    }
    
    public static void userFrame(){
        System.out.println("");
        System.out.println("--------------------------------------------");
        int chooseNumber;
        System.out.println("---Welcome to Online Book Sale---");
        System.out.println("1. View all books");
        System.out.println("2. Search book");
        System.out.println("3. Log out");
        System.out.println("4. Exit");
        Scanner scan = new Scanner(System.in);
        chooseNumber = scan.nextInt();
        
        switch (chooseNumber){
            case 1: viewAllBook();
                    break;
            case 2: searchBook();
                    break;
            case 3: mainFrame();
                    break;
            case 4: System.exit(0);
                    break;
            default:
                    System.out.println("Please choose the correct number");
        }
    }
    
    public static void adminFrame(){
        System.out.println("");
        System.out.println("--------------------------------------------");
        
        int chooseNumber;
        System.out.println("---Admin Page---");
        System.out.println("1. Manage user");
        System.out.println("2. Manage book");
        System.out.println("3. Manage employee");
        System.out.println("4. Log out");
        System.out.println("5. Exit");
        Scanner scan = new Scanner(System.in);
        chooseNumber = scan.nextInt();
        switch (chooseNumber){
            case 1: manageUser()    ;
                    break;
            case 2: manageBook();
                    break;
            case 3: manageEmployee();
                    break;
            case 4: mainFrame();
                    break;    
            case 5: System.exit(0);
                    break;
            default:
                    System.out.println("Please choose the correct number");
        }
    }
    
    public static void manageUser(){
        System.out.println("");
        System.out.println("--------------------------------------------");
        int chooseNumber;
        System.out.println("---Manage User---");
        System.out.println("1. View all user");
        System.out.println("2. Search");
        System.out.println("3. Add user");
        System.out.println("4. Come back the admin frame");
        System.out.println("5. Exit");
        Scanner scan = new Scanner(System.in);
        chooseNumber = scan.nextInt();
        switch (chooseNumber){
            case 1: viewAllUser();
                    break;
            case 2: searchUser();
                    break;
            case 3: addUser();
                    break;
            case 4: adminFrame();
                    break;
            case 5: System.exit(0);
                    break;
            default:
                    System.out.println("Please choose the correct number");
        }
    }
    
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
            case 1: viewAllBook();
                    break;
            case 2: searchBook();
                    break;
            case 3: addBook();
                    break;
            case 4: adminFrame();
                    break;
            case 5: System.exit(0);
                    break;
            default:
                    System.out.println("Please choose the correct number");
        }
    }
    
    public static void manageEmployee(){
        System.out.println("");
        System.out.println("--------------------------------------------");
        int chooseNumber;
        System.out.println("---Manage User---");
        System.out.println("1. View all employee");
        System.out.println("2. Search");
        System.out.println("3. Add employee");
        System.out.println("4. Come back the admin frame");
        System.out.println("5. Exit");
        Scanner scan = new Scanner(System.in);
        chooseNumber = scan.nextInt();
        switch (chooseNumber){
            case 1: viewAllEmployee();
                    break;
            case 2: searchEmployee();
                    break;
            case 3: addEmployee();
                    break;
            case 4: adminFrame();
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
                userFrame();
            }
        } else if (chooseNumber == 2) {
            System.exit(0);
        }
        else{
            System.out.println("Please enter the correct number");
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
    
    public static void viewAllUser(){
        System.out.println("");
        System.out.println("--------------------------------------------");
        int chooseNumber;
        System.out.println("This is the list user");
        for (User user : listUser) {
            System.out.println(user.toString());
        }
        System.out.println("");
        System.out.println("Press 1 to come back the main board, press 2 to exit");
        Scanner scan = new Scanner(System.in);
        chooseNumber = scan.nextInt();
        switch (chooseNumber) {
            case 1:
                manageUser();
                break;
            case 2:
                System.exit(0);
            default:
                System.out.println("Please enter the correct number");
                break;
        }
    }
    
    public static void searchUser(){
        System.out.println("");
        System.out.println("--------------------------------------------");
        int chooseNumber;
        String searchBook;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the user's name");
        searchBook = scan.nextLine();
        for (User user: listUser) {
            if (searchBook.trim().equalsIgnoreCase(user.getUsername()) || searchBook.trim().equalsIgnoreCase(user.getName())) {
                System.out.println(user.toString());
                System.out.println("Press 1 to continue search, press 2 to come back the main board, press 3 to exit");
                chooseNumber = scan.nextInt();
                switch (chooseNumber) {
                    case 1:
                        searchUser();
                        break;
                    case 2:
                        manageUser();
                        break;
                    case 3:
                        System.exit(0);
                    default:
                        System.out.println("Please enter the correct number!");
                        break;
                }
            }else{
                System.out.println("The book is not found");
                System.out.println("Press 1 to continue search, press 2 to come back the main board, press 3 to exit");
                chooseNumber = scan.nextInt();
                switch (chooseNumber) {
                    case 1:
                        searchUser();
                        break;
                    case 2:
                        manageUser();
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
    
    public static void addUser(){
        System.out.println("");
        System.out.println("--------------------------------------------");
        int chooseNumber;
        
        String name;
        int age;
        double phone;
        String address;
        String username;
        String password;

        Scanner scan = new Scanner(System.in);

        System.out.println("************Add User Form*************");
        System.out.println("Enter your name:");
        name = scan.nextLine();
        System.out.println("Enter you age:");
        age = scan.nextInt();
        System.out.println("Enter you phone:");
        phone = scan.nextInt();
        System.out.println("Enter your address:");
        address = scan.nextLine();
        address = scan.nextLine();
        System.out.println("Enter your username:");
        username = scan.nextLine();
        System.out.println("Enter your password:");
        password = scan.nextLine();
        
        User user = new User(name, age, phone, address,username, password);
       
        listUser.add(user);
        
        System.out.println("Press 1 to continue add, press 2 to come back the main board, press 3 to exit");
        chooseNumber = scan.nextInt();
        switch (chooseNumber) {
            case 1:
                addUser();
                break;
            case 2:
                manageUser();
                break;
            case 3:
                System.exit(0);
            default:
                System.out.println("Please enter the correct number!");
                break;
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
        author = addAuthor();
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
    
    public static Author addAuthor(){
        String name;
        String gender;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter author's name:");
        name = scan.nextLine();
        System.out.println("Enter author's gender:");
        gender = scan.nextLine();
        
        Author author = new Author(name, gender);
        
        listAuthor.add(author);
        return author;
    }

    public static void viewAllEmployee(){
        System.out.println("");
        System.out.println("--------------------------------------------");
        int chooseNumber;
        System.out.println("This is the list employee");
        for (Employee employee : listEmployee) {
            System.out.println(employee.toString());
        }
        System.out.println("");
        System.out.println("Press 1 to come back the main board, press 2 to exit");
        Scanner scan = new Scanner(System.in);
        chooseNumber = scan.nextInt();
        switch (chooseNumber) {
            case 1:
                manageEmployee();
                break;
            case 2:
                System.exit(0);
            default:
                System.out.println("Please enter the correct number");
                break;
        }
    }
    
    public static void searchEmployee(){
        System.out.println("");
        System.out.println("--------------------------------------------");
        int chooseNumber;
        String searchBook;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the employee's name");
        searchBook = scan.nextLine();
        for (Employee employee: listEmployee) {
            if (searchBook.trim().equalsIgnoreCase(employee.getName()) ) {
                System.out.println(employee.toString());
                System.out.println("Press 1 to continue search, press 2 to come back the main board, press 3 to exit");
                chooseNumber = scan.nextInt();
                switch (chooseNumber) {
                    case 1:
                        searchEmployee();
                        break;
                    case 2:
                        manageEmployee();
                        break;
                    case 3:
                        System.exit(0);
                    default:
                        System.out.println("Please enter the correct number!");
                        break;
                }
            }
            else{
                System.out.println("The employee is not found");
                System.out.println("Press 1 to con1"
                        + "tinue search, press 2 to come back the main board, press 3 to exit");
                chooseNumber = scan.nextInt();
                switch (chooseNumber) {
                    case 1:
                        searchEmployee();
                        break;
                    case 2:
                        manageEmployee();
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
    
    public static void addEmployee(){
        System.out.println(""); 
       System.out.println("--------------------------------------------");
        int chooseNumber;
        
        String name;
        int age;
        double phone;
        String address;
        double accountNumber;
        String position;
        int salary;

        Scanner scan = new Scanner(System.in);

        System.out.println("************Add User Form*************");
        System.out.println("Enter the name:");
        name = scan.nextLine();
        System.out.println("Enter the age:");
        age = scan.nextInt();
        System.out.println("Enter the phone:");
        phone = scan.nextDouble();
        System.out.println("Enter the address:");
        address = scan.nextLine();
        address = scan.nextLine();
        System.out.println("Enter the account number:");
        accountNumber = scan.nextDouble();
        System.out.println("Enter the position:");
        position = scan.nextLine();
        position = scan.nextLine();
        System.out.println("Enter the salary:");
        salary = scan.nextInt();
        
        Employee employee = new Employee(name, age, phone, address,accountNumber, position,salary);
        
        System.out.println("Your user already add: "+employee.getName());
        listEmployee.add(employee);
        
        System.out.println("Press 1 to continue add, press 2 to come back the main board, press 3 to exit");
        chooseNumber = scan.nextInt();
        switch (chooseNumber) {
            case 1:
                addEmployee();
                break;
            case 2:
                manageEmployee();
                break;
            case 3:
                System.exit(0);
            default:
                System.out.println("Please enter the correct number!");
                break;
        }
    }
}
