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
public class Punkt2D {

    private int x;
    private int y;

    public Punkt2D() {
        this.x = 0;
        this.y = 0;
    }

    public Punkt2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Punkt2D{" + "x=" + x + ", y=" + y + '}';
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public static Punkt2D losujWartosc() {
        Random randomNumber = new Random();
        int x = randomNumber.nextInt(20) - 10;
        int y = randomNumber.nextInt(20) - 10;
        return new Punkt2D(x, y);
    }
}
