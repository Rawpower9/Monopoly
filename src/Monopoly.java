import java.util.Scanner;
import java.util.Random;
public class Monopoly {
public static void main(String[]args) {
	
	int location1 = 0;
	int location2 = 0;
	
	Scanner myObj = new Scanner(System.in);//For scanning what the user inputed
	System.out.println("Welcome to Monopoly");
	String start = myObj.nextLine();
	System.out.println("It is the first player's turn");
	System.out.println("Press any Number to Roll");
	int start1 = myObj.nextInt();
	
	Random rolling = new Random();
	int rolled = rolling.nextInt(11);
	rolled++;
	
	
		location1=location1+rolled;
		System.out.println(location1);
	
	if(location1 == 1) {
		System.out.println("You are on Old Kent Road");
		System.out.println("Do you want to bye it?");
		System.out.println("It costs $60");
	}
}
}