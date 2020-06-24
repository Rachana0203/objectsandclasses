package p3;

public class Patient {
	private String name;
	private double height;
	private double weight;
	
	public Patient()
	{
		
	}
	public Patient(String name,double height,double weight)
	{
		this.name=name;
		this.height=height;
		this.weight=weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getweight() {
		return weight;
	}
	public void setweight(double weight) {
		this.weight = weight;
	}
	
	public double computeBMI()
	{
		double h = (height * 0.3048)*(height * 0.3048);
		return weight/h;
	}
}