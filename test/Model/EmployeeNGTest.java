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
public class EmployeeNGTest {
    
    public EmployeeNGTest() {
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
     * Test of getEmpName method, of class Employee.
     */
    @Test
    public void testGetEmpName() {
        System.out.println("getEmpName");
        Employee instance = new Employee(1, "khadija", 12341, 8, true, "27/11/2023");
        String expResult = "khadija";
        String result = instance.getEmpName();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
     }

    /**
     * Test of setEmpName method, of class Employee.
     */
    @Test
    public void testSetEmpName() {
        System.out.println("setEmpName");
        String empName = "tiso";
        Employee instance = new Employee();
        instance.setEmpName(empName);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getEmpNum method, of class Employee.
     */
    @Test
    public void testGetEmpNum() {
        System.out.println("getEmpNum");
        Employee instance = new Employee(1, "khadija", 12341, 8, true, "27/11/2023");
        String expResult = "012902";
        String result = instance.getEmpNum();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setEmpNum method, of class Employee.
     */
    @Test
    public void testSetEmpNum() {
        System.out.println("setEmpNum");
        String empNum = "";
        Employee instance = new Employee();
        instance.setEmpNum(empNum);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmpAdd method, of class Employee.
     */
    @Test
    public void testGetEmpAdd() {
        System.out.println("getEmpAdd");
        Employee instance = new Employee();
        String expResult = "";
        String result = instance.getEmpAdd();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmpAdd method, of class Employee.
     */
    @Test
    public void testSetEmpAdd() {
        System.out.println("setEmpAdd");
        String empAdd = "";
        Employee instance = new Employee();
        instance.setEmpAdd(empAdd);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmpEmail method, of class Employee.
     */
    @Test
    public void testGetEmpEmail() {
        System.out.println("getEmpEmail");
        Employee instance = new Employee();
        String expResult = "";
        String result = instance.getEmpEmail();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setEmpEmail method, of class Employee.
     */
    @Test
    public void testSetEmpEmail() {
        System.out.println("setEmpEmail");
        String empEmail = "";
        Employee instance = new Employee();
        instance.setEmpEmail(empEmail);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getWorkingHours method, of class Employee.
     */
    @Test
    public void testGetWorkingHours() {
        System.out.println("getWorkingHours");
        Employee instance = new Employee(1, "khadija", 12341, 8, true, "27/11/2023");
        int expResult = 8;
        int result = instance.getWorkingHours();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setWorkingHours method, of class Employee.
     */
    @Test
    public void testSetWorkingHours() {
        System.out.println("setWorkingHours");
        int workingHours = 0;
        Employee instance = new Employee();
        instance.setWorkingHours(workingHours);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmpSalary method, of class Employee.
     */
    @Test
    public void testGetEmpSalary() {
        System.out.println("getEmpSalary");
        Employee instance = new Employee();
        int expResult = 0;
        int result = instance.getEmpSalary();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAttend method, of class Employee.
     */
    @Test
    public void testSetAttend() {
        System.out.println("setAttend");
        boolean attend = false;
        Employee instance = new Employee();
        instance.setAttend(attend);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDate method, of class Employee.
     */
    @Test
    public void testGetDate() {
        System.out.println("getDate");
        Employee instance = new Employee();
        String expResult = "";
        String result = instance.getDate();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDate method, of class Employee.
     */
    @Test
    public void testSetDate() {
        System.out.println("setDate");
        String date = "";
        Employee instance = new Employee();
        instance.setDate(date);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isAttend method, of class Employee.
     */
    @Test
    public void testIsAttend() {
        System.out.println("isAttend");
        Employee instance = new Employee();
        boolean expResult = false;
        boolean result = instance.isAttend();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setEmpSalary method, of class Employee.
     */
    @Test
    public void testSetEmpSalary() {
        System.out.println("setEmpSalary");
        int empSalary = 0;
        Employee instance = new Employee();
        instance.setEmpSalary(empSalary);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getId method, of class Employee.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Employee instance = new Employee();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setId method, of class Employee.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 33;
        Employee instance = new Employee();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmpAddress method, of class Employee.
     */
    @Test
    public void testGetEmpAddress() {
        System.out.println("getEmpAddress");
        Employee instance = new Employee();
        String expResult = "";
        String result = instance.getEmpAddress();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmpAddress method, of class Employee.
     */
    @Test
    public void testSetEmpAddress() {
        System.out.println("setEmpAddress");
        String empAddress = "";
        Employee instance = new Employee();
        instance.setEmpAddress(empAddress);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Attend method, of class Employee.
     */
    @Test
    public void testAttend() {
        System.out.println("Attend");
        Employee instance = new Employee();
        boolean expResult = false;
        boolean result = instance.Attend();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of increaseSalary method, of class Employee.
     */
    @Test
    public void testIncreaseSalary() {
        System.out.println("increaseSalary");
        Employee instance = new Employee();
        instance.increaseSalary();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
