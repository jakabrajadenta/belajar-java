/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luasbangundatar;

/**
 *
 * @author jakab
 */
public class Segitiga extends BangunDatar {
    // Def variabel segitiga siku2
    double a, t, m;
    
    // Override
    @Override
    double L(){
        double L = a*t/2;
        System.out.println("Luas Segitiga       = " + L);
        return L;
    }
    @Override
    double K(){
        double K = a + t + m;
        System.out.println("Keliling Segitiga   = " + K);
        return K;
    }
    
}
