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
public class PersegiPanjang extends BangunDatar {
    // Def variabel
    double p, l;
    
    // Override
    @Override
    double L(){
        double L = p*l;
        System.out.println("Luas Persegi Panjang    = " + L);
        return L;
    }
    @Override
    double K(){
        double K = 2*(p+l);
        System.out.println("Keliling Persegi Panjang= " + K);
        return K;
    }
    
}
