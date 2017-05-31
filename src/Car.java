
public class Car extends Vehicle {
	
	public String carColor;
	public String carType;
	
	public String ignition(){
		return "The " + carColor + carType + " is starting.";
	}
	
	public String accelerate(){
		return "The car is accelerating.";
	}
	
	public String setSpeed(int currentSpeed){
		return "The Speed is " + currentSpeed;
	}
	
	public String stopped(){
		return "The " + carColor + carType + "has stopped.";
	}
}