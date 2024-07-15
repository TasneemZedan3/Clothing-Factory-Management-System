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
public class saleManager extends SectionManager {
    
    String mangName;
    String mangNum;
    String mangEmail;
    boolean Campagin;
    String Stratgies;
    int Sales;
    int total;
    ArrayList<Product> p; //3ashan (1-n)

    public saleManager() {
    }

    
    public saleManager(String mangName, String mangNum, String mangEmail, boolean Campagin) {
        this.mangName = mangName;
        this.mangNum = mangNum;
        this.mangEmail = mangEmail;
        this.Campagin = Campagin;
        p=new ArrayList<>();  //3shan composite
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

    public void setStratgies(String Stratgies) {
        this.Stratgies = Stratgies;
    }

    public String getStratgies() {
        return Stratgies;
    }
    
    public boolean isCampagin() {
        return Campagin;
    }

    public void setCampagin(boolean Campagin) {
        this.Campagin = Campagin;
    }
    
    //methods:
     public void productPricing(String price){
         for (int i = 0; i < p.size(); i++) {
             this.p.get(i).proPrice=price;
         }
    }
    
    public void marketingStratgies(){
        System.out.println("the stratgie is "+getStratgies());
    }
    
    public void startCampagin(){
       Campagin=true;
       System.out.println("THE CAMPAGIN STARTED");
    }
    public void revenue(int sales){
         total+=sales; 
    }
    public void calcTotalSale(){
      System.out.println("The total sales for this month: "+total);
    }
    
    
}
