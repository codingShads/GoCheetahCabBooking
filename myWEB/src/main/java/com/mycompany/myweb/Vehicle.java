/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myweb;

/**
 *
 * @author ThileebanS
 */
public class Vehicle {
    private String name;
    private String price;
    private String year;
    
    public Vehicle(){
        
    }

    public Vehicle(String name, String price, String year) {
        this.name = name;
        this.price = price;
        this.year = year;
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
    
    
}
