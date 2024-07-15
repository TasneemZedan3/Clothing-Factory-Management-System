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
public class saleManagerNGTest {
    
    public saleManagerNGTest() {
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
     * Test of getMangName method, of class saleManager.
     */
    @Test
    public void testGetMangName() {
        System.out.println("getMangName");
        saleManager instance = new saleManager("salem", "08223", "salem@", true);
        String expResult = "salem";
        String result = instance.getMangName();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setMangName method, of class saleManager.
     */
    @Test
    public void testSetMangName() {
        System.out.println("setMangName");
        String mangName = "";
        saleManager instance = new saleManager();
        instance.setMangName(mangName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMangNum method, of class saleManager.
     */
    @Test
    public void testGetMangNum() {
        System.out.println("getMangNum");
        saleManager instance = new saleManager("salem", "08223", "salem@", true);
        String expResult = "08223";
        String result = instance.getMangNum();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setMangNum method, of class saleManager.
     */
    @Test
    public void testSetMangNum() {
        System.out.println("setMangNum");
        String mangNum = "";
        saleManager instance = new saleManager();
        instance.setMangNum(mangNum);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMangEmail method, of class saleManager.
     */
    @Test
    public void testGetMangEmail() {
        System.out.println("getMangEmail");
        saleManager instance = new saleManager();
        String expResult = "";
        String result = instance.getMangEmail();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMangEmail method, of class saleManager.
     */
    @Test
    public void testSetMangEmail() {
        System.out.println("setMangEmail");
        String mangEmail = "";
        saleManager instance = new saleManager();
        instance.setMangEmail(mangEmail);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStratgies method, of class saleManager.
     */
    @Test
    public void testSetStratgies() {
        System.out.println("setStratgies");
        String Stratgies = "new stratgie";
        saleManager instance = new saleManager();
        instance.setStratgies(Stratgies);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getStratgies method, of class saleManager.
     */
    @Test
    public void testGetStratgies() {
        System.out.println("getStratgies");
        saleManager instance = new saleManager();
        String expResult = "new stratgies";
        String result = instance.getStratgies();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of isCampagin method, of class saleManager.
     */
    @Test
    public void testIsCampagin() {
        System.out.println("isCampagin");
        saleManager instance = new saleManager();
        boolean expResult = false;
        boolean result = instance.isCampagin();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCampagin method, of class saleManager.
     */
    @Test
    public void testSetCampagin() {
        System.out.println("setCampagin");
        boolean Campagin = false;
        saleManager instance = new saleManager();
        instance.setCampagin(Campagin);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of productPricing method, of class saleManager.
     */
    @Test
    public void testProductPricing() {
        System.out.println("productPricing");
        String price = "5002";
        saleManager instance = new saleManager();
        instance.productPricing(price);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of marketingStratgies method, of class saleManager.
     */
    @Test
    public void testMarketingStratgies() {
        System.out.println("marketingStratgies");
        saleManager instance = new saleManager();
        instance.marketingStratgies();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of startCampagin method, of class saleManager.
     */
    @Test
    public void testStartCampagin() {
        System.out.println("startCampagin");
        saleManager instance = new saleManager();
        instance.startCampagin();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of revenue method, of class saleManager.
     */
    @Test
    public void testRevenue() {
        System.out.println("revenue");
        int sales = 0;
        saleManager instance = new saleManager();
        instance.revenue(sales);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcTotalSale method, of class saleManager.
     */
    @Test
    public void testCalcTotalSale() {
        System.out.println("calcTotalSale");
        saleManager instance = new saleManager();
        instance.calcTotalSale();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
