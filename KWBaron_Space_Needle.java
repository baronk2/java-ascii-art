/*
Kevin Baron
10/17/12
Space Neeedle Project*/

public class KWBaron_Space_Needle {
	
	//sets the size of the space needle
	public static final int SCALE = 20;

	public static void main(String[] args) {
	
		//the order of the decomposed pieces of the needle. See each individual method
		needle();
		topSaucer();
		bottomSaucer();
		needle();
		tube();
		topSaucer();
	
	}//eoMain
	
	
	//Draw the needle at the top of the figure and in the middle of the figure.
	public static void needle() {
		
		//the number of rows is the same as the scale number.
		for (int row = 1; row <= SCALE; row++) {
			
			//there are three times as many spaces on the left as the scale number to center the needle.
			spaces(SCALE * 3);
			
			//these are the pieces that make up the needle
			System.out.println("||");
		
		}//eoFor
	
	}//eoNeedle
	
	
	//oh, by the way this is the method called by all of the other methods. It takes an argument or expression
		//to tell it how many spaces to print.
	public static void spaces(int number) {
	
		for (int i = 1; i <= number; i++) {
			System.out.print(" ");
		}//eoFor
	
	}//eoSpaces
	
	
	//the top of the saucer also includes the middle part.
	public static void topSaucer() {
	
		//once again, the number of rows of the top of the topSaucer is the same as the scale number.
		for (int row = 1; row <= SCALE; row++) {
			//the number of spaces decreases each row because the saucer gets bigger as the row number increases.
			spaces(3 * (SCALE - row));
			//print this shape.
			System.out.print("__/");
			//print this many colons. The greater the row number, the more colons.
			for (int i = 1; i <= 3 * (row - 1); i++) {
				System.out.print(":");
			}//eoFor
			//this should be in the middle of the top part of topSaucer.
			System.out.print("||");
			//print the same number of colons as before.
			for (int i = 1; i <= 3 * (row - 1); i++) {
				System.out.print(":");
			}//eoFor
			//the right edge of every row of this section ends with this shape.
			System.out.println("\\__");
		}//eoFor
		
		//Now for the bottom of the topSaucer. Integer division is used so that another line of this type
			//is only added every time the SCALE increases by four. SCALE 4 will have 1 row, SCALE 8 will have
			//2, SCALE 7 will have 2, and SCALE 1, 2, or 3 will have 0.
		for (int row = 1; row <= SCALE / 4; row++){
			//Start with a pipe.
			System.out.print("|");
			//Then print as many quotation marks as you need, which will be six times the SCALE value.
			for (int i = 1; i <= 6 * SCALE; i++) {
				System.out.print("\"");
			}//eoFor
			//End with another pipe.
			System.out.println("|");
		}//eoFor
	
	}//eoTopSaucer
	
	
	//Here is the bottom of the saucer.
	public static void bottomSaucer() {
		
		//Once again, there will be as many rows as the SCALE value.
		for (int row = 1; row <= SCALE; row++) {
			//Use spaces to center the bottomSaucer. The number of spaces increases with row number.
			spaces(2 * (row - 1));
			//this is the rightside shape.
			System.out.print("\\_");
			//draw the correct number of forward slashes and backslashes in combination.
			for (int i = 1; i <= SCALE + 1 + 2 * (SCALE - row); i++) {
				System.out.print("/\\");
			}//eoFor
			//end with this shape.
			System.out.println("_/");
		}//eoFor
	
	}//eoBottomSaucer
	
	
	//This is the fat tube in the middle of the space needle.
	public static void tube() {
		
		//there will be as many rows as 4 times the SCALE value.
		for (int row = 1; row <= 4 * SCALE; row++) {
			//the number of spaces needs to change to fit the number of % symbols.
			spaces(3 * SCALE - 1 - SCALE / 2);
			//the tube starts with a pipe.
			System.out.print("|");
			//the number of % symbols is the integer division of the SCALE value divided by 2. So for
				//SCALE 1 there will be no %s.
			for (int i = 1; i <= SCALE / 2; i++) {
				System.out.print("%");
			}//eoFor
			//this is centered.
			System.out.print("||");
			//same number of %s as before.
			for (int i = 1; i <= SCALE / 2; i++) {
				System.out.print("%");
			}//eoFor
			//end with a last pipe.
			System.out.println("|");
		}//eoFor
	
	}//eoBottomSaucer

}//eoClass