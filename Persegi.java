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
public class Persegi extends BangunDatar {
    // Def variabel
    double s;
    
    // Override
    @Override
    double L(){
        double L = s*s;
        System.out.println("Luas Persegi        = " + L);
        return L;
    }
    @Override
    double K(){
        double K = 4*s;
        System.out.println("Keliling Persegi    = " + K);
        return K;
    }
    
}
