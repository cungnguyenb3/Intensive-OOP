
package Main;

import Main.Book;
import static Main.Book.listOrder;
import static Main.Main.mainFrame;
import Main.Person;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author thuy.cao
 */
public class User extends Person{
    private static final AtomicInteger count = new AtomicInteger(0);
    private String username;
    private String password;
    private int isAdmin;

    public User(){
    }
    public User(String username, String password, int isAdmin) {
        code = count.incrementAndGet();
        this.username = username;
        this.password = password;
        this.isAdmin = isAdmin;
    }

    public User(String username, String password, int isAdmin,String 
            name, int age, double phone, String address, double acountNumber) {   
        super(name, age, phone, address, acountNumber);
        code = count.incrementAndGet();
        this.username = username;
        this.password = password;
        this.isAdmin = isAdmin;
    }
    public User(String name, int age, double phone, String address, String
            username, String password) {
        super(name, age, phone, address);
        code = count.incrementAndGet();
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
    
    public void adminFrame(){
        System.out.println("");
        System.out.println("--------------------------------------------");
        
        Book bookDefault1 = new Book();
        Employee empoyeeDefault1 = new Employee();
        User userDefault = new User();
        Login login = new Login();
        
        int chooseNumber;
        System.out.println("---Admin Page---");
        System.out.println("1. Manage user");
        System.out.println("2. Manage book");
        System.out.println("3. Manage employee");
        System.out.println("4. Manage order");
        System.out.println("5. Log out");
        System.out.println("6. Exit");
        Scanner scan = new Scanner(System.in);
        chooseNumber = scan.nextInt();
        switch (chooseNumber){
            case 1: userDefault.manageUser()    ;
                    break;
            case 2: bookDefault1.manageBook();
                    break;
            case 3: empoyeeDefault1.manageEmployee();
                    break;
            case 4: manageOrder();
                    break;
            case 5: login.loginForm();
                    break;    
            case 6: System.exit(0);
                    break;
            default:
                    System.out.println("Please choose the correct number");
        }
    }
    
    public void userFrame(){
        System.out.println("");
        System.out.println("--------------------------------------------");
        
        Book bookDefault2 = new Book();
        Login login = new Login();
        
        int chooseNumber;
        System.out.println("---Welcome to Online Book Sale---");
        System.out.println("1. View all book");
        System.out.println("2. Search book");
        System.out.println("3. View list order");
        System.out.println("4. Log out");
        System.out.println("5. Exit");
        Scanner scan = new Scanner(System.in);
        chooseNumber = scan.nextInt();
        
        switch (chooseNumber){
            case 1: bookDefault2.viewAllBook();
                    break;
            case 2: bookDefault2.searchBook();
                    break;
            case 3: bookDefault2.viewAllOrder();
                    break;
            case 4: login.loginForm();
                    break;
            case 5: System.exit(0);
                    break;
            default:
                    System.out.println("Please choose the correct number");
        }
    }
    
    public void manageUser(){
        System.out.println("");
        System.out.println("--------------------------------------------");
         
        User userDefault = new User();
        
        int chooseNumber;
        System.out.println("---Manage User---");
        System.out.println("1. View all user");
        System.out.println("2. Search");
        System.out.println("3. Add user");
        System.out.println("4. Come back the admin frame");
        System.out.println("5. Exit");
        Scanner scan = new Scanner(System.in);
        chooseNumber = scan.nextInt();
//        User user = new User("huycuong333", "12345", 1);
        switch (chooseNumber){
            case 1: userDefault.viewAllUser();
                    break;
            case 2: userDefault.searchUser();
                    break;
            case 3: userDefault.addUser();
                    break;
            case 4: userDefault.adminFrame();
                    break;
            case 5: System.exit(0);
                    break;
            default:
                    System.out.println("Please choose the correct number");
        }
    }
    
    public void viewAllUser(){
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
    
    public void addUser(){
        System.out.println("");
        System.out.println("--------------------------------------------");
        int chooseNumber;
        
        User userDefault5 = new User();
        
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
        scan.nextLine();
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
                userDefault5.addUser();
                break;
            case 2:
                userDefault5.manageUser();
                break;
            case 3:
                System.exit(0);
            default:
                System.out.println("Please enter the correct number!");
                break;
        }
    }
    
    public void searchUser(){
        System.out.println("");
        System.out.println("--------------------------------------------");
        
        User userDefault7 = new User("tuan","password",0);
        
        int flag = 0;
        int chooseNumber;
        String searchUsername;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the user's name");
        searchUsername = scan.nextLine();
        for (User user: listUser) {
            if(user.getName() != null && user.getName().contains(searchUsername)) {
                flag = 1;
                System.out.println(user.toString());
                
                System.out.println("Press 1 to continue search, press 2 to update this user, press 3 to delete this user, "
                        + "press 4 to go back the user board, press 5 to exit");
                chooseNumber = scan.nextInt();
                switch (chooseNumber) {
                    case 1:
                        user.searchUser();
                        break;
                    case 2:
                        user.updateUser(user);
                        break;
                    case 3:
                        listUser.remove(user);
                        userDefault7.viewAllUser();
                        break;
                    case 4:
                        userDefault7.manageUser();
                        break;
                    default:
                        System.out.println("Please enter the correct number!");
                        break;
                }
            }else{
                flag = 0;
            }
        }
        if (flag == 1) {
            userDefault7.searchBack();
        }else{
            System.out.println("The user is not found");
            userDefault7.searchBack();
        }
    }
    
    public void searchBack(){
        int chooseNumber;
        
        User userDefault8 = new User("phuc","password",0);
        
        Scanner scan = new Scanner(System.in);
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
    
    
    public void updateUser(User user){
        
        int chooseNumber;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("************Update Form*************");
        System.out.println("Enter your name:");
        String name = scan.nextLine();
        
        System.out.println("Enter you age:");
        int age = scan.nextInt();
        
        System.out.println("Enter you phone:");
        double phone = scan.nextInt();
        
        System.out.println("Enter your address:");
        scan.nextLine();
        String address = scan.nextLine();
        
        System.out.println("Enter your username:");
        String username = scan.nextLine();
        
        System.out.println("Enter your password:");
        String password = scan.nextLine();
  
        user.setName(name);
        user.setAge(age);
        user.setPhone(phone);
        user.setAddress(address);
        user.setUsername(username);
        user.setPassword(password);        
        
        System.out.println("Update success!");
        System.out.println("Press 1 to update again, press 2 to comeback main frame,press 3 to view all user, press 4 to exit");
        chooseNumber = scan.nextInt();
        switch (chooseNumber){
            case 1: updateUser(user);
                    break;
            case 2: manageUser();
                    break;
            case 3: viewAllUser();
                    break;
            case 4: System.exit(0);
                    break;
            default:
                    System.out.println("Please choose the correct number");
        }  
    }
    
    public void manageOrder(){
        System.out.println("");
        System.out.println("--------------------------------------------");
         
        Book bookDefault = new Book();
        
        int chooseNumber;
        System.out.println("---Manage User---");
        System.out.println("1. View all order");
        System.out.println("2. Search");
        System.out.println("3. Come back the admin frame");
        System.out.println("4. Exit");
        Scanner scan = new Scanner(System.in);
        chooseNumber = scan.nextInt();

        switch (chooseNumber){
            case 1: bookDefault.viewAllOrder();
                    break;
            case 2: searchOrder();
                    break;
            case 3: adminFrame();
                    break;
            case 4: System.exit(0);
                    break;
            default:
                    System.out.println("Please choose the correct number");
        }
    }
    
    public void searchOrder(){
        System.out.println("");
        System.out.println("--------------------------------------------");
        
        User userDefault7 = new User("tuan","password",0);
        
        int flag = 0;
        int chooseNumber;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the order's ID");
        int searchOrder = 0;
        searchOrder = scan.nextInt();
                
        for (Order order: listOrder) {
            if(order.getCode()== searchOrder) {
                System.out.println(order.toString());
                
                System.out.println("Press 1 to continue search, press 2 to delete this order, "
                        + "press 3 to go back the admin board, press 4 to exit");
                chooseNumber = scan.nextInt();
                switch (chooseNumber) {
                    case 1:
                        searchOrder();
                        break;
                    case 2:
                        listOrder.remove(order);
                        break;
                    case 3:
                        adminFrame();
                        break;
                    default:
                        System.out.println("Please enter the correct number!");
                        break;
                }
            }else{
                flag = 0;
            }
        }
        if (flag == 1) {
            userDefault7.searchBack();
        }else{
            System.out.println("The user is not found");
            userDefault7.searchBack();
        }
    }
    
    @Override
    public String toString() {
        return "User@[Name: " + this.getName() + ", age: " + this.getAge() + ", phone: "+ this.getPhone() + ", address: "+ this.getAddress() +
                ", username: "+ this.getUsername() + "]" + ", password: "+ this.getPassword();
    }  
}