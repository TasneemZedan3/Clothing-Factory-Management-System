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
public class SectionManager extends Employee{
    
    
    String mangName;
    String mangNum;
    String mangEmail;
    ArrayList<Employee> emp; // 3shan (1-n)
    productManager pm;  //3shan (1-1)
    saleManager sm; // 3hsna (1-1)
    ArrayList<Report> r = new ArrayList<>();
    public SectionManager(String mangName, String mangNum, String mangEmail) {
        this.mangName = mangName;
        this.mangNum = mangNum;
        this.mangEmail = mangEmail;
        this.emp = new ArrayList<>();
    }
    public SectionManager(String mangName, String mangNum, String mangEmail, saleManager sm, productManager pm) {
        this.mangName = mangName;
        this.mangNum = mangNum;
        this.mangEmail = mangEmail;
        this.emp = new ArrayList<>();
        this.sm = sm;
        this.pm = pm;
    }

    public SectionManager() {
    }

    public String getMangName() {
        return mangName;
    }

    public void setMangName(String mangName) {
        this.mangName = mangName;
    }

    public String getMangNum() {
        return mangNum;
    }

    public void setMangNum(String mangNum) {
        this.mangNum = mangNum;
    }

    public String getMangEmail() {
        return mangEmail;
    }

    public void setMangEmail(String mangEmail) {
        this.mangEmail = mangEmail;
    }

    public void setPm(productManager pm) {
        this.pm = pm;
    }

    public void setSm(saleManager sm) {
        this.sm = sm;
    }

    
    //methods:
    public void addEmployee(Employee emp) {
        this.emp.add(emp);
    }
    public void addReport(Report r) {
        this.r.add(r);
    }
    
    public void removeEmployee(int id) {
        for (int i = 0; i < emp.size(); i++) {
            if (this.emp.get(i).id == id) {
                this.emp.remove(i);
                System.out.println("Employee removed");
            }
        }
    }
    
    protected void showReport() {
        System.out.print("The Report for this month is that ");
        sm.calcTotalSale();
    }

    public void addProduct(Product p) {
        //The productManager object will add the product
        pm.AddProduct(p);
        System.out.println("New Product added");

    }

    public void editProduct(Product p, String name, String color, String price, char sizeChart) {
        //The productManager object will edit the product

        pm.EditProduct(p, name, color, price, sizeChart);
    }
    
    protected  void RemoveProduct(Product p1){
        pm.RemoveProduct(p1);
        System.out.println("Product removed");
    }
    
    public void addAttendance(Employee emp) {
        emp.attend = true;
        System.out.println("Attendance registered");
    }

    public boolean checkAttendance(String name, int id) {
        for (int i = 0; i < emp.size(); i++) {
            if (emp.get(i).getId() == id && emp.get(i).getEmpName().equals(name)) {
                if (emp.get(i).attend) {
                    System.out.println("Employee has attended");
                }else{
                    System.out.println("Employee has not attended");
                }
                return emp.get(i).attend;
            }
        }
        return false;
    }
}
