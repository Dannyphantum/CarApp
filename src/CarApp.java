
public class CarApp {
	public static void main(String[] args){
		
		Car p = new Car("Red", "Porsche");
		Car j = new Car("Blue", "Jetta");
		
		//c.setCarColor("Red ");
		//c.setCarType("Porsche");
		
		print(p.ignition());
		print(j.ignition());
		print(p.accelerate());
		print(j.accelerate());
		print(j.emissionsCheck());
		print(j.emissionPass());
		print(p.setSpeed(50));
		print(p.stopped());
		//print(p.carPasses());
		
		
		
	
		
	
		
		
	}
		private static void print(String s){
			System.out.println(s);
		}
}
