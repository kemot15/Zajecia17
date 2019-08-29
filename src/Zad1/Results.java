package Zad1;

import java.math.BigDecimal;

public class Results {
    private BigDecimal netto;
    private BigDecimal brutto;
    private BigDecimal vat;

    public Results(BigDecimal netto, BigDecimal brutto, BigDecimal vat) {
        this.netto = netto;
        this.brutto = brutto;
        this.vat = vat;
    }

    public BigDecimal getNetto() {
        return netto;
    }

    public void setNetto(BigDecimal netto) {
        this.netto = netto;
    }

    public BigDecimal getBrutto() {
        return brutto;
    }

    public void setBrutto(BigDecimal brutto) {
        this.brutto = brutto;
    }

    public BigDecimal getVat() {
        return vat;
    }

    public void setVat(BigDecimal vat) {
        this.vat = vat;
    }

    @Override
    public String toString() {
        return  "netto: " + netto +
                "\nbrutto: " + brutto +
                "\nvat: " + vat + "\n";
    }
}
