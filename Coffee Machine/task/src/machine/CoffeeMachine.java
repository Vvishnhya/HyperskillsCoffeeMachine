package machine;
import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        CoffeMachineModel express = new CoffeMachineModel(1200,540, 120, 9, 550);
        EspressoModel espresso = new EspressoModel();


        System.out.println(express);

//        final int WATER_FOR_ONE_CUP = 200;
//        final int MILK_FOR_ONE_CUP = 50;
//        final int BEANS_FOR_ONE_CUP = 15;
//
//        System.out.println("Write how many ml of water the coffee machine has: ");
//        int water  = scanner.nextInt();
//
//        System.out.println("Write how many ml of milk the coffee machine has: ");
//        int milk  = scanner.nextInt();
//
//        System.out.println("Write how many grams of coffee beans the coffee machine has: ");
//        int beans  = scanner.nextInt();
//
//        System.out.println("Write how many cups of coffee you will need: ");
//        int cups  = scanner.nextInt();

        int maximumCups = Math.min(Math.min(express.getContainerIngradientsWater() / espresso.waterPerOneCup, express.getContainerIngradientsMilk() / espresso.milkPerOneCup), express.getContainerIngradientsCoffeBeans() / espresso.beansPerOneCup);

        if (maximumCups == express.getContainerIngradientsDisposableCups()) {
            System.out.println("Yes, I can make that amount of coffee");
        } else if (maximumCups > express.getContainerIngradientsDisposableCups()) {
            System.out.println("Yes, I can make that amount of coffee (and even " +
                    (maximumCups - express.getContainerIngradientsDisposableCups()) + " more than that)");
        } else {
            System.out.println("No, I can make only " + maximumCups + " cup(s) of coffee");
        }


    }
}