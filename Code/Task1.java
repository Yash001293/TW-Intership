
import java .util.*;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner (System.in);
		int mn =(int) (Math.random()*100);
//		
		System.out.println("Welcome to Guess Number Game");
		System.out.println("You will Be Asked to Guess A Number To Win The Game");
		System.out.println("You Have Maximum 15 Attempt Limit");
//		System.out.println(mn);
//		int un= 0;

		do {
			System.out.println("Enter a Guess number Between 1 to 100");

			int un = sc.nextInt();
			if(un==mn) {
				System.out.println("OOhhOO !, Your Number is Correct. You win the Game.. ");
               break;
			}
			else if(un>mn) {
				System.out.println("Your Guess Number is Greater");

			}
			else {
				System.out.println("Your Guess Number is Small");

			}

		}while(mn>0);
		System.out.println("!!!-------------------------------------------------------!!!");
		System.out.print("My number was  ::::::   ");
		System.out.println(mn);
	}

}
