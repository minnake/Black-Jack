/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author s1900015
 */
public class Kortti {

    //Luokka Kortti, jolla on atribuuttina arvo (int) ja maa (String).
    int arvo;
    String maa;

    //Konstruktori, joka luo olion.
    public Kortti(int arvo, String maa) {
        this.arvo = arvo;
        this.maa = maa;
    }

    //Parametrillinen konstruktori get- ja set -metodit ja toString -metodi.
    public int getArvo() {
        return arvo;
    }

    public void setArvo(int arvo) {
        this.arvo = arvo;
    }

    public String getMaa() {
        return maa;
    }

    public void setMaa(String maa) {
        this.maa = maa;
    }

    @Override
    public String toString() {
        return arvo + " " + maa;
    }
}
