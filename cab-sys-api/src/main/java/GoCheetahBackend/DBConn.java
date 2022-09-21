/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GoCheetahBackend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ThileebanS
 */
public class DBConn {
    private String URL = "jdbc:mysql://localhost:3306/cabbooking";
    private String USER = "root";
    private String pass = "pass";
         
    public List<Person> getPersons(){
        List<Person> persons = new ArrayList<>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(URL,USER,pass);
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * from person");
            
            while(rs.next()){
                Person p = new Person();
                p.setId(rs.getInt("id"));
                p.setName(rs.getString("first_name"));
                p.setMobileNo(rs.getString("contact"));
                
                persons.add(p);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DBConn.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBConn.class.getName()).log(Level.SEVERE, null, ex);
        }
        return persons;
    }
    
    public Person getPerson(int id){
        Person p = new Person();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(URL,USER,pass);
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * from person where id=" + id);
            
            while(rs.next()){
                p.setId(rs.getInt("id"));
                p.setName(rs.getString("first_name"));
                p.setMobileNo(rs.getString("contact"));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DBConn.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBConn.class.getName()).log(Level.SEVERE, null, ex);
        }
        return p;
    }

    public boolean addPerson(Person p){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(URL,USER,pass);
            Statement st = conn.createStatement();
            st.executeUpdate("INSERT INTO person (id,first_name,contact,mobile)"+ "VALUES"+"("+p.getId()+",'"+p.getName()+"','"+p.getMobileNo()+"', '"+p.getName()+"')");
               
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DBConn.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBConn.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public boolean updatePerson(Person p){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(URL,USER,pass);
            Statement st = conn.createStatement();
            st.executeUpdate("UPDATE person SET first_name = '"+p.getName()+"', contact = '"+p.getMobileNo()+"',first_name = '"+p.getName()+"' WHERE (id = "+p.getId()+")");
           
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DBConn.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBConn.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public boolean deletePerson(int id){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(URL,USER,pass);
            Statement st = conn.createStatement();
            st.executeUpdate("DELETE FROM person WHERE (id = "+id+")");
           
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DBConn.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBConn.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public User getUser(String username){
        User user = new User();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(URL,USER,pass);
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * from employee JOIN person on person_id = id where username='" + username+"'");
            
            while(rs.next()){
                user.setUsername(rs.getString("username"));
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("first_name"));
                user.setMobileNo(rs.getString("mobile"));
                user.setPassword(rs.getString("password"));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DBConn.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBConn.class.getName()).log(Level.SEVERE, null, ex);
        }
        return user;
    }
            
}
























