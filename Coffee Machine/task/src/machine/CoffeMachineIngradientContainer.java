package machine;

import java.util.Scanner;


public class CoffeMachineIngradientContainer {

    private int numberOfCoffeeCupsStillToProduce;
    //        200 ml of water, 50 ml of milk, and 15 g of coffee beans.
    private int containerIngradientsWater;
    private int containerIngradientsMilk;
    private int containerIngradientsCoffeBeans;

    public void checkIngradientContainer(){

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
        System.out.println("Write how many cups of coffee you will need:");
        System.out.print("> ");


//        Write how many grams of coffee beans the coffee machine has:
//> 100
//        Write how many cups of coffee you will need:
//> 1
//        Yes, I can make that amount of coffee

    }
}
