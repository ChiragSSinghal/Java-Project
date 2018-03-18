import java.util.*;
import java.io.*;

public class app {
	public static void main(String[] args) throws IOException, InterruptedException {
		String first_code, second_code, third_code, fourth_code;
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		Scanner ip = new Scanner(System.in);
		System.out.println("Hi! I have hacked this terminal for you to enter the kill codes of his servers. Enter them here.");
		while(true) {
			System.out.println("\nEnter the first code:");
			first_code = ip.next();
			if (first_code.toLowerCase().equals("stop"))
				break;
			else {
				System.out.println("Wrong code try again.");
				continue;
			}
		}
		while(true) {
			System.out.println("\nEnter the second code:");
			second_code = ip.next();
			if (second_code.equalsIgnoreCase("the"))
				break;
			else {
				System.out.println("Wrong code try again.");
				continue;
			}
		}
		while(true) {
			System.out.println("\nEnter the third code:");
			third_code = ip.next();
			if (third_code.toUpperCase().equals("TROJAN"))
				break;
			else {
				System.out.println("Wrong code try again.");
				continue;
			}
		}
		while(true) {
			System.out.println("\nEnter the final code:");
			fourth_code = ip.next();
			if (fourth_code.compareToIgnoreCase("HORSE") == 0)
				break;
			else {
				System.out.println("Wrong code try again.");
				continue;
			}
		}
		System.out.println("\nServers Down!!!");
		ip.close();
	}
}