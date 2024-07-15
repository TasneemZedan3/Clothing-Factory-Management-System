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
public class RegisterNGTest {
    
    public RegisterNGTest() {
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
     * Test of getUserName method, of class Register.
     */
    @Test
    public void testGetUserName() {
        System.out.println("getUserName");
        Register instance = new Register("ceo", "333");
        String expResult = "ceo";
        String result = instance.getUserName();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setUserName method, of class Register.
     */
    @Test
    public void testSetUserName() {
        System.out.println("manager");
        String userName = "";
        Register instance = new Register();
        instance.setUserName(userName);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getPassword method, of class Register.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        Register instance = new Register();
        String expResult = "333";
        String result = instance.getPassword();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setPassword method, of class Register.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "";
        Register instance = new Register();
        instance.setPassword(password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of signIn method, of class Register.
     */
    @Test
    public void testSignIn() {
        System.out.println("signIn");
        String userName = "manger";
        String password = "333";
        Register instance = new Register();
        instance.signIn(userName, password);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of signOut method, of class Register.
     */
    @Test
    public void testSignOut() {
        System.out.println("signOut");
        Register instance = new Register();
        instance.signOut();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of signUp method, of class Register.
     */
    @Test
    public void testSignUp() {
        System.out.println("signUp");
        int id = 0;
        String empName = "";
        String empNum = "";
        String empAdd = "";
        String empEmail = "";
        Register instance = new Register();
        instance.signUp(id, empName, empNum, empAdd, empEmail);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
