/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl7.main;

import pl.edu.ur.oopl7.punkty.Punkt2D;
import pl.edu.ur.oopl7.punkty.Punkt3D;
import pl.edu.ur.oopl7.uczelnia.Student;

/**
 *
 * @author student
 */
public class Main {

    public static void main(String[] args) {
        Punkt2D[] array2D = new Punkt2D[100];
        Punkt3D[] array3D = new Punkt3D[100];
        int index = 1;
        Student s1 = new Student(123456, "dzienne", "informayka", 0, "Adam", "Nowak", "18.04.1995", "m");
        System.out.println(s1.toString());
        for (int i = 0; i < 100; i++) {
            array2D[i] = Punkt2D.losujWartosc();
            array3D[i] = Punkt3D.losujWartosc();
        }

        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 10; j++) {
                if (array2D[i].getX() == array3D[j].getX() && array2D[i].getY() == array3D[j].getY()) {
                    System.out.println(index + ". " + array2D[i].toString());
                    System.out.println(index + ". " + array3D[j].toString());
                    index++;
                }
            }
        }
    }
}
