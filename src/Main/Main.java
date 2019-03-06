/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import static Main.Book.listBook;
import Main.Login;
import Main.Register;
import static Main.User.listUser;
import java.util.Scanner;
import java.util.*;


/**
 *
 * @author cung.nguyen
 */
public class Main { 
    
    public static void main(String[] args) {
        mainFrame();
    }
    public static void mainFrame(){
        int chooseNumber;
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Have you had User? Press 1 to login, press 2 to register!");
        chooseNumber = scan.nextInt();
        Login login = new Login();
        User userDefaultAdmin = new User("admin","password",1);
        User userDefaultUser = new User("Cung", 19, 12345667, "Quang Binh", "user", "password");
        
        listUser.add(userDefaultAdmin);
        listUser.add(userDefaultUser);
        
        Author author = new Author("Cung", "nam");
        Book book1 = new Book("Book1", author, "Tieu thuyet", 30000, 2);
        Book book2 = new Book("Book2", author, "Tieu thuyet", 40000, 2);
        Book book3 = new Book("Book3", author, "Tieu thuyet", 50000, 2);
        listBook.add(book1);
        listBook.add(book2);
        listBook.add(book3);
        
        if (chooseNumber == 1) {
            login.loginForm();
        }else if(chooseNumber == 2) { 
            Register.registerForm();   
        }
    } 
}
