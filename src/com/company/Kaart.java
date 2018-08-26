package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Kaart {

    private String kaartNaam; //eventueel weglaten (if 11 = aas).
    private int nummer;
    private String type;

    public Kaart(int nummer, String type) {
        this.kaartNaam = "";
        this.nummer = nummer;
        this.type = type;
    }

    public void setKaartNaam(String kaartNaam) {
        this.kaartNaam = kaartNaam;
    }

    public String getKaartNaam() {
        return kaartNaam;
    }

    public int getNummer() {
        return nummer;
    }

    public String getType() {
        return type;
    }

    ArrayList<Kaart> mijnDeck = new ArrayList<Kaart>();

}



//schoppen/klaver/ruiten/harten arraylist maken via eventuele loop //de bijzondere kaarten via andere loop adden.
