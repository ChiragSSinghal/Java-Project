import java.util.*;	//Required for Scanner
import java.io.*;	//Required for clear screen command

public class KCapp {
	public static void main(String[] args) throws IOException, InterruptedException { //IoException and InterruptedException are required for DOS command prompt clear screen
		String first_code, second_code, third_code, fourth_code;
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();	//Statement for clear screen. Works only with Win10 command prompt
		Scanner ip = new Scanner(System.in);
		System.out.println("Hi! I have hacked this terminal for you to enter the kill codes of his servers. Enter them here.");
		while(true) {	//First infinite loop, broken only when correct passcode is entered
			System.out.println("\nEnter the first code:");
			first_code = ip.next();
			if (first_code.toLowerCase().equals("stop"))	//Converting inputed string to lower case and then comparing with another string
				break;
			else {
				System.out.println("Wrong code try again.");
				continue;
			}
		}
		while(true) {	//Second infinite loop, broken only when correct passcode is entered
			System.out.println("\nEnter the second code:");
			second_code = ip.next();
			if (second_code.equalsIgnoreCase("the"))	//Comparing inputed string with another string, ignoring character case
				break;
			else {
				System.out.println("Wrong code try again.");
				continue;
			}
		}
		while(true) {	//Third infinite loop, broken only when correct passcode is entered
			System.out.println("\nEnter the third code:");
			third_code = ip.next();
			if (third_code.toUpperCase().equals("TROJAN"))	//Converting inputed string to upper case and then comparing with another string
				break;
			else {
				System.out.println("Wrong code try again.");
				continue;
			}
		}
		while(true) {	//Fourth infinite loop, broken only when correct passcode is entered
			System.out.println("\nEnter the final code:");
			fourth_code = ip.next();
			if (fourth_code.compareToIgnoreCase("HORSE") == 0)	//Comparng inputed string with another string, ignoring case. If strings are equal compareToIgnoreCase returns a '0'
				break;
			else {
				System.out.println("Wrong code try again.");
				continue;
			}
		}
		System.out.println("\nServers Down!!!");
		ip.close();	//Close for scanner
	}
}
