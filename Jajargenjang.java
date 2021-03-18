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
public class Jajargenjang extends BangunDatar {
    // Def variabel
    double a, t, m;
    
    // Override
    @Override
    double L(){
        double L = a*t;
        System.out.println("Luas Jajargenjang       = " + L);
        return L;
    }
    @Override
    double K(){
        double K = 2*(a+m);
        System.out.println("Keliling Jajargenjang   = " + K);
        return K;
    }
    
}
