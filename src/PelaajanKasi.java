import java.util.ArrayList;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author s1900015
 */

public class PelaajanKasi {

    //luokka PelaajanKasi, jolla on ArrayList<Kortti>-tyyppinen atribuutti kortit
    ArrayList<Kortti> kortit = new ArrayList();    

    //metodi otaKortti, joka lisää kortit-listaan parametrina saamansa kortin.
    public void otaKortti(Kortti pelaajanKortti) {  
       kortit.add(pelaajanKortti);
    }

    //metodi, joka selvittää pelaajan käden summan annetuin säännöin
    //kortin arvo 2-10:	käden summaan lisätään kortin numeroa vastaava arvo
    //kortin arvo 11-13: käden summaan lisätään 10 
    //kortin arvo 1 (ässä) käden summaan lisätään 11 
    public int Summa() {
        
        int summa = 0;
        
        for (Kortti kortti : kortit) {
            
            if (kortti.getArvo() == 1) {
                summa = summa + 11;
            } else if(kortti.getArvo() > 10){
                summa = summa+10;
            } else {
                summa = summa + kortti.getArvo();
            }
        } 
        return summa;
    }
    
    @Override
    public String toString() {
        return "" + kortit;
    }


}