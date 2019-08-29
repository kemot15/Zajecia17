package Zad1;

import java.math.BigDecimal;

public class Product {
    private String name;
    private BigDecimal netto;
    private double vat;

    public Product() {
    }

    public Product(String name, BigDecimal netto, double vat) {
        this.name = name;
        this.netto = netto;
        this.vat = vat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getNetto() {
        return netto;
    }

    public void setNetto(BigDecimal netto) {
        this.netto = netto;
    }

    public double getVat() {
        return vat;
    }

    public void setVat(double vat) {
        this.vat = vat;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", netto=" + netto +
                ", vat=" + vat +
                '}';
    }
}

//    Napisz program który będzie przechowywał w liście zestawienie sprzedaży z obiektami zawierającymi:
//    nazwę sprzedanego towaru/usługi, cenę netto, stawkę VAT (np. "telewizor LG", 3.2, 23) i wypisuje:
//
//        Sumę sprzedaży netto.
//        Sumę podatku VAT.
//        Sumę sprzedaży brutto.
//        Do obliczeń i przechowywania kwot wykorzystaj klasę BigDecimal.
