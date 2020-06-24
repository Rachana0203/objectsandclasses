package p1;

public class BoxMain {
	public static void main(String args[])
	{
		Box b1 = new Box(10.2,15.2,20.2);
		
		System.out.println("width : "+b1.getDepth());
		System.out.println("height: "+b1.getHeight());
		System.out.println("Width : "+b1.getWidth());
		System.out.println("volume of the box : "+b1.getVolume());
	}
}
