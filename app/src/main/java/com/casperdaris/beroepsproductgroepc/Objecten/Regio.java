package com.casperdaris.beroepsproductgroepc.Objecten;

public class Regio {

    private String regioNaam, beschrijving, regioSoort, alarmNummer;
    private Regio hoofdRegio;
    private Stad hoofdStad;
    private Integer populatie;
    private Valuta regioValuta;

    public Regio(String regioNaam, String beschrijving, Regio hoofdRegio, Stad hoofdStad, Integer populatie, Valuta regioValuta, String regioSoort, String alarmNummer) {
        this.regioNaam = regioNaam;
        this.beschrijving = beschrijving;
        this.hoofdRegio = hoofdRegio;
        this.hoofdStad = hoofdStad;
        this.populatie = populatie;
        this.regioValuta = regioValuta;
        this.regioSoort = regioSoort;
        this.alarmNummer = alarmNummer;
    }

    public String getRegioNaam() {
        return regioNaam;
    }

    public void setRegioNaam(String regioNaam) {
        this.regioNaam = regioNaam;
    }

    public String getBeschrijving() {
        return beschrijving;
    }

    public void setBeschrijving(String beschrijving) {
        this.beschrijving = beschrijving;
    }

    public String getRegioSoort() {
        return regioSoort;
    }

    public void setRegioSoort(String regioSoort) {
        this.regioSoort = regioSoort;
    }

    public String getAlarmNummer() {
        return alarmNummer;
    }

    public void setAlarmNummer(String alarmNummer) {
        this.alarmNummer = alarmNummer;
    }

    public Regio getHoofdRegio() {
        return hoofdRegio;
    }

    public void setHoofdRegio(Regio hoofdRegio) {
        this.hoofdRegio = hoofdRegio;
    }

    public Stad getHoofdStad() {
        return hoofdStad;
    }

    public void setHoofdStad(Stad hoofdStad) {
        this.hoofdStad = hoofdStad;
    }

    public Integer getPopulatie() {
        return populatie;
    }

    public void setPopulatie(Integer populatie) {
        this.populatie = populatie;
    }

    public Valuta getRegioValuta() {
        return regioValuta;
    }

    public void setRegioValuta(Valuta regioValuta) {
        this.regioValuta = regioValuta;
    }
}
