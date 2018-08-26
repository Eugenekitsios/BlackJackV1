package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Deck testDeck = new Deck();
        testDeck.maakdeckKaarten();
        testDeck.printArrayList();
        System.out.println("****************************************");
        System.out.println("****************************************");
        testDeck.deckSchudden();

       // int som = testDeck.eerstekaartenPakken();

        Kaart kaart = testDeck.eerstekaartenPakken();
        Kaart kaart2 = testDeck.eerstekaartenPakken();
        ArrayList<Kaart> hand = new ArrayList<Kaart>();
        hand.add(kaart);
        hand.add(kaart2);
        int som = kaart.getNummer() + kaart2.getNummer();

        System.out.println("****************************************");

        System.out.println("Welkom bij Blackjack. U heeft: ");
        testDeck.printArrayList(hand);
        System.out.println("Aantal punten: " + som);


        System.out.println("****************************************");
        System.out.println("****************************************");
        toonOpties();
        int i = 0;


        boolean quit = false;
        while (!quit){

            //System.out.println(kaart.getType() + kaart.getNummer() + kaart.getKaartNaam());
            //System.out.println(kaart2.getType() + kaart2.getNummer() + kaart2.getKaartNaam());

            System.out.println("Voer uw keuze in");
            char keuze = scanner.next().charAt(0);


            switch(keuze){
                case 'q':
                    System.out.println("Programma sluit");
                    quit = true;
                    break;
                case 'k':
                    Kaart kaartNieuw = testDeck.kaartPakken();
                    System.out.println("U heeft een " + kaartNieuw.getType() + " " + kaartNieuw.getNummer() + " " + kaartNieuw.getKaartNaam() + " getrokken");
                    hand.add(kaartNieuw);

                    testDeck.printArrayList(hand);
                    som += kaartNieuw.getNummer();

                    if(som>21){

                        if (bevatAas(hand)){
                            if (i==0){
                            som -= 10;
                            ++i;
                            }
                            if(som>21){
                                System.out.println("U bent af met " + som + " punten");
                                quit = true;
                                break;
                            } else {
                                System.out.println("U heeft " + som + " punten");
                                continue;
                            }
                        } else {
                            System.out.println("U bent af");
                            quit = true;
                            break;
                        }
                    } else {
                        System.out.println("U heeft " + som + " punten");
                    }
                    continue;
                case 'p':
                    System.out.println("U heeft " + som + " punten");
                    testDeck.printArrayList(hand);
                    quit = true;
                    break;
            }
        }


    }

    public static void toonOpties(){
        System.out.println("Toets: \n" +
                "k - voor een kaart \n" +
                "p - om te passen\n" +
                "q - om te stoppen");

    }

    public static boolean bevatAas(ArrayList<Kaart> arrayList){
        for(int i =0; i<arrayList.size(); i++) {
            Kaart kaart = arrayList.get(i);
            if (kaart.getKaartNaam().equals("Aas")) {
                return true;
            }
        } return false;
    }

}
