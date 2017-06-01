
public class Car extends Vehicle {
	
	private String carColor;
	private String carType;
	
	public Car(String carColor, String carType){
		this.setCarColor(carColor);
		this.setCarType(carType);
	}
	
	public String ignition(){
		return "The " + this.carColor + this.carType + " is starting.";
	}
	
	public String accelerate(){
		return "The car is accelerating.";
	}
	
	public String setSpeed(int currentSpeed){
		return "The Speed is " + currentSpeed;
	}
	
	public String stopped(){
		return "The " + this.carColor + this.carType + " has stopped.";
	}

	public String getCarColor() {
		return carColor;
	}

	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}

	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}
}