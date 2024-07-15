/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import java.util.LinkedList;
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
public class dbconnectNGTest {
    
    public dbconnectNGTest() {
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
     * Test of Validate method, of class dbconnect.
     */
    @Test
    public void testValidate() throws Exception {
        System.out.println("Validate");
        Register r = null;
        dbconnect instance = new dbconnect();
        boolean expResult = false;
        boolean result = instance.Validate(r);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of showReport method, of class dbconnect.
     */
    @Test
    public void testShowReport() throws Exception {
        System.out.println("showReport");
        dbconnect instance = new dbconnect();
        LinkedList expResult = null;
        LinkedList result = instance.showReport();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of showProduct method, of class dbconnect.
     */
    @Test
    public void testShowProduct() throws Exception {
        System.out.println("showProduct");
        dbconnect instance = new dbconnect();
        LinkedList expResult = null;
        LinkedList result = instance.showProduct();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of InsertData method, of class dbconnect.
     */
    @Test
 public void testInsertData() throws Exception {
        System.out.println("InsertData");
        Product p = new Product("1", "T-shirt", "blue", "2300");
        dbconnect instance = new dbconnect();
        boolean expResult = true;
        boolean result = instance.InsertData(p);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of InsertReport method, of class dbconnect.
     */
    @Test
    public void testInsertReport() throws Exception {
        System.out.println("InsertReport");
        Report r = new Report("1", "653", "4632");
        dbconnect instance = new dbconnect();
        boolean expResult = false;
        boolean result = instance.InsertReport(r);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of AddProduct method, of class dbconnect.
     */
    @Test
    public void testAddProduct() throws Exception {
        System.out.println("AddProduct");
        Product p1 = null;
        dbconnect instance = new dbconnect();
        instance.AddProduct(p1);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of EmployeeSalary method, of class dbconnect.
     */
    @Test
    public void testEmployeeSalary() throws Exception {
        System.out.println("EmployeeSalary");
        String id = "";
        dbconnect instance = new dbconnect();
        Employee expResult = null;
        Employee result = instance.EmployeeSalary(id);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of EmployeeAttendace method, of class dbconnect.
     */
    @Test
    public void testEmployeeAttendace() throws Exception {
        System.out.println("EmployeeAttendace");
        String date = "";
        dbconnect instance = new dbconnect();
        Employee expResult = null;
        Employee result = instance.EmployeeAttendace(date);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of RemoveProduct method, of class dbconnect.
     */
    @Test
    public void testRemoveProduct() throws Exception {
        System.out.println("RemoveProduct");
        int id = 0;
        dbconnect instance = new dbconnect();
        boolean expResult = false;
        boolean result = instance.RemoveProduct(id);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of EditProduct method, of class dbconnect.
     */
    @Test
    public void testEditProduct() throws Exception {
        System.out.println("EditProduct");
        String proId = "";
        String proPrice = "";
        dbconnect instance = new dbconnect();
        boolean expResult = false;
        boolean result = instance.EditProduct(proId, proPrice);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of main method, of class dbconnect.
     */
    @Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = null;
        dbconnect.main(args);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
