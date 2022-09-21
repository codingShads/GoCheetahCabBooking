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
public class Car extends Vehicle{
    private String model;

    public Car(String model, String name, String price, String year) {
        super(name, price, year);
        this.model = model;
    }

    public Car() {
    }
    

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    
    
            
}
