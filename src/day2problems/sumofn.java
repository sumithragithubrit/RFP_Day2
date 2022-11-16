package day2problems;
import java.util.Scanner;

public class sumofn {
	
	public static void main(String[] args) {
		int givenNumber;
		 int sum=0;
		 int count=1;
		 System.out.println("Enter Number");
		Scanner s =new Scanner(System.in);
		givenNumber=s.nextInt();
		
		while(count<=givenNumber)
		{
			sum=sum+count;
			count++;
			
			
		}
		System.out.println("sum of"+givenNumber+" numbers is"+sum);
		
		
		
		
		

	}

}
