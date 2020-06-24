package p2;

public class CalculatorMain {
	public static void main(String args[])
	{
		Calculator c1 = new Calculator(10.2,2);
		System.out.println(c1.powerDouble());
		Calculator c2 = new Calculator(10,2);
		System.out.println(c2.powerInt());
	}
}
