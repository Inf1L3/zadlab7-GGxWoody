/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl7.punkty;

import java.util.Random;

/**
 *
 * @author Przemek
 */
public class Punkt3D extends Punkt2D {

    private int z;

    public Punkt3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public Punkt3D() {
        super(0, 0);
        this.z = 0;
    }

    @Override
    public String toString() {
        return "Punkt3D{" + "x=" + super.getX() + " y=" + super.getY() + " z=" + z + '}';
    }

    public static Punkt3D losujWartosc() {
        Random randomNumber = new Random();
        int x = randomNumber.nextInt(20) - 10;
        int y = randomNumber.nextInt(20) - 10;
        int z = randomNumber.nextInt(20) - 10;
        return new Punkt3D(x, y, z);
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
    
    
}
