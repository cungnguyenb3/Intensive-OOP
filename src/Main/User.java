/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import static Main.Main.mainFrame;
import java.util.ArrayList;
import java.util.Scanner;

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
    
    public static ArrayList<User> listUser = new ArrayList<User>();
    
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
            case 1: User.manageUser()    ;
                    break;
            case 2: Book.manageBook();
                    break;
            case 3: Employee.manageEmployee();
                    break;
            case 4: Main.mainFrame();
                    break;    
            case 5: System.exit(0);
                    break;
            default:
                    System.out.println("Please choose the correct number");
        }
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
            case 1: Book.viewAllBook();
                    break;
            case 2: Book.searchBook();
                    break;
            case 3: Main.mainFrame();
                    break;
            case 4: System.exit(0);
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
        User user = new User("huycuong333", "12345", 1);
        switch (chooseNumber){
            case 1: user.viewAllUser();
                    break;
            case 2: User.searchUser();
                    break;
            case 3: User.addUser();
                    break;
            case 4: adminFrame();
                    break;
            case 5: System.exit(0);
                    break;
            default:
                    System.out.println("Please choose the correct number");
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
    
    public static void searchUser(){
        System.out.println("");
        System.out.println("--------------------------------------------");
        int chooseNumber;
        int flag = 0;
        String searchUsername;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the user's name");
        searchUsername = scan.nextLine();
        for (User user: listUser) {
            if(user.getName() != null && user.getName().contains(searchUsername)) {
                System.out.println(user.toString());
                flag = 1;
                break;
            }else{
                flag = 0;
            }
        }
        if (flag == 1) {
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
            System.out.println("The user is not found");
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
    
    public static void updateUser(){}
    
    public static void deleteUser(){}
    
    @Override
    public String toString() {
        return "User@[Name: " + this.getName() + ", age: " + this.getAge() + ", phone: "+ this.getPhone() + ", address: "+ this.getAddress() +
                ", username: "+ this.getUsername() + "]" + ", password: "+ this.getPassword();
    }

    
}