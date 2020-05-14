package com.casperdaris.beroepsproductgroepc.Objecten;

public class Bezienswaardigheid {

    private String bezienswaardigheidNaam, beschrijving;
    private Regio regioNaam;
    private Stad stadNaam;
    private Boolean betaling;

    public Bezienswaardigheid(String bezienswaardigheidNaam, String beschrijving, Regio regioNaam, Stad stadNaam, Boolean betaling) {
        this.bezienswaardigheidNaam = bezienswaardigheidNaam;
        this.beschrijving = beschrijving;
        this.regioNaam = regioNaam;
        this.stadNaam = stadNaam;
        this.betaling = betaling;
    }

    public String getBezienswaardigheidNaam() {
        return bezienswaardigheidNaam;
    }

    public void setBezienswaardigheidNaam(String bezienswaardigheidNaam) {
        this.bezienswaardigheidNaam = bezienswaardigheidNaam;
    }

    public String getBeschrijving() {
        return beschrijving;
    }

    public void setBeschrijving(String beschrijving) {
        this.beschrijving = beschrijving;
    }

    public Regio getRegioNaam() {
        return regioNaam;
    }

    public void setRegioNaam(Regio regioNaam) {
        this.regioNaam = regioNaam;
    }

    public Stad getStadNaam() {
        return stadNaam;
    }

    public void setStadNaam(Stad stadNaam) {
        this.stadNaam = stadNaam;
    }

    public Boolean getBetaling() {
        return betaling;
    }

    public void setBetaling(Boolean betaling) {
        this.betaling = betaling;
    }
}
