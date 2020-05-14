package com.casperdaris.beroepsproductgroepc.Objecten;

public class Stad {

    private String stadNaam;
    private Regio regioNaam;

    public Stad(String stadNaam, Regio regioNaam) {
        this.stadNaam = stadNaam;
        this.regioNaam = regioNaam;
    }

    public String getStadNaam() {
        return stadNaam;
    }

    public void setStadNaam(String stadNaam) {
        this.stadNaam = stadNaam;
    }

    public Regio getRegioNaam() {
        return regioNaam;
    }

    public void setRegioNaam(Regio regioNaam) {
        this.regioNaam = regioNaam;
    }
}
