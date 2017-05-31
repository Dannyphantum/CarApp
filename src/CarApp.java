
public class CarApp {
	public static void main(String[] args){
		
		Car c = new Car();
		print(c.ignition());
		print(c.accelerate());
		print(c.setSpeed());
		print(c.stopped());
		
		
	}
		private static void print(String s){
			System.out.println(s);
		}
}
