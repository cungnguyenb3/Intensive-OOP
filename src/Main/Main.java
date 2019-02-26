/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
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
        if (chooseNumber == 1) {
            Login.loginForm();
        }
        else if(chooseNumber == 2) { 
            Register.registerForm();   
        }
    }
    

    
    
    
    
    
    
    
    
    
    
  
}
