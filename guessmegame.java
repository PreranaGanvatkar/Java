package game;
import java.util.Random;
import java.util.Scanner;

public class guessmegame {

	public static void main(String[] args) {
		System.out.println("Welcome to the Game!\n");
		System.out.println("Enter your Name:");
		
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		System.out.println("Hello "+name);
		
		System.out.println("\nShall we Start:");
		System.out.println("\t1.Yes\n\t2.No");
		
		int answer = sc.nextInt();
		
		while(answer!=1) {
			System.out.println("Shall we Start:");
			System.out.println("\t1.Yes\n\t2.No");
			
			answer = sc.nextInt();
		}
			
			Random random = new Random();
			int x = random.nextInt(20)+1;
			System.out.println("Guess the number: ");
			int userInput = sc.nextInt();
			
			int timeTried = 0;
			boolean haswon = false;
			boolean shouldFinish  = false;
			
			while(!shouldFinish) {
				timeTried++;
				
				if(timeTried<5) {
					if(userInput==x) {
					haswon = true;
					shouldFinish = true;
					} 
					else if(userInput>x)
					{
						System.out.println("Guess lower ");
						userInput = sc.nextInt();
					} 
					else 
					{
						System.out.println("Guess higher ");
						userInput=sc.nextInt();
					}
				}
					else {
						shouldFinish = true;
					}
			}
		

		if(haswon) {
			System.out.println("Congratulations! you have guessed in your "+timeTried+" guess");
		}else {
			System.out.println("Game over!");
			System.out.println("The number was : "+x);
		}
	}
		
}

