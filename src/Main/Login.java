/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.Scanner;

/**
 *
 * @author cung.nguyen
 */
public class Login {
    public static String userName;
    public static String password;  
    
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
                User.userFrame();     
            } else if(userName.trim().equalsIgnoreCase("admin") && password.trim().equalsIgnoreCase("password")){
                User.adminFrame();
            } else {
                System.out.println("Your accout is not corect!");
                System.out.println("Press 1 to login again, press 2 to comeback main frame, press 3 to exit");
                chooseNumber = scan.nextInt();
                if (chooseNumber == 1) {
                    loginForm();
                }else if (chooseNumber == 2) {
                    Main.mainFrame();  
                }else{
                    System.exit(0);
                }
            }
//      }
    }
}
