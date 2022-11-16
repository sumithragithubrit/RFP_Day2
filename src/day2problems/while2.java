package day2problems;

import java.util.Scanner;

public class while2 {

	public static void main(String[] args) {
		int Number;
		 System.out.println("Enter Number");
		Scanner s =new Scanner(System.in);
	    Number=s.nextInt();
	    int reverse=0;
	    while(Number!=0)
	    {
	    	int remainder=Number%10;
	    	reverse=reverse*10+remainder;
	    	Number=Number/10;
	    }
	    System.out.println(reverse);
	}

}
