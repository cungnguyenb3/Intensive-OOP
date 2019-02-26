/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author thuy.cao
 */
public class Author {
    private String name;
    private String gender;
    
    public Author(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public static ArrayList<Author> listAuthor = new ArrayList<Author>();
    
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
    
    @Override
    public String toString() {
        return "Author{" + "name=" + name + ", gender=" + gender + '}';
    }
    
    
    
}