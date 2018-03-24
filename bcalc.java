import java.util.*;

public class bcalc
{
	public static void main(String[] args)
	{
		double a,b,c;	//Initialization of input and output variables
		int ch;		//Choice selection
		char ans;	//Choice selection variable
		Scanner scan = new Scanner(System.in);	//Scanner for taking user input
		do {	//Loop to repeat the whole program
			System.out.println("Enter the first number: ");
			a = scan.nextDouble();	//Take user input for first number
			System.out.println("\nEnter the second number: ");
			b = scan.nextDouble();	//Take user input for second number
			System.out.println("\nSelect the mathematical operation:\n");
			while(true)	//Loop; in case wrong operator is selected 
			{
				System.out.println("1. Addition\t1\t2. Subtraction\n3. Multiplication\t4. Division\n");
				ch = scan.nextInt();
				switch(ch)	//Conditional statement to direct flow based on operation selected
				{
					case 1:	//If '1' is selected, execute these statements
						c = a + b;	//Add the two numbers
						break;
					case 2:	//If '2' is selected, execute these statements
						c = a - b;	//Subtract b from a
						break;
					case 3:	//If '3' is selected, execute these statements
						c = a * b;	//Multiply the two numbers
						break;
					case 4:	//If '4' is selected, execute these statements
						c = a / b;	//Divide a by b
						break;
					default : 
						System.out.println("\nError! Wrong option slected.");	//Scenario, if wrong operator is selected
						continue;	//Skip everything and repeat the loop
				}
				break;	//Close the infinite loop, once value is calculated
			}
			System.out.println("\nThe result is: " + c);
			do {	//Loop to check if correct choice is selected
				System.out.println("\nDo you want to run the calculator again? (Y/N):");
				ans = scan.next().charAt(0);
				if(ans == 'Y' || ans == 'y' || ans == 'n' || ans == 'N')
					break;
				else
					System.out.println("\nError! Wrong character inputed.");
			}while(true);
			if(ans == 'y' || ans == 'Y')
				continue;
			else
				break;
		}while(true);
		scan.close();	//Scanner close
	}
}