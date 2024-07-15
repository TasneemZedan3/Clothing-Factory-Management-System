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
public class SectionManagerNGTest {
    
    public SectionManagerNGTest() {
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
     * Test of getMangName method, of class SectionManager.
     */
    @Test
    public void testGetMangName() {
        System.out.println("getMangName");
        SectionManager instance = new SectionManager();
        String expResult = "product manager";
        String result = instance.getMangName();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setMangName method, of class SectionManager.
     */
    @Test
    public void testSetMangName() {
        System.out.println("setMangName");
        String mangName = "sale manager";
        SectionManager instance = new SectionManager();
        instance.setMangName(mangName);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getMangNum method, of class SectionManager.
     */
    @Test
    public void testGetMangNum() {
        System.out.println("getMangNum");
        SectionManager instance = new SectionManager();
        String expResult = "";
        String result = instance.getMangNum();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setMangNum method, of class SectionManager.
     */
    @Test
    public void testSetMangNum() {
        System.out.println("setMangNum");
        String mangNum = "";
        SectionManager instance = new SectionManager();
        instance.setMangNum(mangNum);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getMangEmail method, of class SectionManager.
     */
    @Test
    public void testGetMangEmail() {
        System.out.println("getMangEmail");
        SectionManager instance = new SectionManager("mazen", "011", "mazen@");
        String expResult = "mazen@";
        String result = instance.getMangEmail();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setMangEmail method, of class SectionManager.
     */
    @Test
    public void testSetMangEmail() {
        System.out.println("setMangEmail");
        String mangEmail = "";
        SectionManager instance = new SectionManager();
        instance.setMangEmail(mangEmail);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setPm method, of class SectionManager.
     */
    @Test
    public void testSetPm() {
        System.out.println("setPm");
        productManager pm = null;
        SectionManager instance = new SectionManager();
        instance.setPm(pm);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setSm method, of class SectionManager.
     */
    @Test
    public void testSetSm() {
        System.out.println("setSm");
        saleManager sm = null;
        SectionManager instance = new SectionManager();
        instance.setSm(sm);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of addEmployee method, of class SectionManager.
     */
    @Test
    public void testAddEmployee() {
        System.out.println("addEmployee");
        Employee emp = null;
        SectionManager instance = new SectionManager();
        instance.addEmployee(emp);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of addReport method, of class SectionManager.
     */
    @Test
    public void testAddReport() {
        System.out.println("addReport");
        Report r = new Report("90", "3234", "3552");
        SectionManager instance = new SectionManager();
        instance.addReport(r);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of removeEmployee method, of class SectionManager.
     */
    @Test
    public void testRemoveEmployee() {
        System.out.println("removeEmployee");
        int id = 0;
        SectionManager instance = new SectionManager();
        instance.removeEmployee(id);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of showReport method, of class SectionManager.
     */
    @Test
    public void testShowReport() {
        System.out.println("showReport");
        SectionManager instance = new SectionManager();
        instance.showReport();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of addProduct method, of class SectionManager.
     */
    @Test
    public void testAddProduct() {
        System.out.println("addProduct");
        Product p =  new Product("8", "shoe", "3543");
        SectionManager instance = new SectionManager();
        instance.addProduct(p);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of editProduct method, of class SectionManager.
     */
    @Test
    public void testEditProduct() {
        System.out.println("editProduct");
        Product p = null;
        String name = "";
        String color = "";
        String price = "";
        char sizeChart = ' ';
        SectionManager instance = new SectionManager();
        instance.editProduct(p, name, color, price, sizeChart);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of RemoveProduct method, of class SectionManager.
     */
    @Test
    public void testRemoveProduct() {
        System.out.println("RemoveProduct");
        Product p1 = null;
        SectionManager instance = new SectionManager();
        instance.RemoveProduct(p1);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of addAttendance method, of class SectionManager.
     */
    @Test
    public void testAddAttendance() {
        System.out.println("addAttendance");
        Employee emp = null;
        SectionManager instance = new SectionManager();
        instance.addAttendance(emp);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of checkAttendance method, of class SectionManager.
     */
    @Test
    public void testCheckAttendance() {
        System.out.println("checkAttendance");
        String name = "attend";
        int id = 0;
        SectionManager instance = new SectionManager();
        boolean expResult = false;
        boolean result = instance.checkAttendance(name, id);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
