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
public class Osoba {

    private String imie;
    private String nazwisko;
    private String dataUrodzenia;
    private String plec;

    public Osoba(String imie, String nazwisko, String dataUrodzenia, String plec) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
        this.plec = plec;
    }

    @Override
    public String toString() {
        return "imie=" + imie + ", nazwisko=" + nazwisko + ", dataUrodzenia=" + dataUrodzenia + ", plec=" + plec;
    }

}
