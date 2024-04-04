package com.cart.shopping;

import java.util.*;

public class ShoppingCartCalculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        List<String> cart = Arrays.asList(input.split("\\s+"));

        double cost = calculateTotalCostOfCart(cart);
        System.out.println("total cost of shopping cart: "+cost+"p");

    }


    public static double calculateTotalCostOfCart(List<String> shoppingCart) {
        double applePrice = 35;
        double bananaPrice = 20;
        double melonPrice = 50;
        double limePrice = 15;

        Map<String, Integer> itemCounts = new HashMap<>();
        for (String item : shoppingCart) {
            itemCounts.put(item, itemCounts.getOrDefault(item, 0) + 1);
        }

        double totalCost = 0;
        for (Map.Entry<String, Integer> entry : itemCounts.entrySet()) {
            String itemName = entry.getKey();
            int itemCount = entry.getValue();

            switch (itemName) {
                case "Apple":
                    totalCost += itemCount * applePrice;
                    break;
                case "Banana":
                    totalCost += itemCount * bananaPrice;
                    break;
                case "Melon":
                    int melonPairs = itemCount / 2;
                    totalCost += melonPairs * melonPrice; // Only pay for the paired melons
                    if (itemCount % 2 != 0) {
                        totalCost += melonPrice; // Add the price for the remaining unpaired melon
                    }
                    break;
                case "Lime":
                    int limeSetsOfThree = itemCount / 3; // Three for the price of two
                    int limeRemaining = itemCount % 3; // Remaining limes not part of the offer
                    totalCost += (limeSetsOfThree * 2 + limeRemaining) * limePrice;
                    break;
                default:
                    System.out.println("Unknown item: " + itemName);
            }
        }
        return totalCost;
    }
}

