package Zad3;

import java.util.*;

public class Main {
    private static final int ADULT = 18;
    public static void main(String[] args) {
        Map<String, Drink> drinkList = getDrinks();
        showInfo(askClient(), drinkList);
    }

    private static Map<String, Drink> getDrinks (){
        Map<String, Drink> drinkLink = new HashMap<>();
        drinkLink.put("herbata", new Drink("herbata", DrinkType.SOFT, 5));
        drinkLink.put("sok", new Drink("sok", DrinkType.SMOOTHIE, 6));
        drinkLink.put("piwo", new Drink("piwo", DrinkType.ALCOHOLIC, 9));
        return drinkLink;
    }

    private static String askClient (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Co podac do picia");
        String drink = scanner.nextLine();
        scanner.close();
        return drink;
    }

    private static void showInfo (String drink, Map<String, Drink> drinks){
        Scanner scanner = new Scanner(System.in);
        Drink drink1 = drinks.get(drink);
        if(!drink1.getType().equals(null)) {
            switch (drink1.getType()) {
                case SOFT:
                case SMOOTHIE:
                    System.out.println("Cena: " + drink1.getPrice());
                    break;
                case ALCOHOLIC:
                    System.out.println("Podaj ile masz lat");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    if (age > ADULT)
                        System.out.println("Cena: " + drink1.getPrice());
                    else
                        System.out.println("Jestes za mlodu");
                    break;
            }
        }
    }
}
