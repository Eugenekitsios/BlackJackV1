package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Kaart> mijnDeck;

    public Deck() {

        this.mijnDeck = new ArrayList<Kaart>();
        //nieuw arraylist angemaakt, kaarten moeten toegevoegd worden.
        //kaart methode
    }

    public ArrayList<Kaart> maakdeckKaarten() { //dit is kaart 2 t/m 11 (zonder boer/koning/vrouw
        int value = 1;
        for (int i = 1; i <= 4; i++) {


            switch (value) {
                case 1:

                    for (int j = 2; j <= 12; j++) {
                        if (j > 11) {
                            Kaart kaart = new Kaart(10, "Schoppen");
                            kaart.setKaartNaam("Boer");
                            this.mijnDeck.add(kaart);
                            Kaart kaart2 = new Kaart(10, "Schoppen");
                            kaart2.setKaartNaam("Koningin");
                            this.mijnDeck.add(kaart2);
                            Kaart kaart3 = new Kaart(10, "Schoppen");
                            kaart3.setKaartNaam("Koning");
                            this.mijnDeck.add(kaart3);
                        } else if (j == 11) {
                            Kaart kaart = new Kaart(11, "Schoppen");
                            kaart.setKaartNaam("Aas");
                            this.mijnDeck.add(kaart);
                        } else {
                            Kaart kaart = new Kaart(j, "Schoppen");
                            this.mijnDeck.add(kaart);
                        }
                    }
                    value++;
                    continue;
                case 2:

                    for (int j = 2; j <= 12; j++) {
                        if (j > 11) {
                            Kaart kaart = new Kaart(10, "Ruiten");
                            kaart.setKaartNaam("Boer");
                            this.mijnDeck.add(kaart);
                            Kaart kaart2 = new Kaart(10, "Ruiten");
                            kaart2.setKaartNaam("Koningin");
                            this.mijnDeck.add(kaart2);
                            Kaart kaart3 = new Kaart(10, "Ruiten");
                            kaart3.setKaartNaam("Koning");
                            this.mijnDeck.add(kaart3);
                        } else if (j == 11) {
                            Kaart kaart = new Kaart(11, "Ruiten");
                            kaart.setKaartNaam("Aas");
                            this.mijnDeck.add(kaart);
                        } else {
                            Kaart kaart = new Kaart(j, "Ruiten");
                            this.mijnDeck.add(kaart);
                        }
                    }
                    value++;
                    continue;
                case 3:

                    for (int j = 2; j <= 12; j++) {
                        if (j > 11) {
                            Kaart kaart = new Kaart(10, "Klaver");
                            kaart.setKaartNaam("Boer");
                            this.mijnDeck.add(kaart);
                            Kaart kaart2 = new Kaart(10, "Klaver");
                            kaart2.setKaartNaam("Koningin");
                            this.mijnDeck.add(kaart2);
                            Kaart kaart3 = new Kaart(10, "Klaver");
                            kaart3.setKaartNaam("Koning");
                            this.mijnDeck.add(kaart3);
                        } else if (j == 11) {
                            Kaart kaart = new Kaart(11, "Klaver");
                            kaart.setKaartNaam("Aas");
                            this.mijnDeck.add(kaart);
                        } else {
                            Kaart kaart = new Kaart(j, "Klaver");
                            this.mijnDeck.add(kaart);
                        }
                    }
                    value++;
                    continue;
                case 4:

                    for (int j = 2; j <= 12; j++) {
                        if (j > 11) {
                            Kaart kaart = new Kaart(10, "Harten");
                            kaart.setKaartNaam("Boer");
                            this.mijnDeck.add(kaart);
                            Kaart kaart2 = new Kaart(10, "Harten");
                            kaart2.setKaartNaam("Koningin");
                            this.mijnDeck.add(kaart2);
                            Kaart kaart3 = new Kaart(10, "Harten");
                            kaart3.setKaartNaam("Koning");
                            this.mijnDeck.add(kaart3);
                        } else if (j == 11) {
                            Kaart kaart = new Kaart(11, "Harten");
                            kaart.setKaartNaam("Aas");
                            this.mijnDeck.add(kaart);
                        } else {
                            Kaart kaart = new Kaart(j, "Harten");
                            this.mijnDeck.add(kaart);
                        }
                    }
                    value++;
                    break;
            }
        }

        return this.mijnDeck;

    }

    public void printArrayList() {
        System.out.println("Deck bestaat uit");
        for (int i = 0; i < this.mijnDeck.size(); i++) {
            System.out.println(this.mijnDeck.get(i).getType() + " - " + this.mijnDeck.get(i).getNummer() + " " + this.mijnDeck.get(i).getKaartNaam());
        }
    }

    public void printArrayList(ArrayList<Kaart> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i).getType() + " " + arrayList.get(i).getNummer() + " " + arrayList.get(i).getKaartNaam());
        }
    }

    public void deckSchudden() {

        System.out.println("Deck is geschud:");
        Collections.shuffle(mijnDeck);
        for (int i = 0; i < this.mijnDeck.size(); i++) {
            System.out.println(this.mijnDeck.get(i).getType() + " - " + this.mijnDeck.get(i).getNummer() + " " + this.mijnDeck.get(i).getKaartNaam());
        }
    }

    public Kaart eerstekaartenPakken() {

        //System.out.println("Uw kaarten zijn:");

        //System.out.println(this.mijnDeck.get(0).getType() + this.mijnDeck.get(0).getNummer() + this.mijnDeck.get(0).getKaartNaam());
        //System.out.println(this.mijnDeck.get(1).getType() + this.mijnDeck.get(1).getNummer() + this.mijnDeck.get(1).getKaartNaam());


        //int a = this.mijnDeck.get(0).getNummer();
        // int b = this.mijnDeck.get(1).getNummer();
        //int som = a + b;

        Kaart kaart = this.mijnDeck.get(0);

        this.mijnDeck.remove(0);

        return kaart;
    }

    public Kaart kaartPakken() {

        Kaart kaart = this.mijnDeck.get(0);
        this.mijnDeck.remove(0);
        return kaart;
    }

}




   // public deckMaken (//arraylist) //arraylist toevoegen van verschillende typen kaarten

