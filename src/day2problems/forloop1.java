package day2problems;

import java.util.Scanner;

public class forloop1 {

	public static void main(String[] args) {
		int Number;
		 System.out.println("Enter Number ");
		Scanner s =new Scanner(System.in);
	    Number=s.nextInt();
	    int i,sum=0;
	    for(i=1;i<=Number;i++)
	    {
	    	sum=sum+i;
	   
	    }
	    System.out.println("sum of given number is:"+sum);

	}

}
