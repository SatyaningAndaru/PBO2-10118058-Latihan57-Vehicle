/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118058.latihan57.vehicle;

/**
 *
 * @author user
 *  Nama:Satyaning Andaru bawalaksana
     * Nim: 10118058
     * kelas : If-2
 */
public class PBO210118058Latihan57Vehicle {

    /**
     * @param args the command line arguments
     * Nama:Satyaning Andaru bawalaksana
     * Nim: 10118058
     * kelas : If-2
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bicycle b = new Bicycle();
        b.setMyBrand("Trek Bike");
        b.setMyModel("7.4FX");
        b.setMyGearCount(23);
        System.out.println("Bicycle");
        System.out.println("Brand : "+b.getMyBrand());
        System.out.println("Model : "+b.getMyModel());
        System.out.println("Jumlah Gear : "+b.getMyGearCount());
        System.out.println("");
        SkateBoard s =new SkateBoard ();
        s.setMyBrand("Ally Skate");
        s.setMyModel("Rocket");
        s.setMyBoarLength(54.5);
        System.out.println("Skateboard");
        System.out.println("Brand : "+s.getMyBrand());
        System.out.println("Model : "+s.getMyModel());
        System.out.println("Panjangnya Board : "+s.getMyBoarLength());
        
        
    }
    
}
