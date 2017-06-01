
public class CarApp {
	public static void main(String[] args){
		
		Car c = new Car("Red", "Porsche");
		
		//c.setCarColor("red ");
		//c.setCarType("Porsche");
		
		print(c.ignition() + "" + c.getCarColor());
		print(c.accelerate());
		print(c.setSpeed(90));
		print(c.stopped());
		
	
		
	
		
		
	}
		private static void print(String s){
			System.out.println(s);
		}
}
