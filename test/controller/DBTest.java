/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.ResultSet;
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
public class DBTest {
    
    public DBTest() {
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
     * Test of createMyConnection method, of class DB.
     */
    @Test
    public void testCreateMyConnection() throws Exception {
        System.out.println("createMyConnection");
        DB.createMyConnection();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of iud method, of class DB.
     */
    @Test
    public void testIud() throws Exception {
        System.out.println("iud");
        String sql = "";
        DB.iud(sql);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of search method, of class DB.
     */
    @Test
    public void testSearch() throws Exception {
        System.out.println("search");
        String sql = "";
        ResultSet expResult = null;
        ResultSet result = DB.search(sql);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMyConnection method, of class DB.
     */
    @Test
    public void testGetMyConnection() throws Exception {
        System.out.println("getMyConnection");
        Connection expResult = null;
        Connection result = DB.getMyConnection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
