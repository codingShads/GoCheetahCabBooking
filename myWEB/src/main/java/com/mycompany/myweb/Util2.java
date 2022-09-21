/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myweb;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ThileebanS
 */
public class Util2 {
    public static List<Car> getCar(){
        List<Car> car1 = new ArrayList<>();
        
        car1.add(new Car("Nissan", "Vanette", "45000", "1999"));
        car1.add(new Car("Mazda", "Bongo", "26000", "1995"));
        car1.add(new Car("Toyota", "Hiace", "50000", "1996"));
        
        return car1;
    }
}
