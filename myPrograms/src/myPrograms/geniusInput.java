package myPrograms;

import java.util.Scanner;

public class geniusInput {
	
	public static void main(String[] args) {
		System.out.println("What is your Hobby?");
		
		Scanner scanner = new Scanner(System.in);
		String hobby = scanner.nextLine();
		
		
		
		System.out.println("What is your name?");
		scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		
		System.out.println("hello " + name);
		System.out.println("Quincy's hobby is" + hobby);
		
		
		
		
		
	}
	
}
