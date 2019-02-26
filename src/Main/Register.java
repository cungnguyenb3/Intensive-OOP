/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;


import static Main.Main.mainFrame;
import static Main.User.listUser;
import java.util.Scanner;

/**
 *
 * @author cung.nguyen
 */
public class Register {
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
            case 3: Login.loginForm();
                    break;
            case 4: System.exit(0);
                    break;
            default:
                    System.out.println("Please choose the correct number");
        }  
        System.out.println("Name: "+user.getName());
    }
}
