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
public class shippingManagerNGTest {

    public shippingManagerNGTest() {
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
     * Test of getMangName method, of class shippingManager.
     */
    @Test
    public void testGetMangName() {
        System.out.println("getMangName");
        shippingManager instance = new shippingManager("section manager", "0100", "section@email");
        String expResult = "section manager";
        String result = instance.getMangName();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setMangName method, of class shippingManager.
     */
    @Test
    public void testSetMangName() {
        System.out.println("setMangName");
        String mangName = "";
        shippingManager instance = new shippingManager();
        instance.setMangName(mangName);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getMangNum method, of class shippingManager.
     */
    @Test
    public void testGetMangNum() {
        System.out.println("getMangNum");
        shippingManager instance = new shippingManager("mahmoud", "012", "mahmoud");
        String expResult = "ahmed";
        String result = instance.getMangNum();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setMangNum method, of class shippingManager.
     */
    @Test
    public void testSetMangNum() {
        System.out.println("setMangNum");
        String mangNum = "019283732";
        shippingManager instance = new shippingManager();
        instance.setMangNum(mangNum);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getMangEmail method, of class shippingManager.
     */
    @Test
    public void testGetMangEmail() {
        System.out.println("getMangEmail");
        shippingManager instance = new shippingManager();
        String expResult = "";
        String result = instance.getMangEmail();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setMangEmail method, of class shippingManager.
     */
    @Test
    public void testSetMangEmail() {
        System.out.println("setMangEmail");
        String mangEmail = "";
        shippingManager instance = new shippingManager();
        instance.setMangEmail(mangEmail);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of startShipping method, of class shippingManager.
     */
    @Test
    public void testStartShipping() {
        System.out.println("startShipping");
        int expectedDays = 0;
        Product[] prod = null;
        shippingManager instance = new shippingManager();
        instance.startShipping(expectedDays, prod);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of endShipping method, of class shippingManager.
     */
    @Test
    public void testEndShipping() {
        System.out.println("endShipping");
        shippingManager instance = new shippingManager();
        String expResult = "";
        String result = instance.endShipping();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
