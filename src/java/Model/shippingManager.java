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
public class shippingManager {
    String mangName;
    String mangNum;
    String mangEmail;
    int expectedShippment;
    //ArrayList<Product> p; //3shan (1-N)    

    public shippingManager() {
    }
    
    public shippingManager(String mangName, String mangNum, String mangEmail) {
        this.mangName = mangName;
        this.mangNum = mangNum;
        this.mangEmail = mangEmail;
        //p=new ArrayList<>();
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
    
    //methods:
      
    public void startShipping(int expectedDays,Product[]prod){
      expectedShippment= expectedDays;
        for (int i = 0; i <prod.length; i++) {
       //  this.p.add(prod[i]);
         }
    }   
    
    public String endShipping(){
        for(int i=expectedShippment; i>0;i--){
            System.out.println();
            return "days left "+i;
        }
        return "shippment arrived";
    }
    
}
