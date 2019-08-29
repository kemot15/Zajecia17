package Teoria2;

public enum DishType {
    //domyslnie public static final
    VEGE("Danie weganskie"),
    VEGETARIAN("Daniewegetarianskie"),
    MEAT("Danie miesne");

    private final String name;

    private DishType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
