/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author semoz
 */
public class Register {

  
    String userName;
    String password;
    CEO ceo; //3shan kan fe compostion (1-1)
    ArrayList<Employee> emp = new ArrayList<>(); //3shan kan fe compostion (1-n)

    public Register() {
    }
    
    public Register(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public Register(String userName, String password, CEO ceo, ArrayList<Employee> emp) {
        this.userName = userName;
        this.password = password;
        this.ceo = ceo;
        this.emp = new ArrayList<>();
    }
    
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    //methods:
    
    public void signIn(String userName, String password){
        if(userName.equals(this.userName) && password.equals(this.password)){
            
            System.out.println("Login Successfully");
            
        } else {
            System.out.println("Login Failed! Check your Username and Password.");
        }
    }
    
    public void signOut(){ //button fe el gui
        this.userName = null;
        this.password = null;
    }
    
    public void signUp(int id, String empName, String empNum, String empAdd, String empEmail){
       this.emp.add(new Employee(id, empName, empNum, empAdd, empEmail));
    }
}
