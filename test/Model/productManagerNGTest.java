/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

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
public class productManagerNGTest {
    
    public productManagerNGTest() {
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
     * Test of getMangName method, of class productManager.
     */
    @Test
    public void testGetMangName() {
        System.out.println("getMangName");
        productManager instance = new productManager("tasneem", "01000", "tess@");
        String expResult = "tasneem";
        String result = instance.getMangName();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setMangName method, of class productManager.
     */
    @Test
    public void testSetMangName() {
        System.out.println("setMangName");
        String mangName = "";
        productManager instance = new productManager();
        instance.setMangName(mangName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMangNum method, of class productManager.
     */
    @Test
    public void testGetMangNum() {
        System.out.println("getMangNum");
        productManager instance = new productManager("tasneem", "01000", "tess@");
        String expResult = "01000";
        String result = instance.getMangNum();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setMangNum method, of class productManager.
     */
    @Test
    public void testSetMangNum() {
        System.out.println("setMangNum");
        String mangNum = "section manager";
        productManager instance = new productManager();
        instance.setMangNum(mangNum);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getMangEmail method, of class productManager.
     */
    @Test
    public void testGetMangEmail() {
        System.out.println("getMangEmail");
        productManager instance = new productManager();
        String expResult = "";
        String result = instance.getMangEmail();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setMangEmail method, of class productManager.
     */
    @Test
    public void testSetMangEmail() {
        System.out.println("setMangEmail");
        String mangEmail = "";
        productManager instance = new productManager();
        instance.setMangEmail(mangEmail);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AddProduct method, of class productManager.
     */
    @Test
    public void testAddProduct() {
        System.out.println("AddProduct");
        Product p = null;
        productManager instance = new productManager();
        instance.AddProduct(p);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of RemoveProduct method, of class productManager.
     */
    @Test
    public void testRemoveProduct() {
        System.out.println("RemoveProduct");
        Product p1 = null;
        productManager instance = new productManager();
        instance.RemoveProduct(p1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of EditProduct method, of class productManager.
     */
    @Test
    public void testEditProduct() {
        System.out.println("EditProduct");
        Product p1 = null;
        String Name = "bantlon";
        String Color = "pink";
        String price = "4325";
        char sizeChart = 'S';
        productManager instance = new productManager();
        instance.EditProduct(p1, Name, Color, price, sizeChart);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of AddQualityContril method, of class productManager.
     */
    @Test
    public void testAddQualityContril() {
        System.out.println("AddQualityContril");
        String Name = "";
        boolean Condation = false;
        productManager instance = new productManager();
        instance.AddQualityContril(Name, Condation);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
