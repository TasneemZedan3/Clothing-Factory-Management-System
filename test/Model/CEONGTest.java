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
public class CEONGTest {
    
    public CEONGTest() {
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
     * Test of getCeoName method, of class CEO.
     */
    @Test
    public void testGetCeoName() {
        System.out.println("getCeoName");
        CEO instance = new CEO("mohamed", "04324", "mo@", "firewoods", 55);
        String expResult = "mohamed";
        String result = instance.getCeoName();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setCeoName method, of class CEO.
     */
    @Test
    public void testSetCeoName() {
        System.out.println("setCeoName");
        String ceoName = "ceo";
        CEO instance = new CEO();
        instance.setCeoName(ceoName);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getCeoNum method, of class CEO.
     */
    @Test
    public void testGetCeoNum() {
        System.out.println("getCeoNum");
        CEO instance = new CEO("mohamed", "04324", "mo@", "firewoods", 55);
        String expResult = "0119920";
        String result = instance.getCeoNum();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setCeoNum method, of class CEO.
     */
    @Test
    public void testSetCeoNum() {
        System.out.println("setCeoNum");
        String ceoNum = "";
        CEO instance = new CEO();
        instance.setCeoNum(ceoNum);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCeoEmail method, of class CEO.
     */
    @Test
    public void testGetCeoEmail() {
        System.out.println("getCeoEmail");
        CEO instance = new CEO("mohamed", "04324", "mo@", "firewoods", 55);
        String expResult = "mo@";
        String result = instance.getCeoEmail();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setCeoEmail method, of class CEO.
     */
    @Test
    public void testSetCeoEmail() {
        System.out.println("setCeoEmail");
        String ceoEmail = "";
        CEO instance = new CEO();
        instance.setCeoEmail(ceoEmail);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getCeoCompany method, of class CEO.
     */
    @Test
    public void testGetCeoCompany() {
        System.out.println("getCeoCompany");
        CEO instance = new CEO();
        String expResult = "";
        String result = instance.getCeoCompany();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setCeoCompany method, of class CEO.
     */
    @Test
    public void testSetCeoCompany() {
        System.out.println("setCeoCompany");
        String ceoCompany = "firewoods";
        CEO instance = new CEO();
        instance.setCeoCompany(ceoCompany);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCeoAge method, of class CEO.
     */
    @Test
    public void testGetCeoAge() {
        System.out.println("getCeoAge");
        CEO instance = new CEO();
        int expResult = 0;
        int result = instance.getCeoAge();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCeoAge method, of class CEO.
     */
    @Test
    public void testSetCeoAge() {
        System.out.println("setCeoAge");
        int ceoAge = 0;
        CEO instance = new CEO();
        instance.setCeoAge(ceoAge);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of reviewReport method, of class CEO.
     */
    @Test
    public void testReviewReport() {
        System.out.println("reviewReport");
        CEO instance = new CEO();
        instance.reviewReport();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of assignSectionManager method, of class CEO.
     */
    @Test
    public void testAssignSectionManager() {
        System.out.println("assignSectionManager");
        String Name = "";
        String PhoneNumber = "";
        String EmailAddress = "";
        CEO instance = new CEO();
        instance.assignSectionManager(Name, PhoneNumber, EmailAddress);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of signUp method, of class CEO.
     */
    @Test
    public void testSignUp() {
        System.out.println("signUp");
        String ceoName = "";
        String ceoNum = "";
        String ceoEmail = "";
        String ceoCompany = "";
        int ceoAge = 0;
        CEO instance = new CEO();
        instance.signUp(ceoName, ceoNum, ceoEmail, ceoCompany, ceoAge);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
