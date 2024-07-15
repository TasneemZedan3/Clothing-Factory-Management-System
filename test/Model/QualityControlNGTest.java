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
public class QualityControlNGTest {
    
    public QualityControlNGTest() {
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
     * Test of getName method, of class QualityControl.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        QualityControl instance = new QualityControl("shirt", true);
        String expResult = "shirt";
        String result = instance.getName();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getEmail method, of class QualityControl.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        QualityControl instance = new QualityControl("salma", "salma@", true);
        String expResult = "salma@";
        String result = instance.getEmail();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setName method, of class QualityControl.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "ceo";
        QualityControl instance = new QualityControl();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setEmail method, of class QualityControl.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        QualityControl instance = new QualityControl();
        instance.setEmail(email);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isCondition method, of class QualityControl.
     */
    @Test
    public void testIsCondition() {
        System.out.println("isCondition");
        QualityControl instance = new QualityControl();
        boolean expResult = false;
        boolean result = instance.isCondition();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCondition method, of class QualityControl.
     */
    @Test
    public void testSetCondition() {
        System.out.println("setCondition");
        boolean condition = false;
        QualityControl instance = new QualityControl();
        instance.setCondition(condition);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CheckFinalProduct method, of class QualityControl.
     */
    @Test
    public void testCheckFinalProduct() {
        System.out.println("CheckFinalProduct");
        QualityControl instance = new QualityControl();
        instance.CheckFinalProduct();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of IdentifyDefect method, of class QualityControl.
     */
    @Test
    public void testIdentifyDefect() {
        System.out.println("IdentifyDefect");
        QualityControl instance = new QualityControl();
        instance.IdentifyDefect();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addProductToCheck method, of class QualityControl.
     */
    @Test
    public void testAddProductToCheck() {
        System.out.println("addProductToCheck");
        Product p1 = null;
        QualityControl instance = new QualityControl();
        instance.addProductToCheck(p1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
