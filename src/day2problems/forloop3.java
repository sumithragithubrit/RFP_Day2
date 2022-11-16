package day2problems;

import java.util.Scanner;

public class forloop3 {

	public static void main(String[] args) {
		int Number;
		int temp;
		int reverse,sum=0;
		 System.out.println("Enter Number ");
		Scanner s =new Scanner(System.in);
	    Number=s.nextInt();
	       temp=Number;
	    for(reverse=0;Number!=0 ; Number=Number/10)
	    {
	    	 int remainder=Number%10;
	    	reverse=reverse*10+remainder;
	    }
	    if(temp==reverse)
	    {
	    	System.out.println("Given number is polindrome");
	    }
	    else
	    {
	    	System.out.println("Given number is not polindrome");
	    }

	}

}
