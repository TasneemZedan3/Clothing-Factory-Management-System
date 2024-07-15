/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import java.util.ArrayList;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author semoz
 */
public class ProductNGTest {
    
    public ProductNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of getProdId method, of class Product.
     */
    @Test
    public void testGetProdId() {
        System.out.println("getProdId");
        Product instance = new Product("1", "shorts", "red", "300");
        String expResult = "1";
        String result = instance.getProdId();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProdId method, of class Product.
     */
    @Test
    public void testSetProdId() {
        System.out.println("setProdId");
        String prodId = "11";
        Product instance = new Product();
        instance.setProdId(prodId);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getQualityControl method, of class Product.
     */
    @Test
    public void testGetQualityControl() {
        System.out.println("getQualityControl");
        Product instance = new Product();
        ArrayList expResult = null;
        ArrayList result = instance.getQualityControl();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setQualityControl method, of class Product.
     */
    @Test
    public void testSetQualityControl() {
        System.out.println("setQualityControl");
        ArrayList<QualityControl> QualityControl = null;
        Product instance = new Product();
        instance.setQualityControl(QualityControl);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getProColor method, of class Product.
     */
    @Test
    public void testGetProColor() {
        System.out.println("getProColor");
        Product instance = new Product("1", "shorts", "red", "300");
        String expResult = "red";
        String result = instance.getProColor();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getProPrice method, of class Product.
     */
    @Test
    public void testGetProPrice() {
        System.out.println("getProPrice");
        Product instance = new Product();
        String expResult = "500";
        String result = instance.getProPrice();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getProdName method, of class Product.
     */
    @Test
    public void testGetProdName() {
        System.out.println("getProdName");
        Product instance = new Product();
        String expResult = "dress";
        String result = instance.getProdName();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSizeChart method, of class Product.
     */
    @Test
    public void testGetSizeChart() {
        System.out.println("getSizeChart");
        Product instance = new Product();
        int expResult = 0;
        int result = instance.getSizeChart();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProColor method, of class Product.
     */
    @Test
    public void testSetProColor() {
        System.out.println("setProColor");
        String proColor = "";
        Product instance = new Product();
        instance.setProColor(proColor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProPrice method, of class Product.
     */
    @Test
    public void testSetProPrice() {
        System.out.println("setProPrice");
        String proPrice = "";
        Product instance = new Product();
        instance.setProPrice(proPrice);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProdName method, of class Product.
     */
    @Test
    public void testSetProdName() {
        System.out.println("setProdName");
        String prodName = "";
        Product instance = new Product();
        instance.setProdName(prodName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSizeChart method, of class Product.
     */
    @Test
    public void testSetSizeChart() {
        System.out.println("setSizeChart");
        char sizeChart = ' ';
        Product instance = new Product();
        instance.setSizeChart(sizeChart);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addQuailtyControl method, of class Product.
     */
    @Test
    public void testAddQuailtyControl() {
        System.out.println("addQuailtyControl");
        QualityControl Q1 = null;
        Product instance = new Product();
        instance.addQuailtyControl(Q1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Product.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Product instance = new Product();
        String expResult = "";
        String result = instance.toString();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
