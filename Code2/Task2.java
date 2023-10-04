
import java . util.*;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("ATM Machine");
		
		System.out.println(" 1 for w, 2 for d, 3 for b, 4 for exit");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int b=9000;
		switch(n) {
		case 1:System.out.println(" Enter amountfor withdraw");
		int a =sc.nextInt();
		int w=b-a;
		System.out.println(" your witdraw rs "+a);
		System.out.println(" your balance is rs "+w);

		break;
		case 2:System.out.println("Enter amount for deposit");
		int e =sc.nextInt();
		int f=b+e;
		System.out.println(" your deposit rs "+e);
		System.out.println(" your balance is rs "+f);
		break;
		case 3:System.out.println(" Your balance is");
		System.out.println(b);
		break;
		case 4 :System.out.println("Thank you.......");
		break;

		default :System.out.println("Number is not from 1 to 4");
		}
	}

}
