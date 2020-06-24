package p2;

public class Calculator {
	
	static double n1;
	static double n2;
	public Calculator(double n1,double n2 )
	{
		this.n1=n1;
		this.n2=n2;
	}
	public Calculator(double n1,int n2 )
	{
		this.n1=n1;
		this.n2=n2;
	}
	
	public static double powerInt()
	{
		System.out.println("powerInt");
		return Math.pow(n1, n2);
	}
	
	public static double powerDouble()
	{
		System.out.println("powerDouble");
		return Math.pow(n1, n2);
	}
}
