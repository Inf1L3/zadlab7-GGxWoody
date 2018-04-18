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
public class Wykladowca extends Osoba {

    private String tytulNaukowy;
    private int stazPracy;
    private String przedmiotWykladany;

    public Wykladowca(String tytulNaukowy, int stazPracy, String przedmiotWykladany, String imie, String nazwisko, String dataUrodzenia, String plec) {
        super(imie, nazwisko, dataUrodzenia, plec);
        this.tytulNaukowy = tytulNaukowy;
        this.stazPracy = stazPracy;
        this.przedmiotWykladany = przedmiotWykladany;
    }

    @Override
    public String toString() {
        return "Wykladowca{" + "tytulNaukowy=" + tytulNaukowy + ", stazPracy=" + stazPracy + ", przedmiotWykladany=" + " " + przedmiotWykladany + super.toString() + '}';
    }

}
