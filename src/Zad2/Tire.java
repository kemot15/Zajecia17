package Zad2;

public class Tire {
    private String name;
    private int size;
    private TireType type;

    public Tire() {
    }

    public Tire(String name, int size, TireType type) {
        this.name = name;
        this.size = size;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public TireType getType() {
        return type;
    }

    public void setType(TireType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Tire{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", type=" + type +
                '}';
    }
}

//    Istnieją trzy rodzaje opon:
//
//        Letnie,
//        Zimowe,
//        Uniwersalne
//        Stwórz klasę, która będzie reprezentowała oponę (wymyśl kilka pól,
//        które mogłyby ją opisywać, w tym jedno oznaczające jej typ).
//
//        Stwórz listę z kilkoma przykładowymi oponami, a następnie wyświetl o nich informacje w konsoli.