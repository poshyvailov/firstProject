import java.util.Scanner;

public class Calculator {


    public static void main(String[] args) {

        while (true) {
            Scanner userInput = new Scanner(System.in);

            System.out.println("Select one of the following options:");
            System.out.println("1. Sum");
            System.out.println("2. Div");
            System.out.println("3. Multiply");
            System.out.println("4. Subtraction");
            System.out.println("0. Exit");

            String selectedMenuOption = userInput.nextLine();
            System.out.println("Thanks! You selected: " + selectedMenuOption);

            if ((selectedMenuOption.contains("0")) || (selectedMenuOption.contains("exit")) || (selectedMenuOption.contains("Exit")) ) {
                System.out.println("Have a nice day, bye!");
                break;
            }


            switch (selectedMenuOption) {
                case "1":
                    System.out.println("Please type first number for sum");
                    int sumFirstNumber = userInput.nextInt();
                    System.out.println("Please type second number for sum");
                    int sumSecondNumber = userInput.nextInt();
                    System.out.println("Results of sum: " + sum(sumFirstNumber, sumSecondNumber));
                    break;
                case "2":
                    System.out.println("Please type first number for div");
                    int divFirstNumber = userInput.nextInt();
                    System.out.println("Please type second number for div");
                    int divSecondNumber = userInput.nextInt();
                    System.out.println("Results of div: " + div(divFirstNumber, divSecondNumber));
                    break;
                case "3":
                    System.out.println("Please type first number for multiplying");
                    int multiplyFirstNumber = userInput.nextInt();
                    System.out.println("Please type second number for multiplying");
                    int multiplySecondNumber = userInput.nextInt();
                    System.out.println("Results of multiplying: " + multiply(multiplyFirstNumber, multiplySecondNumber));
                    break;
                case "4":
                    System.out.println("Please type first number for subtraction");
                    int subtractionFirstNumber = userInput.nextInt();
                    System.out.println("Please type second number for subtraction");
                    int subtractionSecondNumber = userInput.nextInt();
                    System.out.println("Results of subtraction: " + subtraction(subtractionFirstNumber, subtractionSecondNumber));
                    break;

            }

        }
    }


    public static int sum(int firstNumber, int secondNumber){
        return firstNumber + secondNumber;
    }

    public static int div(int firstNumber, int secondNumber){
        return firstNumber / secondNumber;
    }

    public static int multiply(int firstNumber, int secondNumber){
        return firstNumber * secondNumber;
    }

    public static int subtraction(int firstNumber, int secondNUmber){
        return firstNumber - secondNUmber;
    }

}
