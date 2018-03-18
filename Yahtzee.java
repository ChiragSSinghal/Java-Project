import java.util.*;

public class app {
	
	//Function for dice roll
	public static void dr (int Dice[]) {
		System.out.println("Dice Roll:");
		System.out.println("----------------------------------------------------------------------------------");
		for (int i = 0; i < 5; i++)	//Loop for 5 rolls
			Dice[i] = (int)((Math.random() * 6) + 1);	//Random function to generate values from 1 to 6
	}
	
	//Function for displaying dice roll
	public static void dd(int Dice[]) {
		System.out.println("\t\tDice 1\tDice 2\tDice 3\tDice 4\tDice 5\n");
		System.out.println("Dice Values:" + "\t  " + Dice[0] + "\t  " + Dice[1] + "\t  " + Dice[2] + "\t  " + Dice[3] + "\t  " + Dice[4]);
	}
	
	//Function for analyzing Dice roll results
	public static void rr (int Dice[]) {
		int sum;
		int[] sorted = new int[5];
		sum = Dice[0] + Dice[1] + Dice[2] + Dice[3] + Dice[4]; //Calculating the total value for last winning hand
		sorted = Dice;
		Arrays.sort(sorted);	//Sorting array and saving in another array
		
		//Checking for Yahtzee
		if (Dice[0] == Dice[1] && Dice[2] == Dice[1] && Dice[2] == Dice[3] && Dice[3] == Dice[4]) {
			System.out.println("================================================================");
			System.out.println("Rolled: Yahtzee");
			System.out.println("================================================================");
		}
		
		//Checking for 4 of a kind
		else if ((sorted[0] == sorted[1] && sorted[1] == sorted[2] && sorted[2] == sorted[3]) || 
				(sorted[4] == sorted[1] && sorted[1] == sorted[2] && sorted[2] == sorted[3])) {
			System.out.println("================================================================");
			System.out.println("Rolled: 4 of a kind");
			System.out.println("================================================================");
		}
		
		//Checking for Full house
		else if ((sorted[0] == sorted[1] && sorted[1] == sorted[2] && sorted[3] == sorted[4]) || 
				(sorted[0] == sorted[1] && sorted[2] == sorted[3] && sorted[3] == sorted[4])) {
			System.out.println("================================================================");
			System.out.println("Rolled: Full House");
			System.out.println("================================================================");
		}
		
		//Checking for 3 of a kind
		else if ((sorted[0] == sorted[1] && sorted[1] == sorted[2]) || 
				(sorted[1] == sorted[2] && sorted[2] == sorted[3]) || 
				(sorted[2] == sorted[3] && sorted[3] == sorted[4])) {
			System.out.println("================================================================");
			System.out.println("Rolled: 3 of a kind");
			System.out.println("================================================================");
		}
		
		//Checking for Full straight
		else if ((sorted[0] == 1 && sorted[1] == 2 && sorted[2] == 3 && sorted[3] == 4 && sorted[4] == 5) ||
				(sorted[0] == 2 && sorted[1] == 3 && sorted[2] == 4 && sorted[3] == 5 && sorted[4] == 6)) {
			System.out.println("================================================================");
			System.out.println("Rolled: Full Straight");
			System.out.println("================================================================");
		}
		
		//Checking for Straight. Different combinations due to duplicate items
		else if ((sorted[0] == 1 && sorted[1] == 2 && sorted[2] == 3 && sorted[3] == 4) || 
				(sorted[0] == 2 && sorted[1] == 3 && sorted[2] == 4 && sorted[3] == 5) || 
				(sorted[0] == 3 && sorted[1] == 4 && sorted[2] == 5 && sorted[3] == 6) || 
				
				(sorted[0] == 1 && sorted[1] == 2 && sorted[2] == 3 && sorted[4] == 4) || 
				(sorted[0] == 2 && sorted[1] == 3 && sorted[2] == 4 && sorted[4] == 5) || 
				(sorted[0] == 3 && sorted[1] == 4 && sorted[2] == 5 && sorted[4] == 6) || 
				
				(sorted[0] == 1 && sorted[1] == 2 && sorted[3] == 3 && sorted[4] == 4) || 
				(sorted[0] == 2 && sorted[1] == 3 && sorted[3] == 4 && sorted[4] == 5) || 
				(sorted[0] == 3 && sorted[1] == 4 && sorted[3] == 5 && sorted[4] == 6) || 
				
				(sorted[1] == 1 && sorted[2] == 2 && sorted[3] == 3 && sorted[4] == 4) || 
				(sorted[1] == 2 && sorted[2] == 3 && sorted[3] == 4 && sorted[4] == 5) || 
				(sorted[1] == 3 && sorted[2] == 4 && sorted[3] == 5 && sorted[4] == 6)) {
			System.out.println("================================================================");
			System.out.println("Rolled: Small Straight");
			System.out.println("================================================================");
		}
		
		//Displaying the sum if no other winning hand
		else {
			System.out.println("================================================================");
			System.out.println("Rolled: Chance & Total: " + sum);
			System.out.println("================================================================");
		}
	}
	public static void main(String[] args) {
		int[] Dice = new int [5];
		char cho;
		Scanner ip = new Scanner(System.in);	//Scanner for taking user input
		do {	//Loop to repeat the game
			dr(Dice);
			dd(Dice);
			rr(Dice);
			do {	//Loop to check if any character other than y or n is inputed
				System.out.println("Do you want to play again (Yy/Nn)");
				cho = ip.next().charAt(0);
			}while(cho != 'y' && cho != 'Y' && cho != 'N' && cho != 'n');
			if(cho == 'y' || cho == 'Y')
				continue;	//Repeats the game if answer is yes
			else if (cho == 'n' || cho == 'N')
				break;	//Breaks the game loop if answer is no
		}while(true);	//Infinite loop. Only breaks if the user does not want to play again
		ip.close();	//To close the scanner
	}
}