/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl7.uczelnia;

/**
 *
 * @author student
 */
public class Student extends Osoba {

    private int nrIndexu;
    private String typStudiow;
    private String kierunekStudiow;
    private int rokStudiow;

    public Student(int nrIndexu, String typStudiow, String kierunekStudiow, int rokStudiow, String imie, String nazwisko, String dataUrodzenia, String plec) {
        super(imie, nazwisko, dataUrodzenia, plec);
        this.nrIndexu = nrIndexu;
        this.typStudiow = typStudiow;
        this.kierunekStudiow = kierunekStudiow;
        this.rokStudiow = rokStudiow;
    }

    @Override
    public String toString() {
        return "Student{" + "nrIndexu=" + nrIndexu + ", typStudiow=" + typStudiow + ", kierunekStudiow=" + kierunekStudiow + ", rokStudiow=" + rokStudiow + " " + super.toString() + '}';
    }

}
