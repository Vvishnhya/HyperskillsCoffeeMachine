package machine;

import java.util.Scanner;

public class CoffeeMachineCoffeeMaker {
    public static void calculateCoffeIngradients() {
        int numberOfCoffeeCupsToProduce = 0;
        //        200 ml of water, 50 ml of milk, and 15 g of coffee beans.
        int ingradientsWater = 200;
        int ingradientsMilk = 50;
        int ingradientsCoffeBeans = 15;


        Scanner scanner = new Scanner(System.in);


        System.out.println("Write how many cups of coffe you will need:");
        System.out.print("> ");
        numberOfCoffeeCupsToProduce = scanner.nextInt();

        System.out.println("For " + numberOfCoffeeCupsToProduce
                + " cups of coffee you will need: \n"
                + ingradientsWater * numberOfCoffeeCupsToProduce + " ml of water \n"
                + ingradientsMilk * numberOfCoffeeCupsToProduce+ " ml of milk \n"
                + ingradientsCoffeBeans * numberOfCoffeeCupsToProduce + " g of coffee beans \n");

    }
}
