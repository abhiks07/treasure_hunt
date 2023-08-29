package com.aurionpro.test;

import java.util.Scanner;

public class TreasureTest {

	public static void main(String[] args) {

		System.out.println("  Welcome to the Treasure Island.\nYour mission is to find the treasure.");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("left or right? (l/r) : ");
		String choice =sc.nextLine();
		if (choice.equals("r")) {
			System.out.println("Fall into a hole.\n Game Over.");
		}
		else if(choice.equals("l")) {
			System.out.println("swim or wait? (s/w) : ");
			String choice2=sc.nextLine();
	     if(choice2.equals("s")) {
	    	 System.out.println("Attacked by trout.\\n Game Over.");
	    }
	     else if (choice2.equals("w")){
	    	 System.out.println("Which door? Red or Blue or yellow (r/b/y)");
	 		String choice3=sc.nextLine();
	 		if(choice3.equals("r")) {
	 			System.out.println("Burned by fire.\n Game Over.");
	 		}
	 		else if(choice3.equals("b")) {
	 			System.out.println("Eaten by beasts.\n Game Over.");
	 		}
	 		else if(choice3.equals("y")) {
	 			System.out.println("You Win!");
	 		}
	 		else {
	 			System.out.println("Game Over");
	 		}
		}
	}
	}
}
