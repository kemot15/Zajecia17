package Zad4;

public enum Figury {
    TWO ("dwojka", "two"),
    THREE ("trojka", "three");

    private final String plName;
    private final String enName;

    Figury(String plName, String enName) {
        this.plName = plName;
        this.enName = enName;
    }

    public String getPlName() {
        return plName;
    }

    public String getEnName() {
        return enName;
    }
}
