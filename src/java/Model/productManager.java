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
public class productManager extends  SectionManager{

    String mangName;
    String mangNum;
    String mangEmail;
    ArrayList<Product> product = new ArrayList<>(); //3shan (1-n)
    ArrayList<QualityControl> QualityControl = new ArrayList<>(); //3shan (1-n)

    public productManager() {
    }

    
    public productManager(String mangName, String mangNum, String mangEmail) {
        this.mangName = mangName;
        this.mangNum = mangNum;
        this.mangEmail = mangEmail;
        QualityControl = new ArrayList<QualityControl>();
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
    protected void AddProduct(Product p) {
        product.add(p);

    }

    protected void RemoveProduct(Product p1) {
        product.remove(p1);
    }

    protected void EditProduct(Product p1, String Name, String Color, String price, char sizeChart) {
        p1.setProdName(Name);
        p1.setProColor(Color);
        p1.setProPrice(price);
        p1.setSizeChart(sizeChart);
    }

    protected void AddQualityContril(String Name, boolean Condation) {
        QualityControl Q1= new QualityControl(Name, Condation);//3shan compostion
        QualityControl.add(Q1);
        System.out.println("Added");
    }

}
