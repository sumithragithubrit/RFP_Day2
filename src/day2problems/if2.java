package day2problems;

import java.util.Scanner;

public class if2 {

	public static void main(String[] args) {
		int Number;
		Scanner Scan= new Scanner(System.in);
		System.out.println("Enter number");
		 Number= Scan.nextInt();
		
		if(Number%10==1)
		{
			System.out.println(Number+"unit");
		}
			else if(Number%100==10)
			{
				System.out.println(Number+"ten");	
			}
			else if(Number%1000==100)
			{
				System.out.println(Number+"hundred");	
			}
			else if(Number%10000==1000)
			{
				System.out.println(Number+"thousand");	
			}
		
		
		else
		{
			
				System.out.println("Invalid input");	
			
		}

	}

}
