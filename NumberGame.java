import java.util.Scanner;
import java.util.Random;

public class NumberGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rdn = new Random();

        boolean flag = true;
         int totalWon = 0;
         int totalAttempt = 0;

        while (flag) {

            int generateNum = rdn.nextInt(100);
            System.out.println("Random number is generated ");
            System.out.println("-------------------------------------");

            int attempt = 0;
            System.out.println("You have a 3 limited attempt");

            while (attempt < 3) {

                attempt++;
                
                System.out.println();
                
                System.out.println(attempt+". Guess the number for the generated number");
                int guessNum = sc.nextInt();

                totalAttempt++;
                

                if(generateNum == guessNum)
                {
                    System.out.println("Congratulations ! The guess number is correct");
                    totalWon++;
                    break;
                }

                else if(generateNum > guessNum)
                {
                    System.out.println(" generated Number is too high");
                }

                else
                {
                    System.out.println(" generated Number is too low");
                }


            }

            System.out.println("you wont to play game again than enter true otherwise enter false ");
            flag = sc.nextBoolean();
            
        }

        System.out.println("-------- Score Board -----------");
        System.out.println("Number of Total Attempt is : " + totalAttempt);
        System.out.println("Number of total round won by you is : " + totalWon);

    }
}