package abstractclass;
import java.util.Scanner;
public class Square extends Shape {
	
	@Override
	public void area() {
		
		Scanner sf = new Scanner (System.in);
		
		System.out.print("Enter the side of Square :");
		int c = sf.nextInt();
		
		System.out.println("Area of the Square is : "+(c * c));
		
		sf.close();
	}

}
