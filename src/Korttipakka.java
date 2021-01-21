
import java.util.ArrayList;
import java.util.Collections;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author s1900015
 */
public class Korttipakka {

    //ArrayList<Kortti>-tyyppinen atribuutti pakka.
    private ArrayList<Kortti> pakka;

    //Luokan oletuskonsturktio sijoittaa pakka-atribuuttiin halutun määrän 
    //52 korttisia korttipakkoja numero- ja maajärjestyksessä.
    public Korttipakka() {
        pakka = new ArrayList<>();

        for (int i = 1; i < 14; i++) {
            pakka.add(new Kortti(i, "Hertta"));
        }

        for (int i = 1; i < 14; i++) {
            pakka.add(new Kortti(i, "Ruutu"));
        }

        for (int i = 1; i < 14; i++) {
            pakka.add(new Kortti(i, "Risti"));
        }

        for (int i = 1; i < 14; i++) {
            pakka.add(new Kortti(i, "Pata"));
        }
        
    }

    //Metodi sekoita atribuutin "pakka"-listan korttien järjestyksen.
    public void SekoitaPakka() {
        Collections.shuffle(pakka);
    }

    //Metodi jaaKortti palauttaa pakan ensimmäisen kortin ja poistaa sen pakasta.
    //JaaKortti -> valitsee ensimmäisen pakasta ja poistaa sen pakasta.
    public Kortti jaaKortti() {
        Kortti jaettu = this.pakka.get(0);
        this.pakka.remove(0);
        return jaettu;
    }

    @Override
    public String toString() {
        return " " + pakka;
    }

}
