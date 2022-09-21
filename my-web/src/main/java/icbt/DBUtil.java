/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icbt;

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
public class DBUtil {
    private final String url = "jdbc:mysql://localhost:3306/batch2323";
    private final String user = "root";
    private final String password = "pass";
    //private final String query = "SELECT * FROM person";
            
    public List<Person> getPersons(){ 
        List<Person> persons = new ArrayList<>();
    
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM person");
            
            while(rs.next()){
                Person p = new Person();
                p.setID(rs.getInt("id"));
                p.setFirstName(rs.getString("first_name"));
                p.setLastName(rs.getString("last_name"));
                p.setNic(rs.getString("nic"));
                
                persons.add(p);
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(DBUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        return persons;
    }
    
    public Person getPerson(int id){ 
        Person p = new Person();
    
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM person where id=" + id);
            
            while(rs.next()){
                p.setID(rs.getInt("id"));
                p.setFirstName(rs.getString("first_name"));
                p.setLastName(rs.getString("last_name"));
                p.setNic(rs.getString("nic"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBUtil.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        return p;
    }
    
    public User getUser(String username){ 
        User u = new User();
    
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM users JOIN person_id = id WHERE username ='"+username+"'");
            
            while(rs.next()){
                u.setID(rs.getInt("id"));
                u.setFirstName(rs.getString("first_name"));
                u.setLastName(rs.getString("last_name"));
                u.setNic(rs.getString("nic"));
                u.setUsername(rs.getString("username"));
                u.setPassword(rs.getString("password"));
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(DBUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        return u;
    }
}
