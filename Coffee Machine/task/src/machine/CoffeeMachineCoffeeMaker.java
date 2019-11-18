package machine;

import java.util.Scanner;

public class CoffeeMachineCoffeeMaker {

    private int numberOfCoffeeCupsToProduce;
    private int numberOfCoffeeCupsPossibleToProduce;
    //        200 ml of water, 50 ml of milk, and 15 g of coffee beans.
    private final int neededIngradientsWaterPerCup = 200;
    private final int neededIngradientsMilkPerCup = 50;
    private final int neededIngradientsCoffeBeansPerCup = 15;

    private int neededIngradientsWaterForThisNumberOfCups;
    private int neededIngradientsMilkForThisNumberOfCups;
    private int neededIngradientsCoffeBeansForThisNumberOfCups;

    private int containerIngradientsWater;
    private int containerIngradientsMilk;
    private int containerIngradientsCoffeBeans;

    public void calculateCoffeIngradients() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Write how many ml of water the coffee machine has:");
        System.out.print("> ");
        containerIngradientsWater = sc.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        System.out.print("> ");
        containerIngradientsMilk = sc.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has: ");
        System.out.print("> ");
        containerIngradientsCoffeBeans = sc.nextInt();

        System.out.println("Write how many cups of coffe you will need:");
        System.out.print("> ");

        numberOfCoffeeCupsToProduce = sc.nextInt();

        neededIngradientsWaterForThisNumberOfCups = numberOfCoffeeCupsToProduce * neededIngradientsWaterPerCup;
        neededIngradientsMilkForThisNumberOfCups = numberOfCoffeeCupsToProduce * neededIngradientsWaterPerCup;
        neededIngradientsCoffeBeansForThisNumberOfCups = numberOfCoffeeCupsToProduce * neededIngradientsCoffeBeansPerCup;


//        System.out.println("For " + numberOfCoffeeCupsToProduce
//                + " cups of coffee you will need: \n"
//                + neededIngradientsWaterPerCup * numberOfCoffeeCupsToProduce + " ml of water \n"
//                + neededIngradientsMilkPerCup * numberOfCoffeeCupsToProduce + " ml of milk \n"
//                + neededIngradientsCoffeBeansPerCup * numberOfCoffeeCupsToProduce + " g of coffee beans \n");
        if ((containerIngradientsWater == 0 || containerIngradientsMilk == 0 || containerIngradientsCoffeBeans == 0) && numberOfCoffeeCupsPossibleToProduce > 0) {
            // No, I can make only 0 cup(s) of coffee
            System.out.println("No, I can make only 0 cup(s) of coffee");
        } else if ((containerIngradientsWater == 0 || containerIngradientsMilk == 0 || containerIngradientsCoffeBeans == 0) && numberOfCoffeeCupsPossibleToProduce == 0) {
            // No, I can make only 0 cup(s) of coffee
            System.out.println("Yes, I can make only 0 cup(s) of coffee");
        } else if (neededIngradientsCoffeBeansForThisNumberOfCups < containerIngradientsWater
                && neededIngradientsMilkForThisNumberOfCups < containerIngradientsMilk
                && neededIngradientsCoffeBeansForThisNumberOfCups < containerIngradientsCoffeBeans) {

            containerIngradientsWater = containerIngradientsWater - neededIngradientsWaterForThisNumberOfCups;
            containerIngradientsMilk = containerIngradientsMilk - neededIngradientsMilkForThisNumberOfCups;
            containerIngradientsCoffeBeans = containerIngradientsCoffeBeans - neededIngradientsCoffeBeansForThisNumberOfCups;


            if (numberOfCoffeeCupsToProduce == 1) {
                System.out.println("Yes, I can make that amount of coffee");
            } else if (containerIngradientsWater > containerIngradientsMilk && containerIngradientsWater > containerIngradientsCoffeBeans) {
                numberOfCoffeeCupsPossibleToProduce = containerIngradientsWater / neededIngradientsWaterPerCup;
                System.out.println("Yes, I can make that amount of coffee (and even " + numberOfCoffeeCupsPossibleToProduce + " more than that");
            } else if (containerIngradientsMilk > containerIngradientsWater && containerIngradientsMilk > containerIngradientsCoffeBeans) {
                numberOfCoffeeCupsPossibleToProduce = containerIngradientsMilk / neededIngradientsMilkPerCup;
                System.out.println("Yes, I can make that amount of coffee (and even " + numberOfCoffeeCupsPossibleToProduce + " more than that");
            } else {
                numberOfCoffeeCupsPossibleToProduce = containerIngradientsCoffeBeans / neededIngradientsCoffeBeansPerCup;
                System.out.println("Yes, I can make that amount of coffee (and even " + numberOfCoffeeCupsPossibleToProduce + " more than that");
            }

        } else if (neededIngradientsWaterForThisNumberOfCups > containerIngradientsWater
                || neededIngradientsMilkForThisNumberOfCups > containerIngradientsMilk
                || neededIngradientsCoffeBeansForThisNumberOfCups > containerIngradientsCoffeBeans) {
            if (containerIngradientsWater % neededIngradientsWaterForThisNumberOfCups == 0
                    && containerIngradientsMilk % neededIngradientsMilkForThisNumberOfCups == 0) {

                numberOfCoffeeCupsPossibleToProduce = containerIngradientsCoffeBeans / neededIngradientsCoffeBeansForThisNumberOfCups;

                System.out.println("No, I can make only " + numberOfCoffeeCupsPossibleToProduce + " cup(s) of coffee");
            } else if (containerIngradientsWater % neededIngradientsWaterForThisNumberOfCups == 0
                    && containerIngradientsCoffeBeans % neededIngradientsCoffeBeansForThisNumberOfCups == 0) {

                numberOfCoffeeCupsPossibleToProduce = containerIngradientsMilk / neededIngradientsMilkForThisNumberOfCups;

                System.out.println("No, I can make only " + numberOfCoffeeCupsPossibleToProduce + " cup(s) of coffee");
            } else if (containerIngradientsMilk % neededIngradientsMilkForThisNumberOfCups == 0
                    && containerIngradientsCoffeBeans % neededIngradientsCoffeBeansForThisNumberOfCups == 0) {

                numberOfCoffeeCupsPossibleToProduce = containerIngradientsWater / neededIngradientsWaterForThisNumberOfCups;

                System.out.println("No, I can make only " + numberOfCoffeeCupsPossibleToProduce + " cup(s) of coffee");
            }
            // Yes, I can make that amount of coffee (and even 2 more than that)
//        } else if () {
//        }
        }
    }
}

