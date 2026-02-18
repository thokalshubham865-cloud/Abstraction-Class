package abstractclass;

public class Controller {
	
	public static void main(String[] args) {
		
	
		System.out.println();
		Vehicle v;
		v = new Car();
		v.start();
		v.fuleType();
		System.out.println();
		
		v = new Bike();
		v.start();
		v.fuleType();
		System.out.println();
		
		System.out.println();
		Shape s;
		s = new Circle();
		s.area();
		System.out.println();
		s = new Rectangle();
		s.area();
		System.out.println();
		s = new Square();
		s.area();
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	

}
