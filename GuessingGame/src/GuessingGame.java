import java.util.Scanner;

public class GuessingGame {

    private Scanner reader;

    public GuessingGame() {
        // use only this scanner, othervise the tests do not work
        this.reader = new Scanner(System.in);
    }

    public void play(int lowerLimit, int upperLimit) {
        instructions(lowerLimit, upperLimit);
        
        int i = 0;
        
        int times = howManyTimesHalvable(upperLimit - lowerLimit + 1);
        
        while (i < times) {
        if (isGreaterThan(average(lowerLimit, upperLimit))) {
            lowerLimit = average(lowerLimit, upperLimit) + 1;
        } else {
            upperLimit = average(lowerLimit, upperLimit);
        }
        
        if (lowerLimit == upperLimit) {
            System.out.println("The number you're thinking of is " + lowerLimit + ".");
            break;
        } 
        i++;
        
    }
        if (lowerLimit != upperLimit) {
            System.out.println("You've beat me!");
        }
        
        
        // write the guessing logic here

    }
    
    public boolean isGreaterThan(int value) {
        System.out.println("Is your number greater than " + value + "? (y/n)");
        String ans = reader.nextLine();
        return (ans.equals("y"));
    }

    public int average(int number1, int number2) {
        return ((number1 + number2) / 2);
    }

    public void instructions(int lowerLimit, int upperLimit) {
        int maxQuestions = howManyTimesHalvable(upperLimit - lowerLimit);

        System.out.println("Think of a number between " + lowerLimit + "..." + upperLimit + ".");

        System.out.println("I promise you that I can guess the number you are thinking with " + maxQuestions + " questions.");
        System.out.println("");
        System.out.println("Next I'll present you a series of questions. Answer them honestly.");
        System.out.println("");
    }

    // a helper method:
    public static int howManyTimesHalvable(int number) {
        // we create a base two logarithm  of the given value

        // Below we swap the base number to base two logarithms!
        return (int) (Math.log(number) / Math.log(2)) + 1;
    }
}
