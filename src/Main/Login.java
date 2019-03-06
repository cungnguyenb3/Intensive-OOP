/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import static Main.User.listUser;
import static Main.User.listUser;
import static Main.User.listUser;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author cung.nguyen
 */
public class Login {
    public static String userName;
    private static String password; 
    public static int isUser;
    
    public  void loginForm(){
        System.out.println("");
        System.out.println("--------------------------------------------");
        
        int chooseNumber;
        int flag = 0;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Online Book Sale");
        System.out.println("*********************");
        System.out.println("************Login Form*************");
        System.out.println("Enter Username");
        userName = scan.nextLine();
        System.out.println("Enter Password");
        password = scan.nextLine();
        User userDefault = new User();
        
        for(User user: listUser){
            if(user.getUsername().contains(userName) && user.getPassword().contains(password)){
                if (1 == user.getIsAdmin()) {
                    isUser = 1;
                    flag = 1;
                    user.adminFrame();
                    break;
                }else if(0 == user.getIsAdmin()){
                    isUser = 0;
                    flag = 1;
                    user.userFrame();
                    break;
                }else{
                    System.out.println("Loi gi do");
                }
            }
        }
        if (flag != 1) {
            System.out.println("Your accout is not corect!");
            System.out.println("Press 1 to login again, press 2 to comeback main frame, press 3 to exit");
            chooseNumber = scan.nextInt();
            if (chooseNumber == 1) {
                loginForm();
            }else if (chooseNumber == 2) {
                userDefault.adminFrame();  
            }else{
                System.exit(0);
            }
        }
             
    }
    
    public void loginBack(){
    }
}
