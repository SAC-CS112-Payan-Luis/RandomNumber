/*Luis Payan
 * CS-122
 * Professor Durendal
 */

import java.util.Scanner;

public class RandomNumber {

	public static void main(String[] args) {

		RandomNumber1 myRandom = new RandomNumber1();
		//Declares variables
		int high;
		int com = 0;
		int guess;
		int i = 1;
		int yesno;

		Scanner input= new Scanner(System.in);
		//promps user to enter random max number
		System.out.println("Please enter what number you want for your Random max:");
		high=input.nextInt();
		//do-while
		do
		{
			//round count
		System.out.println("Round " + i); i++;
		System.out.println("Choose a number between 0 and Max: ");
		
		//displays "you win or lose" and asks if you want to play again
		guess = input.nextInt();
		System.out.println(com == guess? "You win!" : "You lose!");
		System.out.printf("Do you want to play again? (1 = Yes, 2 = No)");
		yesno = input.nextInt();
		if (yesno == 1)
		{
			System.out.println("Try again");
		}
		else 
		{
			System.out.println("Bye!");
			break;
		}
		} while (i>1);		   
	}
}