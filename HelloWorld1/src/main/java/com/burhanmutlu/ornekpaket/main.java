/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.burhanmutlu.ornekpaket;

/**
 *
 * @author Burhan Mutlu
 */
public class main {
    public static void main(String[] args) {
        Bisiklet bisiklet1 = new Bisiklet();
  
        
        bisiklet1.setTekerlekSayisi(4);
        int tS = bisiklet1.getTekerlekSayisi();
        
        System.out.println(tS);
        System.out.println(bisiklet1.toString());
        
        Bisiklet bisiklet2 = new Bisiklet(2);
        String s = bisiklet2.getRenk();
        System.out.println(s);
        
        Bisiklet bisiklet3 = new Bisiklet(6, "mavi");
        s = bisiklet3.toString();
        System.out.println(s);
        
        
    }
}
