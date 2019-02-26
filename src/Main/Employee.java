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
public class Employee extends Person{
    private String position;
    private int salary;

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee(){
        
    }
    public Employee(String position, int salary) {
        this.position = position;
        this.salary = salary;
    }

    public Employee( String name, int age, double phone, String address, double acountNumber, String position, int salary) {
        super(name, age, phone, address, acountNumber);
        this.position = position;
        this.salary = salary;
    }
    
    public static ArrayList<Employee> listEmployee = new ArrayList<Employee>();
    
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
            case 1: Employee.viewAllEmployee();
                    break;
            case 2: Employee.searchEmployee();
                    break;
            case 3: Employee.addEmployee();
                    break;
            case 4: User.adminFrame();
                    break;
            case 5: System.exit(0);
                    break;
            default:
                    System.out.println("Please choose the correct number");
        }
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
    
    @Override
    public String toString() {
        return "User@[Name: " + this.getName() + ", age: " + this.getAge() + ", phone: "+ this.getPhone() + ", address: "+ this.getAddress() +
                ", acountNumber: "+ this.getAccountNumber() + "]" + ", position: "+ this.getPosition() + ", salary: "+ this.getSalary();
    }
}