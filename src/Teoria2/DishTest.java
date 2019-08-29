package Teoria2;

import java.util.Arrays;

public class DishTest {
    public static void main(String[] args) {
        Dish dish = new Dish("zupa", DishType.VEGETARIAN, 34);
        System.out.println(dish);
        System.out.println(dish.getType() == DishType.VEGETARIAN);
        System.out.println(dish.getType().getName());

        System.out.println(Arrays.toString(DishType.values()));

        dish.getType();
        switch (dish.getType()){
            case VEGETARIAN:
                System.out.println("wegetarianskie");
                break;
            case MEAT:
                System.out.println("miesne");
                break;
            case VEGE:
                System.out.println("Danie weganskie");
                break;
        }
    }
}
