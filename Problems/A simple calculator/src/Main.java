import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
    Scanner scr = new Scanner(System.in);
    long firstNum = scr.nextLong();
    char op = scr.next().charAt(0);
    long secNum = scr.nextLong();
    long res = 0;

        final Scanner scanner = new Scanner(System.in);


//        System.out.println(calculator(a,op,b));


            switch (op) {
                case '+':
                    res = firstNum + secNum;
                    System.out.println(res);
                    break;
                case '-':
                    res = firstNum - secNum;
                    System.out.println(res);
                    break;
                case '*':
                    res = firstNum * secNum;
                    System.out.println(res);
                    break;
                case '/':
                    if (secNum != 0) {
                        res = firstNum / secNum;
                        System.out.println(res);
                        break;
                    } else {
                        System.out.println("Division by 0!");
                        break;
                    } default:
                    System.out.println("Unknown operator");
            }


    }



    static long calculator(long firstNum, String operation, long secNum){
        long res = 0;

        if(operation.equals("-") || operation.equals("+") || operation.equals("/") || operation.equals("*")) {
            switch (operation) {
                case "+":
                    return res = firstNum + secNum;
                case "-":
                    return res = firstNum - secNum;
                case "/":
                    if (secNum != 0) {
                        return res = firstNum / secNum;
                    } else {
                        System.out.println("Division by 0!");
                        break;
                    }
            }
            return res;
        }else{
            System.out.println("Unknown operator");
            }
        return res;
    }
}