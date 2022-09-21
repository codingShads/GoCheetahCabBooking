/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GoCheetahBackend;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ThileebanS
 */
public class DBConnTest {
    
    public DBConnTest() {
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
     * Test of getPersons method, of class DBConn.
     */
//    @Test
//    public void testGetPersons() {
//        System.out.println("getPersons");
//        DBConn instance = new DBConn();
//        List<Person> expResult = null;
//        List<Person> result = instance.getPersons();
//        assertEquals(expResult, result);
//        
//    }

    /**
     * Test of getPerson method, of class DBConn.
     */
    @Test
    public void testGetPerson() {
        System.out.println("getPerson");
        int id = 1;
        DBConn instance = new DBConn();
        Person expResult = new Person(1, "Andrew1234", "0768456");
        Person result = instance.getPerson(id);
        assertEquals(expResult.getId(), result.getId());
        assertEquals(expResult.getName(), result.getName());
        assertEquals(expResult.getMobileNo(), result.getMobileNo());
    }

    /**
     * Test of getUser method, of class DBConn.
     */
    //@Test
//    public void testGetUser() {
//        System.out.println("getUser");
//        String username = "";
//        DBConn instance = new DBConn();
//        User expResult = null;
//        User result = instance.getUser(username);
//        assertEquals(expResult, result);
//        
//    }

    /**
     * Test of addPerson method, of class DBConn.
     */
    @Test
    public void testAddPerson() {
        System.out.println("addPerson");
        Person p = new Person(5, "Insert", "0768700000");
        DBConn instance = new DBConn();
        Person expResult = instance.getPerson(p.getId());
        boolean result = instance.addPerson(p);
        assertEquals(expResult.getId(), p.getId());
        assertEquals(expResult.getName(), p.getName());
        assertEquals(expResult.getMobileNo(), p.getMobileNo());
    }

    /**
     * Test of updatePerson method, of class DBConn.
     */
//    @Test
//    public void testUpdatePerson() {
//        System.out.println("updatePerson");
//        Person p = new Person();
//        p.setName("New Name");
//        p.setMobileNo("New mobile");
//        DBConn instance = new DBConn();
//        Person expResult = instance.getPerson(p.getId());
//        boolean result = instance.updatePerson(p);
//        assertEquals(expResult.getId(), p.getId());
//        assertEquals(expResult.getName(), p.getName());
//    }

    /**
     * Test of deletePerson method, of class DBConn.
     */
    @Test
    public void testDeletePerson() {
        System.out.println("deletePerson");
        int id = 1;
        DBConn instance = new DBConn();
        boolean expResult = false;
        boolean result = instance.deletePerson(id);
        assertEquals(expResult, result);
        
    }
    
}



















