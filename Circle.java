package abstractclass;
import java.util.Scanner;

public class Circle extends Shape{
	
	Scanner sc = new Scanner(System.in);
	
	@Override
	public void area() {
		
		double a = 3.14;
		System.out.println("Enter the radius of circle :");
		int b = sc.nextInt();
		
		System.out.println("Area of circle is :"+(a * b * b));
	}
	

}
