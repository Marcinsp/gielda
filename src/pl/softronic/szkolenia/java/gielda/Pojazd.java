package pl.softronic.szkolenia.java.gielda;

import java.time.LocalDate;
import java.util.Date;

public class Pojazd {
    private int id = 0;
    private String typPojazdu;
    private String marka;
    private String status;
    private int rok;
    private Float cena;
    private int idWlasciciel;
    private int idSprzedawca;
    private int idkupujacy;
    private LocalDate  dataZgloszenia;
    private LocalDate dataSprzedazy;
    private LocalDate dataWycofania;

    private Pojazd(){

    }

    public Pojazd(String typPojazdu, String marka, int rok, Float cena, int idWlasciciel, int idSprzedawca) {
        this.typPojazdu = typPojazdu;
        this.marka = marka;
        this.rok = rok;
        this.cena = cena;
        this.idWlasciciel = idWlasciciel;
        this.idSprzedawca = idSprzedawca;
    }

    public int getId() {
        return id;
    }

    public String getTypPojazdu() {
        return typPojazdu;
    }

    public String getMarka() {
        return marka;
    }

    public String getStatus() {
        return status;
    }

    public int getRok() {
        return rok;
    }

    public Float getCena() {
        return cena;
    }

    public int getIdWlasciciel() {
        return idWlasciciel;
    }

    public int getIdSprzedawca() {
        return idSprzedawca;
    }

    public int getIdkupujacy() {
        return idkupujacy;
    }

    public LocalDate getDataZgloszenia() {
        return dataZgloszenia;
    }

    public LocalDate getDataSprzedazy() {
        return dataSprzedazy;
    }

    public LocalDate getDataWycofania() {
        return dataWycofania;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public void setRok(int rok) {
        this.rok = rok;
    }

    public void setCena(Float cena) {
        this.cena = cena;
    }

    public void setIdWlasciciel(int idWlasciciel) {
        this.idWlasciciel = idWlasciciel;
    }

    public void setDataZgloszenia(LocalDate dataZgloszenia) {
        this.dataZgloszenia = dataZgloszenia;
    }

    public void setDataSprzedazy(LocalDate dataSprzedazy) {
        this.dataSprzedazy = dataSprzedazy;
    }

    public void setDataWycofania(LocalDate dataWycofania) {
        this.dataWycofania = dataWycofania;
    }

    @Override
    public String toString() {
        return "Pojazd{" +
                "typPojazdu='" + typPojazdu + '\'' +
                ", marka='" + marka + '\'' +
                ", rok=" + rok +
                ", cena=" + cena +
                '}';
    }
}
