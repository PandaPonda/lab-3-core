import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Dragon calculator!\nPRESS Q TO EXIT");

        Scanner scanner = new Scanner(System.in);
        String operation = "";
        while (!"q".equals(operation)) {
            try{
                System.out.println("Enter first number");
                int firstNumber = scanner.nextInt();
                System.out.println("Enter second number");
                int secondNumber = scanner.nextInt();
                System.out.println("Enter mathematical operation");
                operation = scanner.next();
                System.out.println(calculation(firstNumber, secondNumber, operation));
            }
            catch (InputMismatchException ex) {
                if ("q".equals(operation)) break;
                System.out.println("Wrong input data!");
                scanner.skip(".*\n");

            }
        }
        System.out.println("Goodbye");
    }
    private static double calculation(int numberOne, int numberTwo, String operation){
        double result = 0;
        switch (operation){
            case "+":
                result = additionCalc(numberOne, numberTwo);
                break;
            case "-":
                result = subtractionCalc(numberOne, numberTwo);
                break;
            case "*":
                result = multiplicationCalc(numberOne, numberTwo);
                break;
            case "!":
                System.out.print("factorial of the first number=");
                result = factorialCalc(numberOne);
                break;
            case "/":
                if(numberOne == 0){
                    break;
                }
                result = divisionCalc(numberOne, numberTwo);
                break;
            case "q":
                break;
            default:
                result = 0;
                break;
        }
        return result;
    }

    private static int additionCalc(int numberOne, int numberTwo){
        return numberOne + numberTwo;
    }
    private static int subtractionCalc(int numberOne, int numberTwo){
        return numberOne - numberTwo;
    }
    private static int multiplicationCalc(int numberOne, int numberTwo){
        return numberOne * numberTwo;
    }
    private static int divisionCalc(int numberOne, int numberTwo){
        return numberOne / numberTwo;
    }
    private static int factorialCalc(int numberOne){
        int res = 1;
        for (int i = 1; i <= numberOne; i++) {
            res *= i;
        }
        return res;
    }

}