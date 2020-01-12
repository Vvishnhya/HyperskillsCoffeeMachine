package machine;

import java.util.Scanner;

public class CoffeMachineAction {
    public static void main(String[] args) {

        String action;
        int numberOfCoffeeCupsToMake;
        int kindOfCoffee;

        Scanner scr = new Scanner(System.in);

        CoffeMachineModel express = new CoffeMachineModel(1200,540, 120, 9, 550);
        EspressoModel espresso = new EspressoModel();

        System.out.println(express);

        System.out.println("\n");

        System.out.println("Write action (buy, fill, take):");
        System.out.print("> ");

        action = scr.next();

        switch (action){
            case "buy":
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
                System.out.print("> ");

                kindOfCoffee = scr.nextInt();
                numberOfCoffeeCupsToMake = 1;

                express = express.makeCoffee(express,1, numberOfCoffeeCupsToMake);
            case "fill":

                System.out.println("Write how many ml of water do you want to add:");
                System.out.print("> ");
                int workersWater = scr.nextInt();
                System.out.println("Write how many ml of milk do you want to add:");
                System.out.print("> ");
                int workersMilk = scr.nextInt();
                System.out.println("Write how many grams of coffee beans the coffee do you want to add:");
                System.out.print("> ");
                int workersBean = scr.nextInt();
                System.out.println("Write how many disposable cups of coffee do you want to add:");
                System.out.print("> ");
                int workersCups = scr.nextInt();

                express = express.fillCoffeeMachine(express, workersWater, workersMilk, workersBean, workersCups);
            case "take":
                express = express.takeCoffeeMachine(express);

        }

        System.out.println("");
        System.out.println(express);

    }





}
