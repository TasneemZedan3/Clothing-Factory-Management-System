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
public class ReportNGTest {
    
    public ReportNGTest() {
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
     * Test of getProfit method, of class Report.
     */
    @Test
  public void testGetProfit() {
        System.out.println("getProfit");
        Report instance = new Report("1","20000","3500");
        String expResult = "3500";
        String result = instance.getProfit();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setProfit method, of class Report.
     */
    @Test
    public void testSetProfit() {
        System.out.println("setProfit");
        String profit = "4566";
        Report instance = null;
        instance.setProfit(profit);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getWeek method, of class Report.
     */
    @Test
    public void testGetWeek() {
        System.out.println("getWeek");
        Report instance = null;
        String expResult = "1";
        String result = instance.getWeek();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setWeek method, of class Report.
     */
    @Test
    public void testSetWeek() {
        System.out.println("setWeek");
        String week = "11";
        Report instance = null;
        instance.setWeek(week);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getSales method, of class Report.
     */
    @Test
    public void testGetSales() {
        System.out.println("getSales");
        Report instance = null;
        String expResult = "9500";
        String result = instance.getSales();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setSales method, of class Report.
     */
    @Test
    public void testSetSales() {
        System.out.println("setSales");
        String sales = "5432";
        Report instance = null;
        instance.setSales(sales);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
