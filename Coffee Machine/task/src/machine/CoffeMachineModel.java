package machine;

public class CoffeMachineModel {

//    private int numberOfCoffeeCupsToProduce;
//    private int numberOfCoffeeCupsPossibleToProduce;
    //        200 ml of water, 50 ml of milk, and 15 g of coffee beans.

//    private final int neededIngradientsWaterPerCup = 200;
//    private final int neededIngradientsMilkPerCup = 50;
//    private final int neededIngradientsCoffeBeansPerCup = 15;

//    private int neededIngradientsWaterForThisNumberOfCups;
//    private int neededIngradientsMilkForThisNumberOfCups;
//    private int neededIngradientsCoffeBeansForThisNumberOfCups;

    private int containerIngradientsWater;
    private int containerIngradientsMilk;
    private int containerIngradientsCoffeBeans;
    private int containerIngradientsDisposableCups;

    private long containerBank;

    public CoffeMachineModel() {
    }

    public CoffeMachineModel(
            int containerIngradientsWater,
            int containerIngradientsMilk,
            int containerIngradientsCoffeBeans,
            int containerIngradientsDisposableCups,
            long containerBank) {
        this.containerIngradientsWater = containerIngradientsWater;
        this.containerIngradientsMilk = containerIngradientsMilk;
        this.containerIngradientsCoffeBeans = containerIngradientsCoffeBeans;
        this.containerIngradientsDisposableCups = containerIngradientsDisposableCups;
        this.containerBank = containerBank;
    }

    public int getContainerIngradientsWater() {
        return containerIngradientsWater;
    }

    public int getContainerIngradientsMilk() {
        return containerIngradientsMilk;
    }

    public int getContainerIngradientsCoffeBeans() {
        return containerIngradientsCoffeBeans;
    }

    public int getContainerIngradientsDisposableCups() {
        return containerIngradientsDisposableCups;
    }

    public long getContainerBank() {
        return containerBank;
    }

    public void setContainerIngradientsWater(int containerIngradientsWater) {
        this.containerIngradientsWater = containerIngradientsWater;
    }

    public void setContainerIngradientsMilk(int containerIngradientsMilk) {
        this.containerIngradientsMilk = containerIngradientsMilk;
    }

    public void setContainerIngradientsCoffeBeans(int containerIngradientsCoffeBeans) {
        this.containerIngradientsCoffeBeans = containerIngradientsCoffeBeans;
    }

    public void setContainerIngradientsDisposableCups(int containerIngradientsDisposableCups) {
        this.containerIngradientsDisposableCups = containerIngradientsDisposableCups;
    }

    public void setContainerBank(long containerBank) {
        this.containerBank = containerBank;
    }

    @Override
    public String toString() {
        return "The coffee machine has:\n" +
                containerIngradientsWater + " of water\n" +
                containerIngradientsMilk + " of milk\n" +
                containerIngradientsCoffeBeans + " of coffee beans\n" +
                containerIngradientsDisposableCups + " of disposable cups\n" +
                containerBank + " of money\n"
                ;
    }


    public CoffeMachineModel makeCoffee(CoffeMachineModel machine, int kindOfCoffee, int numberOfCoffeeCupsToMake){

        machine = new CoffeMachineModel(
                getContainerIngradientsWater(),
                getContainerIngradientsMilk(),
                getContainerIngradientsCoffeBeans(),
                getContainerIngradientsDisposableCups(),
                getContainerBank());

        switch (kindOfCoffee){
            case 1:
                //espresso
                EspressoModel espresso = new EspressoModel();
                machine.setContainerIngradientsWater(containerIngradientsWater - espresso.waterPerOneCup);
                machine.setContainerIngradientsMilk(containerIngradientsMilk - espresso.milkPerOneCup);
                machine.setContainerIngradientsCoffeBeans(containerIngradientsCoffeBeans - espresso.beansPerOneCup);
                machine.setContainerIngradientsDisposableCups(containerIngradientsDisposableCups - 1);
                machine.setContainerBank(containerBank + espresso.pricePerOneCup);
            case 2:
                //latte
                LatteModel latte = new LatteModel();
                machine.setContainerIngradientsWater(containerIngradientsWater - latte.waterPerOneCup);
                machine.setContainerIngradientsMilk(containerIngradientsMilk - latte.milkPerOneCup);
                machine.setContainerIngradientsCoffeBeans(containerIngradientsCoffeBeans - latte.beansPerOneCup);
                machine.setContainerIngradientsDisposableCups(containerIngradientsDisposableCups - 1);
                machine.setContainerBank(containerBank + latte.pricePerOneCup);
            case 3:
                //cappucino

                LatteModel cappucino = new LatteModel();
                machine.setContainerIngradientsWater(containerIngradientsWater - cappucino.waterPerOneCup);
                machine.setContainerIngradientsMilk(containerIngradientsMilk - cappucino.milkPerOneCup);
                machine.setContainerIngradientsCoffeBeans(containerIngradientsCoffeBeans - cappucino.beansPerOneCup);
                machine.setContainerIngradientsDisposableCups(containerIngradientsDisposableCups - 1);
                machine.setContainerBank(containerBank + cappucino.pricePerOneCup);
        }
        return machine;
    }
//
//    private int checkIfEnoughIngradients(CoffeMachineModel machine, int kindOfCoffee, int numberOfCoffeeCupsToMake){
//
//        int numberOfCoffeeCupsPossibleToProduce = 0;
//
//        machine = new CoffeMachineModel(
//                getContainerIngradientsWater(),
//                getContainerIngradientsMilk(),
//                getContainerIngradientsCoffeBeans(),
//                getContainerIngradientsDisposableCups(),
//                getContainerBank());
//
//
//
//
//
//        return numberOfCoffeeCupsPossibleToProduce;
//    }


    public CoffeMachineModel fillCoffeeMachine(CoffeMachineModel machine, int addWater, int addMilk, int addBeans, int addCups) {

        machine = new CoffeMachineModel(
                getContainerIngradientsWater(),
                getContainerIngradientsMilk(),
                getContainerIngradientsCoffeBeans(),
                getContainerIngradientsDisposableCups(),
                getContainerBank());

        machine.setContainerIngradientsWater(containerIngradientsWater + addWater);
        machine.setContainerIngradientsMilk(containerIngradientsMilk + addMilk);
        machine.setContainerIngradientsCoffeBeans(containerIngradientsCoffeBeans + addBeans);
        machine.setContainerIngradientsDisposableCups(containerIngradientsDisposableCups + addCups);

        return machine;
    }

    public CoffeMachineModel takeCoffeeMachine(CoffeMachineModel machine){

        machine = new CoffeMachineModel(
                getContainerIngradientsWater(),
                getContainerIngradientsMilk(),
                getContainerIngradientsCoffeBeans(),
                getContainerIngradientsDisposableCups(),
                getContainerBank());

        System.out.println("I give you $" + containerBank);

        machine.setContainerBank(0);

        return machine;
    }
}