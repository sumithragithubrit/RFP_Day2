package day2problems;

import java.util.Scanner;

public class switch1 {

	public static void main(String[] args) {
		
	        Scanner scan = new Scanner(System.in);
	        System.out.println("Enter your character  ");
	        char c = scan.next(). charAt(0);

	        switch (c) {
	            case 'A':
	                System.out.println(c+ "It is a vowel");
	                 break;
	            case 'E':
	                System.out.println(c+ "It is a vowel");
	                break;
	            case 'I':
	                System.out.println(c+ "It is a vowel");
	                break;
	            case 'O':
	                System.out.println(c+ "It is a vowel");
	                break;
	            case 'U':
	                System.out.println(c+ "It is a vowel");
	                break;
	            
	            default:
	                System.out.println(c+ "It is consonent");
	        }


	}

}
