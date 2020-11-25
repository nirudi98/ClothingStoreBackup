/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DELL
 */
public class productBeanTest {
    
    public productBeanTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getProductName method, of class productBean.
     */
    @Test
    public void testGetProductName() {
        System.out.println("getProductName");
        productBean instance = new productBean();
        String expResult = "";
        String result = instance.getProductName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProductName method, of class productBean.
     */
    @Test
    public void testSetProductName() {
        System.out.println("setProductName");
        String productName = "";
        productBean instance = new productBean();
        instance.setProductName(productName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSize method, of class productBean.
     */
    @Test
    public void testGetSize() {
        System.out.println("getSize");
        productBean instance = new productBean();
        String expResult = "";
        String result = instance.getSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSize method, of class productBean.
     */
    @Test
    public void testSetSize() {
        System.out.println("setSize");
        String size = "";
        productBean instance = new productBean();
        instance.setSize(size);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getColor method, of class productBean.
     */
    @Test
    public void testGetColor() {
        System.out.println("getColor");
        productBean instance = new productBean();
        String expResult = "";
        String result = instance.getColor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setColor method, of class productBean.
     */
    @Test
    public void testSetColor() {
        System.out.println("setColor");
        String color = "";
        productBean instance = new productBean();
        instance.setColor(color);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAmount method, of class productBean.
     */
    @Test
    public void testGetAmount() {
        System.out.println("getAmount");
        productBean instance = new productBean();
        int expResult = 0;
        int result = instance.getAmount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAmount method, of class productBean.
     */
    @Test
    public void testSetAmount() {
        System.out.println("setAmount");
        int amount = 0;
        productBean instance = new productBean();
        instance.setAmount(amount);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPid method, of class productBean.
     */
    @Test
    public void testGetPid() {
        System.out.println("getPid");
        productBean instance = new productBean();
        int expResult = 0;
        int result = instance.getPid();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPid method, of class productBean.
     */
    @Test
    public void testSetPid() {
        System.out.println("setPid");
        int pid = 0;
        productBean instance = new productBean();
        instance.setPid(pid);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotal method, of class productBean.
     */
    @Test
    public void testGetTotal() {
        System.out.println("getTotal");
        productBean instance = new productBean();
        Double expResult = null;
        Double result = instance.getTotal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTotal method, of class productBean.
     */
    @Test
    public void testSetTotal() {
        System.out.println("setTotal");
        Double total = null;
        productBean instance = new productBean();
        instance.setTotal(total);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
