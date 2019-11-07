/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118058.latihan57.vehicle;

/**
 *
 * @author user
 */
public class SkateBoard extends Vehicle {

    @Override
    public void setMyModel(String myModel) {
        super.setMyModel(myModel); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getMyModel() {
        return super.getMyModel(); //To change body of generated methods, choose Tools | Templates.
    }

    public SkateBoard() {
    }

    @Override
    public void setMyBrand(String myBrand) {
        super.setMyBrand(myBrand); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getMyBrand() {
        return super.getMyBrand(); //To change body of generated methods, choose Tools | Templates.
    }
    private double myBoarLength;

    public SkateBoard(double myBoarLength) {
        this.myBoarLength = myBoarLength;
    }

    public double getMyBoarLength() {
        return myBoarLength;
    }

    public void setMyBoarLength(double myBoarLength) {
        this.myBoarLength = myBoarLength;
    }
    
    
}
