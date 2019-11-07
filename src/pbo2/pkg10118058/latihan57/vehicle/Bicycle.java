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
public class Bicycle extends Vehicle {
    private int myGearCount;

    public Bicycle() {
    }

    @Override
    public void setMyModel(String myModel) {
        super.setMyModel(myModel); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getMyModel() {
        return super.getMyModel(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setMyBrand(String myBrand) {
        super.setMyBrand(myBrand); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getMyBrand() {
        return super.getMyBrand(); //To change body of generated methods, choose Tools | Templates.
    }

    
    public int getMyGearCount() {
        return myGearCount;
    }

    public void setMyGearCount(int myGearCount) {
        this.myGearCount = myGearCount;
    }
    
    
}
