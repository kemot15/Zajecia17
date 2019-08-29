package Zad2;

import java.util.ArrayList;
import java.util.List;

public class TireTest {
    public static void main(String[] args) {
        List<Tire> tires = new ArrayList<>();
        tires.add(new Tire("Pirelli", 18, TireType.SUMMER));
        tires.add(new Tire("Dunlop", 18, TireType.WINTER));

        System.out.println(tires);

    }
}
