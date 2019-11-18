package machine;

import java.util.Scanner;

public class TestApp {
    public static void main(String[] args) {

        int numberOfCoffeeCupsToProduce  = 10;
        int numberOfCoffeeCupsPossibleToProduce;
        //        200 ml of water, 50 ml of milk, and 15 g of coffee beans.
        final int neededIngredientsWaterPerCup = 200;
        final int neededIngredientsMilkPerCup = 50;
        final int neededIngredientsCoffeBeansPerCup = 15;

        int neededIngredientsWaterForThisNumberOfCups;
        int neededIngredientsMilkForThisNumberOfCups;
        int neededIngredientsCoffeBeansForThisNumberOfCups;

        int containerIngredientsWater = 500;
        int containerIngredientsMilk = 250;
        int containerIngredientsCoffeBeans = 200;


        Scanner sc = new Scanner(System.in);

//        System.out.println("Write how many ml of water the coffee machine has:");
//        System.out.print(">");
//        containerIngredientsWater = sc.nextInt();
//        System.out.println("Write how many ml of milk the coffee machine has:");
//        System.out.print(">");
//        containerIngredientsMilk = sc.nextInt();
//        System.out.println("Write how many grams of coffee beans the coffee machine has: ");
//        System.out.print(">");
//        containerIngredientsCoffeBeans = sc.nextInt();
//
//        System.out.println("Write how many cups of coffe you will need:");
//        System.out.print(">");
//        numberOfCoffeeCupsToProduce = sc.nextInt();

        neededIngredientsWaterForThisNumberOfCups = numberOfCoffeeCupsToProduce * neededIngredientsWaterPerCup;
        neededIngredientsMilkForThisNumberOfCups = numberOfCoffeeCupsToProduce * neededIngredientsMilkPerCup;
        neededIngredientsCoffeBeansForThisNumberOfCups = numberOfCoffeeCupsToProduce * neededIngredientsCoffeBeansPerCup;


//        System.out.println("For " + numberOfCoffeeCupsToProduce
//                + " cups of coffee you will need: \n"
//                + neededIngredientsWaterPerCup * numberOfCoffeeCupsToProduce + " ml of water \n"
//                + neededIngredientsMilkPerCup * numberOfCoffeeCupsToProduce + " ml of milk \n"
//                + neededIngredientsCoffeBeansPerCup * numberOfCoffeeCupsToProduce + " g of coffee beans \n");


        if ((containerIngredientsWater == 0 || containerIngredientsMilk == 0 || containerIngredientsCoffeBeans == 0) && numberOfCoffeeCupsToProduce > 0) {
            // No, I can make only 0 cup(s) of coffee
            System.out.println("No, I can make only 0 cup(s) of coffee");
        } else if ((containerIngredientsWater == 0 || containerIngredientsMilk == 0 || containerIngredientsCoffeBeans == 0) && numberOfCoffeeCupsToProduce == 0) {
            // No, I can make only 0 cup(s) of coffee
            System.out.println("Yes, I can make only 0 cup(s) of coffee");
        } else if (neededIngredientsCoffeBeansForThisNumberOfCups < containerIngredientsWater
                && neededIngredientsMilkForThisNumberOfCups < containerIngredientsMilk
                && neededIngredientsCoffeBeansForThisNumberOfCups < containerIngredientsCoffeBeans) {

            containerIngredientsWater = containerIngredientsWater - neededIngredientsWaterForThisNumberOfCups;
            containerIngredientsMilk = containerIngredientsMilk - neededIngredientsMilkForThisNumberOfCups;
            containerIngredientsCoffeBeans = containerIngredientsCoffeBeans - neededIngredientsCoffeBeansForThisNumberOfCups;

            if (numberOfCoffeeCupsToProduce == 1) {
                System.out.println("Yes, I can make that amount of coffee");
            }else if (containerIngredientsWater > containerIngredientsMilk && containerIngredientsWater > containerIngredientsCoffeBeans) {
                numberOfCoffeeCupsPossibleToProduce = containerIngredientsWater / neededIngredientsWaterPerCup;
                System.out.println("Yes, I can make that amount of coffee (and even " + numberOfCoffeeCupsPossibleToProduce + " more than that)");
            } else if (containerIngredientsMilk > containerIngredientsWater && containerIngredientsMilk > containerIngredientsCoffeBeans) {
                numberOfCoffeeCupsPossibleToProduce = containerIngredientsMilk / neededIngredientsMilkPerCup;
                System.out.println("Yes, I can make that amount of coffee (and even " + numberOfCoffeeCupsPossibleToProduce + " more than that)");
            } else {
                numberOfCoffeeCupsPossibleToProduce = containerIngredientsCoffeBeans / neededIngredientsCoffeBeansPerCup;
                System.out.println("Yes, I can make that amount of coffee (and even " + numberOfCoffeeCupsPossibleToProduce + " more than that)");
            }

        }else if ((neededIngredientsWaterForThisNumberOfCups > containerIngredientsWater
                || neededIngredientsMilkForThisNumberOfCups > containerIngredientsMilk
                || neededIngredientsCoffeBeansForThisNumberOfCups > containerIngredientsCoffeBeans) && numberOfCoffeeCupsToProduce > 0)
        {
            if ( containerIngredientsWater / neededIngredientsWaterPerCup <= containerIngredientsMilk / neededIngredientsMilkPerCup
                    && containerIngredientsWater / neededIngredientsWaterPerCup <= containerIngredientsCoffeBeans / neededIngredientsCoffeBeansPerCup) {

                numberOfCoffeeCupsPossibleToProduce = containerIngredientsWater / neededIngredientsWaterPerCup;

                System.out.println("No, I can make only " + numberOfCoffeeCupsPossibleToProduce + " cup(s) of coffee");
            } else if (containerIngredientsMilk / neededIngredientsMilkPerCup <= containerIngredientsWater / neededIngredientsWaterPerCup
                    && containerIngredientsMilk / neededIngredientsMilkPerCup <= containerIngredientsCoffeBeans / neededIngredientsCoffeBeansPerCup) {

                numberOfCoffeeCupsPossibleToProduce = containerIngredientsMilk / neededIngredientsMilkPerCup;

                System.out.println("No, I can make only " + numberOfCoffeeCupsPossibleToProduce + " cup(s) of coffee");
            } else if (containerIngredientsCoffeBeans / neededIngredientsCoffeBeansPerCup <= containerIngredientsWater / neededIngredientsWaterPerCup
                    && containerIngredientsCoffeBeans / neededIngredientsCoffeBeansPerCup <= containerIngredientsMilk / neededIngredientsMilkPerCup) {

                numberOfCoffeeCupsPossibleToProduce = containerIngredientsCoffeBeans / neededIngredientsCoffeBeansPerCup;

                System.out.println("No, I can make only " + numberOfCoffeeCupsPossibleToProduce + " cup(s) of coffee");
            }
        }
    }


}
