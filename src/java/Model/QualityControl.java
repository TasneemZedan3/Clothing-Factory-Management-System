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
public class QualityControl {
      String name;
    String email;
    boolean condition= true;
    ArrayList<Product> Product=new ArrayList<>(); //3shan (n-n)

    public QualityControl() {
    }
  
    public QualityControl(String name, boolean Conduction) {
        this.name = name;
        this.condition=Conduction; 
    }
    public QualityControl(String name, String email, boolean Conduction) {
        this.name = name;
        this.email = email;
        this.condition=Conduction; 
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isCondition() {
        return condition;
    }

    public void setCondition(boolean condition) {
        this.condition = condition;
    }

    //methods
    protected void CheckFinalProduct(){
        if(condition)//true
            System.out.println("Checked");
        else 
            System.out.println("Not Checked");
    }
    protected void IdentifyDefect(){
        if(!condition){
        System.out.println("Defect Identified");
      } 
    }
    protected void addProductToCheck (Product p1){
        Product.add(p1);
    }
}
