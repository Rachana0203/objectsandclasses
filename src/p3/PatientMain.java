package p3;

public class PatientMain {

	public static void main(String[] args) {
		Patient p1 =new Patient("abc",5.2,50); //weight in kg, height in feet
		System.out.println("BMI : "+p1.computeBMI());
	}

}
