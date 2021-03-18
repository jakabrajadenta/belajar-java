/*
 * 
 */
package luasbangundatar;

/**
 * @author jakab
 */
public class Main {
    public static void main(String[] args){
        BangunDatar bd     = new BangunDatar();
        
        // Bangun datar input
        Persegi psg        = new Persegi();
        psg.s   = 5;
        PersegiPanjang psp = new PersegiPanjang();
        psp.p   = 10;
        psp.l   = 4;
        Jajargenjang jjg   = new Jajargenjang();
        jjg.a   = 8;
        jjg.t   = 5;
        jjg.m   = 6;
        Segitiga sgt       = new Segitiga();
        sgt.a   = 6;
        sgt.t   = 8;
        sgt.m   = Math.sqrt(sgt.a*sgt.a+sgt.t*sgt.t);
        Lingkaran lkg      = new Lingkaran();
        lkg.r   = 10;
        
        System.out.println("----------------------------------------");
        bd.L();
        psg.L();
        bd.K();
        psg.K();
        System.out.println("----------------------------------------");
        bd.L();
        psp.L();
        bd.K();
        psp.K();
        System.out.println("----------------------------------------");
        bd.L();
        jjg.L();
        bd.K();
        jjg.K();
        System.out.println("----------------------------------------");
        bd.L();
        sgt.L();
        bd.K();
        sgt.K();
        System.out.println("----------------------------------------");
        bd.L();
        lkg.L();
        bd.K();
        lkg.K();
        System.out.println("----------------------------------------");
        
    }
}
