/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl7.main;

import pl.edu.ur.oopl7.uczelnia.Student;

/**
 *
 * @author student
 */
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(123456, "dzienne", "informayka", 0,"Adam", "Nowak", "18.04.1995", "m");
        System.out.println(s1.toString());
    }
}
