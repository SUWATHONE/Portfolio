package module1.chapter3arrays;

import java.util.Random;
import java.util.Scanner;

public class MindGame {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(0,100);
        System.out.println(randomNumber);

        System.out.println("Welcome To The Mind Game");
        int final_count = 0;

            while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number that you want to guess>> ");
            int user_i_num = scanner.nextInt();
            final_count ++;

            if(user_i_num < randomNumber) {
                System.out.println("Your guess is less than the correct answer.");
            }
            else if (user_i_num > randomNumber ){
                System.out.println("Your guess is greater than the correct answer");
            }
            else{
                System.out.println("The answer is correct");
                System.out.println("You are Genius");
                System.out.println(final_count);
                break;
            }
            }
    }
}