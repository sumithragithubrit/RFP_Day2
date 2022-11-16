package day2problems;
import java.util.Scanner;

public class If1 {
	public static void main(String[] args) {
		
		int Number;
		Scanner Scan= new Scanner(System.in);
		System.out.println("Enter number between 0 to 9");
		 Number= Scan.nextInt();
		
        if(Number>=0 && Number<=9)
        {
        
        
        	
         if(Number%10==0)
        {
        	System.out.println("ZERO");
        }
        	else if(Number%10==1)
        	{
            	System.out.println("ONE");
        	}
            	else if(Number%10==2)
            	{
                	System.out.println("TWO");
            	}
                	else if(Number%10==3)
                	{
                    	System.out.println("THREE");
                	}
                    	else if(Number%10==4)
                    	{
                        	System.out.println("FOUR");
                    	}
                        	else if(Number%10==5)
                        	{
                            	System.out.println("FIVE");
                        	}else if(Number%10==6)
                        	{
                                	System.out.println("SIX");
                        	}
                                	else if(Number%10==7)
                                	{
                                    	System.out.println("SEVEN");
                                	}
                                    	else if(Number%10==8)
                                    	{
                                        	System.out.println("EIGHT");
                                    	}
                                        	else if(Number%10==9){
                                            	System.out.println("NINE");
                                        	}
        
        
        else
        {
        	System.out.println("Entered Number is outof bound");
        
        }
        }
        

	}

}
