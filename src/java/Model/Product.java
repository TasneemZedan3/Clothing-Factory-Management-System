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
 public class Product {
    String prodId;
    String prodName;
    String proColor;
    String proPrice;
    char sizeChart;
    ArrayList<QualityControl> QualityControl =new ArrayList<>();
  
    
    public Product() {
    }

    public Product(String prodId, String prodName, String proColor, String proPrice) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.proColor = proColor;
        this.proPrice = proPrice;
    }

    public String getProdId() {
        return prodId;
    }

    public void setProdId(String prodId) {
        this.prodId = prodId;
    }

    public ArrayList<QualityControl> getQualityControl() {
        return QualityControl;
    }

    public void setQualityControl(ArrayList<QualityControl> QualityControl) {
        this.QualityControl = QualityControl;
    }
    
    
     public Product(String prodName, String proColor, String proPrice) {
        this.prodName = prodName;
        this.proColor = proColor;
        this.proPrice = proPrice;
        this.sizeChart = sizeChart;
    }

    public Product(String prodName, String proColor, String proPrice, char sizeChart) {
        this.prodName = prodName;
        this.proColor = proColor;
        this.proPrice = proPrice;
        this.sizeChart = sizeChart;
    }

    
    public String getProColor() {
        return proColor;
    }

    public String getProPrice() {
        return proPrice;
    }

    public String getProdName() {
        return prodName;
    }

    public int getSizeChart() {
        return sizeChart;
    }

    public void setProColor(String proColor) {
        this.proColor = proColor;
    }

    public void setProPrice(String proPrice) {
        this.proPrice = proPrice;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public void setSizeChart(char sizeChart) {
        this.sizeChart = sizeChart;
    }
    
    public void addQuailtyControl(QualityControl Q1){
        QualityControl.add(Q1);
    }  

    @Override
    public String toString() {
        return "Product{" + "prodName=" + prodName + ", proColor=" + proColor + ", proPrice=" + proPrice + ", sizeChart=" + sizeChart + '}';
    }
    
}
  
