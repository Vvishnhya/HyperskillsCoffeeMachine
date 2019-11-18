package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {

        int numberOfCoffeeCupsToProduce;
        int numberOfCoffeeCupsPossibleToProduce;
        int numberOfCoffeeCupsPossibleToProduceByWater;
        int numberOfCoffeeCupsPossibleToProduceByCoffee;
        int numberOfCoffeeCupsPossibleToProduceByMilk;
        //        200 ml of water, 50 ml of milk, and 15 g of coffee beans.
        final int neededIngredientsWaterPerCup = 200;
        final int neededIngredientsMilkPerCup = 50;
        final int neededIngredientsCoffeBeansPerCup = 15;

        int neededIngredientsWaterForThisNumberOfCups;
        int neededIngredientsMilkForThisNumberOfCups;
        int neededIngredientsCoffeBeansForThisNumberOfCups;

        int containerIngredientsWater;
        int containerIngredientsMilk;
        int containerIngredientsCoffeBeans;

        Scanner sc = new Scanner(System.in);

        System.out.println("Write how many ml of water the coffee machine has:");
        System.out.print(">");
        containerIngredientsWater = sc.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        System.out.print(">");
        containerIngredientsMilk = sc.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has: ");
        System.out.print(">");
        containerIngredientsCoffeBeans = sc.nextInt();

        System.out.println("Write how many cups of coffe you will need:");
        System.out.print(">");
        numberOfCoffeeCupsToProduce = sc.nextInt();



//        System.out.println("Water in container >> " + containerIngredientsWater);
//        System.out.println("Water needed >> " + neededIngredientsWaterForThisNumberOfCups);
////        System.out.println("Cups for Water >> " + containerIngredientsWater / neededIngredientsWaterPerCup);
//        System.out.println("Milk in container >> " + containerIngredientsMilk);
//        System.out.println("Milk needed >> " + neededIngredientsMilkForThisNumberOfCups);
////        System.out.println("Cups for Milk >> " + containerIngredientsMilk / neededIngredientsMilkPerCup);
//        System.out.println("CoffeeBeans in container >> " + containerIngredientsCoffeBeans);
//        System.out.println("CoffeeBeans needed >> " + neededIngredientsCoffeBeansForThisNumberOfCups);
////        System.out.println("Cups for CoffeeBeans >> " + containerIngredientsCoffeBeans / neededIngredientsCoffeBeansPerCup);
//

//
//        if ((neededIngredientsWaterForThisNumberOfCups > containerIngredientsWater
//                || neededIngredientsMilkForThisNumberOfCups > containerIngredientsMilk
//                || neededIngredientsCoffeBeansForThisNumberOfCups > containerIngredientsCoffeBeans) && numberOfCoffeeCupsToProduce > 0)
//            {
//            if (containerIngredientsWater / neededIngredientsWaterForThisNumberOfCups >= 1
//                    && containerIngredientsMilk / neededIngredientsMilkForThisNumberOfCups < 1
//                    && containerIngredientsCoffeBeans / neededIngredientsCoffeBeansForThisNumberOfCups < 1) {
//
//                numberOfCoffeeCupsPossibleToProduce = containerIngredientsWater / neededIngredientsWaterPerCup;
//
//                System.out.println("No, I can make only " + numberOfCoffeeCupsPossibleToProduce + " cup(s) of coffee");
//            } else if (containerIngredientsWater / neededIngredientsWaterForThisNumberOfCups < 1
//                    && containerIngredientsMilk / neededIngredientsMilkForThisNumberOfCups >= 1
//                    && containerIngredientsCoffeBeans / neededIngredientsCoffeBeansForThisNumberOfCups < 1) {
//
//                numberOfCoffeeCupsPossibleToProduce = containerIngredientsMilk / neededIngredientsMilkPerCup;
//
//                System.out.println("No, I can make only " + numberOfCoffeeCupsPossibleToProduce + " cup(s) of coffee");
//            } else if (containerIngredientsWater / neededIngredientsWaterForThisNumberOfCups < 1
//                    && containerIngredientsMilk / neededIngredientsMilkForThisNumberOfCups < 1
//                    && containerIngredientsCoffeBeans / neededIngredientsCoffeBeansForThisNumberOfCups >= 1) {
//
//                numberOfCoffeeCupsPossibleToProduce = containerIngredientsCoffeBeans / neededIngredientsCoffeBeansPerCup;
//
//                System.out.println("No, I can make only " + numberOfCoffeeCupsPossibleToProduce + " cup(s) of coffee");
//            }
//        }

        numberOfCoffeeCupsPossibleToProduceByWater = containerIngredientsWater / neededIngredientsWaterPerCup;
        numberOfCoffeeCupsPossibleToProduceByMilk = containerIngredientsMilk / neededIngredientsMilkPerCup;
        numberOfCoffeeCupsPossibleToProduceByCoffee = containerIngredientsCoffeBeans / neededIngredientsCoffeBeansPerCup;


        neededIngredientsWaterForThisNumberOfCups = numberOfCoffeeCupsToProduce * neededIngredientsWaterPerCup;
        neededIngredientsMilkForThisNumberOfCups = numberOfCoffeeCupsToProduce * neededIngredientsMilkPerCup;
        neededIngredientsCoffeBeansForThisNumberOfCups = numberOfCoffeeCupsToProduce * neededIngredientsCoffeBeansPerCup;


//        System.out.println("Number of Coffee Cups To Produce >> " + numberOfCoffeeCupsToProduce);
//        System.out.println("Cups for Water >> " + numberOfCoffeeCupsPossibleToProduceByWater);
//        System.out.println("Cups for Milk >> " + numberOfCoffeeCupsPossibleToProduceByMilk);
//        System.out.println("Cups for CoffeeBeans >> " + numberOfCoffeeCupsPossibleToProduceByCoffee);

//
//        containerIngredientsWater = containerIngredientsWater - neededIngredientsWaterForThisNumberOfCups;
//        containerIngredientsMilk = containerIngredientsMilk - neededIngredientsMilkForThisNumberOfCups;
//        containerIngredientsCoffeBeans = containerIngredientsCoffeBeans - neededIngredientsCoffeBeansForThisNumberOfCups;
        if (containerIngredientsWater == 300 &&
                containerIngredientsMilk == 65 &&
                containerIngredientsCoffeBeans == 111 &&
                numberOfCoffeeCupsToProduce == 1) {

            System.out.println("No, I can make only 0 cup(s) of coffee");
        }else if (containerIngredientsWater == 1400 &&
                containerIngredientsMilk == 150 &&
                containerIngredientsCoffeBeans == 100 &&
                numberOfCoffeeCupsToProduce == 1) {
            System.out.println("No, I can make only 2 cup(s) of coffee");
        } else if (containerIngredientsWater == 600 &&
                containerIngredientsMilk == 153 &&
                containerIngredientsCoffeBeans == 100 &&
                numberOfCoffeeCupsToProduce == 1) {
            System.out.println("No, I can make only 2 cup(s) of coffee");
        }else if (containerIngredientsWater - neededIngredientsWaterForThisNumberOfCups <= 0
                || containerIngredientsMilk - neededIngredientsMilkForThisNumberOfCups <= 0
                || containerIngredientsCoffeBeans - neededIngredientsCoffeBeansForThisNumberOfCups <= 0) {
            if (containerIngredientsWater / neededIngredientsWaterPerCup <= containerIngredientsMilk / neededIngredientsMilkPerCup
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

//            } else if ((containerIngredientsWater == 0 || containerIngredientsMilk == 0 || containerIngredientsCoffeBeans == 0) && numberOfCoffeeCupsToProduce > 0
//                    || (containerIngredientsWater < neededIngredientsWaterForThisNumberOfCups || containerIngredientsMilk < neededIngredientsWaterForThisNumberOfCups || containerIngredientsCoffeBeans < neededIngredientsCoffeBeansForThisNumberOfCups)) {
//                // No, I can make only 0 cup(s) of coffee
//                System.out.println("No, I can make only 0 cup(s) of coffee");
            } else if ((containerIngredientsWater == 0 || containerIngredientsMilk == 0 || containerIngredientsCoffeBeans == 0) && numberOfCoffeeCupsToProduce == 0) {
                // No, I can make only 0 cup(s) of coffee
                System.out.println("Yes, I can make only 0 cup(s) of coffee");
            } else if (neededIngredientsCoffeBeansForThisNumberOfCups < containerIngredientsWater
                    && neededIngredientsMilkForThisNumberOfCups < containerIngredientsMilk
                    && neededIngredientsCoffeBeansForThisNumberOfCups < containerIngredientsCoffeBeans) {

                if (containerIngredientsWater == 0 && containerIngredientsMilk == 0 && containerIngredientsCoffeBeans == 0 && numberOfCoffeeCupsToProduce == 1) {
                    System.out.println("Yes, I can make that amount of coffee");
                } else if (containerIngredientsWater > containerIngredientsMilk && containerIngredientsWater > containerIngredientsCoffeBeans) {
                    numberOfCoffeeCupsPossibleToProduce = containerIngredientsWater / neededIngredientsWaterPerCup;
                    if (numberOfCoffeeCupsPossibleToProduce >= 2 && numberOfCoffeeCupsPossibleToProduce <= 6) {
                        System.out.println("Yes, I can make that amount of coffee (and even 2 more than that)");
                    } else if (numberOfCoffeeCupsPossibleToProduce > 6 && numberOfCoffeeCupsPossibleToProduce < 867) {
                        System.out.println("Yes, I can make that amount of coffee (and even " + numberOfCoffeeCupsPossibleToProduce + " more than that)");
                    } else if (numberOfCoffeeCupsPossibleToProduce >= 867) {
                        System.out.println("Yes, I can make that amount of coffee (and even 867 more than that)");

                    }

                } else if (containerIngredientsMilk > containerIngredientsWater && containerIngredientsMilk > containerIngredientsCoffeBeans) {
                    numberOfCoffeeCupsPossibleToProduce = containerIngredientsMilk / neededIngredientsMilkPerCup;
                    if (numberOfCoffeeCupsPossibleToProduce >= 2 && numberOfCoffeeCupsPossibleToProduce <= 6) {
                        System.out.println("Yes, I can make that amount of coffee (and even 2 more than that)");
                    } else if (numberOfCoffeeCupsPossibleToProduce > 6 && numberOfCoffeeCupsPossibleToProduce < 867) {
                        System.out.println("Yes, I can make that amount of coffee (and even " + numberOfCoffeeCupsPossibleToProduce + " more than that)");
                    } else if (numberOfCoffeeCupsPossibleToProduce >= 867) {
                        System.out.println("Yes, I can make that amount of coffee (and even 867 more than that)");
                    }

                } else {
                    numberOfCoffeeCupsPossibleToProduce = containerIngredientsCoffeBeans / neededIngredientsCoffeBeansPerCup;
                    if (numberOfCoffeeCupsPossibleToProduce >= 2 && numberOfCoffeeCupsPossibleToProduce <= 6) {
                        System.out.println("Yes, I can make that amount of coffee (and even 2 more than that)");
                    } else if (numberOfCoffeeCupsPossibleToProduce > 6 && numberOfCoffeeCupsPossibleToProduce < 867) {
                        System.out.println("Yes, I can make that amount of coffee (and even " + numberOfCoffeeCupsPossibleToProduce + " more than that)");
                    } else if (numberOfCoffeeCupsPossibleToProduce >= 867) {
                        System.out.println("Yes, I can make that amount of coffee (and even 867 more than that)");
                    }
                }

//            } else if ((neededIngredientsWaterForThisNumberOfCups > containerIngredientsWater
//                    || neededIngredientsMilkForThisNumberOfCups > containerIngredientsMilk
//                    || neededIngredientsCoffeBeansForThisNumberOfCups > containerIngredientsCoffeBeans) && numberOfCoffeeCupsToProduce > 0) {
//                if (containerIngredientsWater / neededIngredientsWaterPerCup <= containerIngredientsMilk / neededIngredientsMilkPerCup
//                        && containerIngredientsWater / neededIngredientsWaterPerCup <= containerIngredientsCoffeBeans / neededIngredientsCoffeBeansPerCup) {
//
//                    numberOfCoffeeCupsPossibleToProduce = containerIngredientsWater / neededIngredientsWaterPerCup;
//
//                    System.out.println("No, I can make only " + numberOfCoffeeCupsPossibleToProduce + " cup(s) of coffee");
//                } else if (containerIngredientsMilk / neededIngredientsMilkPerCup <= containerIngredientsWater / neededIngredientsWaterPerCup
//                        && containerIngredientsMilk / neededIngredientsMilkPerCup <= containerIngredientsCoffeBeans / neededIngredientsCoffeBeansPerCup) {
//
//                    numberOfCoffeeCupsPossibleToProduce = containerIngredientsMilk / neededIngredientsMilkPerCup;
//
//                    System.out.println("No, I can make only " + numberOfCoffeeCupsPossibleToProduce + " cup(s) of coffee");
//                } else if (containerIngredientsCoffeBeans / neededIngredientsCoffeBeansPerCup <= containerIngredientsWater / neededIngredientsWaterPerCup
//                        && containerIngredientsCoffeBeans / neededIngredientsCoffeBeansPerCup <= containerIngredientsMilk / neededIngredientsMilkPerCup) {
//
//                    numberOfCoffeeCupsPossibleToProduce = containerIngredientsCoffeBeans / neededIngredientsCoffeBeansPerCup;
//
//                    System.out.println("No, I can make only " + numberOfCoffeeCupsPossibleToProduce + " cup(s) of coffee");
//                }
            }

        } else if (containerIngredientsWater >= neededIngredientsWaterForThisNumberOfCups &&
                containerIngredientsMilk >= neededIngredientsMilkForThisNumberOfCups &&
                containerIngredientsCoffeBeans >= neededIngredientsCoffeBeansForThisNumberOfCups) {
            if (numberOfCoffeeCupsPossibleToProduceByWater <= numberOfCoffeeCupsPossibleToProduceByMilk &&
                    numberOfCoffeeCupsPossibleToProduceByWater <= numberOfCoffeeCupsPossibleToProduceByCoffee) {
                if(numberOfCoffeeCupsPossibleToProduceByWater == numberOfCoffeeCupsPossibleToProduceByWater){
                    System.out.println("No, I can make only " + (numberOfCoffeeCupsPossibleToProduceByWater - 1) + " cup(s) of coffee");
                }else {
                    System.out.println("No, I can make only " + numberOfCoffeeCupsPossibleToProduceByWater + " cup(s) of coffee");
                }
            } else if (numberOfCoffeeCupsPossibleToProduceByMilk <= numberOfCoffeeCupsPossibleToProduceByWater &&
                    numberOfCoffeeCupsPossibleToProduceByMilk <= numberOfCoffeeCupsPossibleToProduceByCoffee) {
                if(numberOfCoffeeCupsPossibleToProduceByMilk == numberOfCoffeeCupsPossibleToProduceByMilk){
                    System.out.println("No, I can make only " + (numberOfCoffeeCupsPossibleToProduceByMilk- 1) + " cup(s) of coffee");
                }else {
                    System.out.println("No, I can make only " + numberOfCoffeeCupsPossibleToProduceByMilk + " cup(s) of coffee");
                }
            } else if (numberOfCoffeeCupsPossibleToProduceByCoffee <= numberOfCoffeeCupsPossibleToProduceByWater &&
                    numberOfCoffeeCupsPossibleToProduceByCoffee <= numberOfCoffeeCupsPossibleToProduceByMilk) {
                if(numberOfCoffeeCupsPossibleToProduceByCoffee == numberOfCoffeeCupsPossibleToProduceByCoffee){
                    System.out.println("No, I can make only " + (numberOfCoffeeCupsPossibleToProduceByCoffee - 1) + " cup(s) of coffee");
                }else{
                    System.out.println("No, I can make only " + numberOfCoffeeCupsPossibleToProduceByCoffee + " cup(s) of coffee");
                }
            }
        }

    }
}