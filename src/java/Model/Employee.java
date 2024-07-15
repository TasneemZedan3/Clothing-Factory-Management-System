/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

/**
 *
 * @author semoz
 */
public class Employee {
   
    int id;
    String empName;
    String empNum;
    String empAddress;
    String empEmail;
    int workingHours;
    int empSalary;
    boolean attend = false;
    String date;

    public Employee() {
    }
    public Employee(int id, String empName, int empSalary, int workingHours,boolean attend, String date){
        this.id = id;
        this.empName = empName;
        this.date=date;
        this.attend=attend;
        this.workingHours = workingHours;
        this.empSalary = empSalary;
    }

    public Employee(int id, String empName, String empNum, String empAdd, String empEmail, int workingHours, int empSalary,boolean attend,String date) {
        this.id = id;
        this.empName = empName;
        this.empNum = empNum;
        this.empAddress = empAdd;
        this.empEmail = empEmail;
        this.workingHours = workingHours;
        this.empSalary = empSalary;
    }
    
    //third cons for the employee to register only with his valid info
    public Employee(int id, String empName, String empNum, String empAdd, String empEmail) {
        this.id = id;
        this.empName = empName;
        this.empNum = empNum;
        this.empAddress = empAdd;
        this.empEmail = empEmail;
    }
    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpNum() {
        return empNum;
    }

    public void setEmpNum(String empNum) {
        this.empNum = empNum;
    }

    public String getEmpAdd() {
        return empAddress;
    }

    public void setEmpAdd(String empAdd) {
        this.empAddress = empAdd;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    public int getEmpSalary() {
        return empSalary;
    }

    public void setAttend(boolean attend) {
        this.attend = attend;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean isAttend() {
        return attend;
    }
 
    
    public void setEmpSalary(int empSalary) {
        this.empSalary = empSalary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }
    //method:

    public boolean Attend() {
        return attend;
    }

    public void increaseSalary() {
        this.empSalary += 1000;
        System.out.println("New Salary is " + this.empSalary);
    } 
}
