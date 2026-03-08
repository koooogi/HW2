/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.hw2;

public class Dancer {
    
    String name;
    String style;
    
    public Dancer(String name, String style){
        this.name = name;
        this.style = style;
    }
    
    public void dance(){
        System.out.println(name + " dances " + style);
    }
}
