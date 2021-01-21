
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author s1900015
 */
public class Main {

    //Sovellusluokka Blackjack.
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        //Luodaan uusiPakka peliä varten.
        Korttipakka uusiPakka = new Korttipakka();

        //Sekoitetaan uusiPakka ennen pelin alkua.
        uusiPakka.SekoitaPakka();

        //Luodaan uusi pelaaja.
        PelaajanKasi pelaaja = new PelaajanKasi();

        //Jaetaan pelaajalle kaksi korttia, jotka palautetaan PelaajanKasi-luokan otaKortti-metodiin (tallennetaan PelaajaKasi -luokan listaan).
        pelaaja.otaKortti(uusiPakka.jaaKortti());
        pelaaja.otaKortti(uusiPakka.jaaKortti());

        //Tulostetaan pelaajalle jaetut kortit.
        System.out.println("Jakaja jakaa pelaajalle alussa kaksi korttia: ");
        System.out.println(pelaaja);

        //Tulsotetaan pelaajan korttien summa.
        System.out.println("Korttien summa on: ");
        System.out.println(pelaaja.Summa());

        //Pelaajan peli ensimmäisten korttien jakamisen jälkeen. Peliä jatketaan niin kauan kuin pelaaja haluaa kortin tai korttien summa on yli 21.
        while (pelaaja.Summa() < 21) {
            System.out.println("Haluatko lisäkortin (paina enter) tai lopeta (kirjoita e).");
            String avainsana = lukija.nextLine();

            if (avainsana.equals("")) {
                pelaaja.otaKortti(uusiPakka.jaaKortti());
                System.out.println(pelaaja);
                System.out.println(pelaaja.Summa());
            }

            if (avainsana.equalsIgnoreCase("e") || pelaaja.Summa() > 21) {
                System.out.println("\nPelaajan käden summa on: " + pelaaja.Summa());
                break;
            }

        }

        if (pelaaja.Summa() == 21) {
            System.out.println("Ventti!");
        } else if (pelaaja.Summa() > 21) {
            //Jos pelaajan summa on enemmän kuin 21, pelaaja häviää automaattisesti pelin.
            System.out.println("Hävisit!");
        } else {

            System.out.println("-----------------------------------------\n");
            System.out.println("Jakajan vuoro pelata.\n");

            /* Main-luokan sisällä tehty jakajan vuoro.
            //Luodaan jakaja.
            PelaajanKasi jakaja = new PelaajanKasi();

            jakaja.otaKortti(uusiPakka.jaaKortti());
            System.out.println(jakaja);
            System.out.println(jakaja.Summa());

            while (jakaja.Summa() < 15) {
                jakaja.otaKortti(uusiPakka.jaaKortti());
                System.out.println(jakaja);
                System.out.println(jakaja.Summa());
            }
            
               System.out.println("Jakajan summa: " + jakaja.Summa() + "\n");
             */
            
            PelaajanKasi jakaja = new PelaajanKasi();
            JakajanVuoro(uusiPakka,jakaja);

            System.out.println("----------------------------------------- \n");

            /* Main-luokan sisällä tehty if ja else if -vertailu.
            if (pelaaja.Summa() == 21 && jakaja.Summa() == 21 || pelaaja.Summa() == jakaja.Summa()) {
                System.out.println("Tasapeli.Jakaja voitti.");
            } else if (pelaaja.Summa() < 21 && jakaja.Summa() > 21) {
                System.out.println("Pelaaja voitti");
            } else if (pelaaja.Summa() < 21 && pelaaja.Summa() > jakaja.Summa()) {
                System.out.println("Pelaaja voitti.");
            } else if (jakaja.Summa() == 21 && pelaaja.Summa() < 21) {
                System.out.println("Jakaja sai ventin ja voitti!");
            } else if (jakaja.Summa() < 21 && jakaja.Summa() > pelaaja.Summa()) {
                System.out.println("Jakaja voitti.");
            }
             */
            VertaaSumma(pelaaja, jakaja);

        }
    }

    //Jakajan vuoro pelata, jos pelaajan käsi jäi alle 21.
    static void JakajanVuoro(Korttipakka uusiPakka,PelaajanKasi jakaja) {

        jakaja.otaKortti(uusiPakka.jaaKortti());
        System.out.println(jakaja);
        System.out.println(jakaja.Summa());

        while (jakaja.Summa() < 15) {
            jakaja.otaKortti(uusiPakka.jaaKortti());
            System.out.println(jakaja);
            System.out.println(jakaja.Summa());
        }

        System.out.println("\nJakajan summa: " + jakaja.Summa());
    }

    static void VertaaSumma(PelaajanKasi pelaaja, PelaajanKasi jakaja) {

        if (pelaaja.Summa() == 21 && jakaja.Summa() == 21 || pelaaja.Summa() == jakaja.Summa()) {
            System.out.println("Tasapeli.Jakaja voitti.");
        } else if (pelaaja.Summa() < 21 && jakaja.Summa() > 21) {
            System.out.println("Pelaaja voitti");
        } else if (pelaaja.Summa() < 21 && pelaaja.Summa() > jakaja.Summa()) {
            System.out.println("Pelaaja voitti.");
        } else if (jakaja.Summa() == 21 && pelaaja.Summa() < 21) {
            System.out.println("Jakaja sai ventin ja voitti!");
        } else if (jakaja.Summa() < 21 && jakaja.Summa() > pelaaja.Summa()) {
            System.out.println("Jakaja voitti.");
        }

    }

}
