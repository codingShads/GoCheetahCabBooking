/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icbt;

import icbt.Person;

/**
 *
 * @author ThileebanS
 */
public class User extends Person{
    private String username;
    private String password;
    
    public User(){
        
    }

    public User(String username, String password, int id, String firstName, String lastName) {
        super.setID(id);
        super.setFirstName(firstName);
        super.setLastName(lastName);
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
