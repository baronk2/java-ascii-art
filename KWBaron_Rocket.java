/*
Kevin Baron
10/15/12
Rocket
*/

public class KWBaron_Rocket{

	public static final int SCALE = 3;

	public static void main(String[] args) {
	
		topTail();
		line();
		caret();
		vee();
		line();
		vee();
		caret();
		line();
		topTail();
	
	}//eoMain
	
	public static void topTail() {
	
		int height = 2 * SCALE - 1;
		
		for (int row = 1; row <= height; row++) {
			
			int spaces = height - row + 1;
			
			for (int i = 1; i <= spaces; i++) {
				System.out.print(" ");
			}//eoFor
			
			for (int i = 1; i <= row; i++) {
				System.out.print("/");
			}//eoFor
			
			System.out.print("**");
			
			for (int i = 1; i <= row; i++) {
				System.out.print("\\");
			}//eoFor
			
			System.out.println();
			
		}//eoFor
	
	}//eoTopTail
	
	public static void line() {
	
		System.out.print("+");
		
		for (int i = 1; i <= SCALE * 2; i++) {
			System.out.print("=*");
		}//eoFor
		
		System.out.println("+");
	
	}//eoLine
	
	public static void caret() {
	
		for (int row = 1; row <= SCALE; row++) {
			
			System.out.print("|");
			
			for (int dot = 1; dot <= SCALE - row; dot++) {
				System.out.print(".");
			}//eoFor
			
			for (int caret = 1; caret <= row; caret++) {
				System.out.print("/\\");
			}//eoFor
			
			for (int caret = 1; caret <= row; caret++) {
				System.out.print("/\\");
			}//eoFor
			
			System.out.println("|");
			
		}//eoFor
	
	}//eoCaret
	
}//eoClass