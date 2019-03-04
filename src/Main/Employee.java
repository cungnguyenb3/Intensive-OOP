/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Main.Person;
import Main.User;
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
    
    public void manageEmployee(){
        System.out.println("");
        System.out.println("--------------------------------------------");
        int chooseNumber;
        
        Employee empoyeeDefault1 = new Employee();
        User userDefault = new User();
        
        System.out.println("---Manage User---");
        System.out.println("1. View all employee");
        System.out.println("2. Search");
        System.out.println("3. Add employee");
        System.out.println("4. Come back the admin frame");
        System.out.println("5. Exit");
        Scanner scan = new Scanner(System.in);
        chooseNumber = scan.nextInt();
        switch (chooseNumber){
            case 1: empoyeeDefault1.viewAllEmployee();
                    break;
            case 2: empoyeeDefault1.searchEmployee();
                    break;
            case 3: empoyeeDefault1.addEmployee();
                    break;
            case 4: userDefault.adminFrame();
                    break;
            case 5: System.exit(0);
                    break;
            default:
                    System.out.println("Please choose the correct number");
        }
    }
    
    public void viewAllEmployee(){
        System.out.println("");
        System.out.println("--------------------------------------------");
        
        Employee empoyeeDefault1 = new Employee();
        
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
                empoyeeDefault1.manageEmployee();
                break;
            case 2:
                System.exit(0);
            default:
                System.out.println("Please enter the correct number");
                break;
        }
    }
    
    public void searchEmployee(){
        System.out.println("");
        System.out.println("--------------------------------------------");
        
        Employee empoyeeDefault1 = new Employee();
        
        int flag = 0;
        int chooseNumber;
        String searchEmployeeName;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the Employee's name");
        searchEmployeeName = scan.nextLine();
        for (Employee employee: listEmployee) {
            if(employee.getName() != null && employee.getName().contains(searchEmployeeName)) {
                System.out.println(employee.toString());
                
                System.out.println("Press 1 to continue search, press 2 to update this employee, press 3 to delete this employee, "
                        + "press 4 to go back the employee board, press 5 to exit");
                chooseNumber = scan.nextInt();
                switch (chooseNumber) {
                    case 1:
                        searchEmployee();
                        break;
                    case 2:
                        employee.updateEmployee(employee);
                        break;
                    case 3:
                        listEmployee.remove(employee);
                        empoyeeDefault1.viewAllEmployee();
                        break;
                    default:
                        System.out.println("Please enter the correct number!");
                        break;
                }
            }
        }
        if (flag == 1) {
            empoyeeDefault1.searchBack();
        }else{
            System.out.println("The employee is not found");
            empoyeeDefault1.searchBack();
        }
    }
    
    public void searchBack(){
        int chooseNumber;
        Scanner scan = new Scanner(System.in);
        
        Employee empoyeeDefault1 = new Employee();
        
        System.out.println("Press 1 to continue search, press 2 to come back the main board, press 3 to exit");
        chooseNumber = scan.nextInt();
        switch (chooseNumber) {
            case 1:
                empoyeeDefault1.searchEmployee();
                break;
            case 2:
                empoyeeDefault1.manageEmployee();
                break;
            case 3:
                System.exit(0);
            default:
                System.out.println("Please enter the correct number!");
                break;
        }  
    }
    
    public void addEmployee(){
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
        
        Employee empoyeeDefault1 = new Employee();
        Scanner scan = new Scanner(System.in);

        System.out.println("************Add User Form*************");
        System.out.println("Enter the name:");
        name = scan.nextLine();
        System.out.println("Enter the age:");
        age = scan.nextInt();
        System.out.println("Enter the phone:");
        phone = scan.nextDouble();
        System.out.println("Enter the address:");
        scan.nextLine();
        address = scan.nextLine();
        System.out.println("Enter the account number:");
        accountNumber = scan.nextDouble();
        System.out.println("Enter the position:");
        scan.nextLine();
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
                empoyeeDefault1.addEmployee();
                break;
            case 2:
                empoyeeDefault1.manageEmployee();
                break;
            case 3:
                System.exit(0);
            default:
                System.out.println("Please enter the correct number!");
                break;
        }
    }
    
    public void updateEmployee(Employee employee){
        System.out.println(""); 
        System.out.println("--------------------------------------------");
        int chooseNumber;
        
        Employee empoyeeDefault1 = new Employee();
        Scanner scan = new Scanner(System.in);

        System.out.println("************Update Employee Form*************");
        System.out.println("Enter the name:");
        String name = scan.nextLine();
        
        System.out.println("Enter the age:");
        int age = scan.nextInt();
        
        System.out.println("Enter the phone:");
        double phone = scan.nextDouble();
        
        System.out.println("Enter the address:");
        scan.nextLine();
        String address = scan.nextLine();
        
        System.out.println("Enter the account number:");
        double accountNumber = scan.nextDouble();
        
        System.out.println("Enter the position:");
        scan.nextLine();
        String position = scan.nextLine();
        
        System.out.println("Enter the salary:");
        int salary = scan.nextInt();
        
        employee.setName(name);
        employee.setAge(age);
        employee.setPhone(phone);
        employee.setAddress(address);
        employee.setAccountNumber(accountNumber);
        employee.setPosition(position);
        employee.setSalary(salary);
       
        System.out.println("Press 1 to continue add, press 2 to come back the main board, press 3 to exit");
        chooseNumber = scan.nextInt();
        switch (chooseNumber) {
            case 1:
                empoyeeDefault1.addEmployee();
                break;
            case 2:
                empoyeeDefault1.manageEmployee();
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