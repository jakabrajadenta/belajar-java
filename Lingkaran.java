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
public class Lingkaran extends BangunDatar {
    // Def variabel
    double r;
    final double pi = 3.14;
    
    // Override
    @Override
    double L(){
        double L = pi*r*r;
        System.out.println("Luas Lingkaran      = " + L);
        return L;
    }
    @Override
    double K(){
        double K = 2*pi*r;
        System.out.println("Keliling Lingkaran  = " + K);
        return K;
    }
    
}
