package day2problems;

import java.util.Scanner;

public class forloop2 {

	public static void main(String[] args) {
		int reverse;
		int number;
		System.out.println("Enter Number ");
		Scanner s =new Scanner(System.in);
	    number=s.nextInt();
		for(reverse=0;number!=0;number=number/10)
		{
			int remainder=number%10;
			reverse=reverse*10+remainder;
		}
System.out.println("Reverse of given number is"+reverse);
	}

}
