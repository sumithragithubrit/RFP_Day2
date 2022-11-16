package day2problems;
import java.lang.Math;

public class operators {

	public static void main(String[] args) {
		int a=6;
		int b=8;
		int c=2;
	 int d=a+b*c;
	 int e=c+a/b;
	 int f=a%b+c;
	 int g=a*b+c;
	System.out.println(d);
	System.out.println(e);
	System.out.println(f);
	System.out.println(g);
System.out.println( "Maximum Number:"+Math.max(d,Math.max(e, Math.max(f, g))));
System.out.println( "Minimum Number:"+Math.min(d,Math.min(e, Math.min(f, g))));

	}

}
