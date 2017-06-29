package Class;

import java.util.Scanner;

public class MagicTrick2 {
	public static void main(String[] args){
	System.out.println("Choose an integer that is positive.");
	Scanner input = new Scanner(System.in);
	int x = input.nextInt();
	if ( 0 < x) {
		System.out.println("You win!");
	}
		else if (0 > x){
			System.out.println("You lose, dummy!");
			
		}
	}
}
