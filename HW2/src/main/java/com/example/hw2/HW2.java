package com.example.hw2;

/**
 *
 * @author kortn
 */
public class HW2 {

    public static void main(String[] args) {
        Reader r = new Reader();
        Carnaval c = new Carnaval(r.read()); 
        c.dance();
    }
}
