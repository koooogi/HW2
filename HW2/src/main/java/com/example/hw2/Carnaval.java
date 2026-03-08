/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.hw2;

import java.util.ArrayList;

public class Carnaval {
    
    private ArrayList<Dancer> dancers;

    public Carnaval(ArrayList<Dancer> dansers) {
        this.dancers = dansers;
    }

    public void dance(){
        dancers.stream().forEach(a -> a.dance());
    }
    
    public void add(Dancer d){
        dancers.add(d);
    }
}
