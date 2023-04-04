// WRITE YOUR CODE HERE

import java.util.*;

public class Menu {

    public static void main(String[]args) {

        int intSelector, firstInt, secondInt;
        boolean close = false;
        String answer;

        Scanner sc = new Scanner(System.in);

        try {
            while(!close) {

                System.out.println("""
                        What would you like to do?
                         > 1. Sum of 2 Integers
                         > 2. Product of 2 Integers
                         > 3. Determine if 2 Integers are Divisible
                         > 0. Exit
                        """);

                intSelector = sc.nextInt();

                if(intSelector == 0) {
                    System.out.println("Goodbye");
                    close = true;
                } else if(intSelector > 0 && intSelector < 4) {

                    System.out.println("Enter first number: ");
                    firstInt = sc.nextInt();

                    System.out.println("Enter second number: ");
                    secondInt = sc.nextInt();

                    if(intSelector == 1) {
                        answer = sum2Ints(firstInt, secondInt);
                        System.out.println(answer);

                    } else if(intSelector == 2) {
                        answer = prod2Ints(firstInt, secondInt);
                        System.out.println(answer);

                    } else {
                        if(firstInt % secondInt == 0) {
                            answer = mod2Ints(firstInt, secondInt);
                            System.out.println(answer);

                        } else {
                            System.out.println("No");

                        }

                    }

                } else {
                    System.out.println("Your choice should be between 0 and 3.");
                }

            }
        }
        catch(InputMismatchException error) {

            System.out.println("Input format error, please enter a whole number.");
            System.out.println("Something went wrong!");
            System.out.println("The error: " + error);

        }

        sc.close();
    }

    static String sum2Ints(int intOne, int intTwo) {
        int answerSum;
        answerSum = intOne + intTwo;
        return "The answer to the sum of " + intOne + " and " + intTwo + " is " + answerSum + ".";
    }

    static String prod2Ints(int intOne, int intTwo) {
        int answerProd;
        answerProd = intOne * intTwo;
        return "The answer to the product of " + intOne + " and " + intTwo + " is " + answerProd + ".";
    }

    static String mod2Ints(int intOne, int intTwo) {
        int answerMod;
        answerMod = intOne / intTwo;
        return "The answer is " + answerMod;
    }

}

