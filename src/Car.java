
public class Car extends Vehicle {
	
	private String carColor;
	private String carType;
	
	public Car(String carColor, String carType){
		this.setCarColor(carColor);
		this.setCarType(carType);
	}
	
	public String ignition(){
		return "The " + this.carColor + " " + this.carType + " is starting.";
	}
	
	public String accelerate(){
		return "The " + this.carColor + " " + this.carType + " is accelerating.";
	}
	
	public String setSpeed(int currentSpeed){
		return "The " + this.carColor +" "+ this.carType + " is going " + currentSpeed + " mph.";
	}
	
	public String stopped(){
		return "The " + this.carColor +" "+ this.carType + " has stopped.";
	}

	public String emissionsCheck(){
		return "The " + this.carColor +" "+ this.carType + " has stopped to have its emission test.";
	}
	
	public String emissionPass(){
		return "The " + this.carColor +" "+ this.carType +" "+ " passes it emissions test.";
		}
	
	public String getCarColor() {
		return carColor;
	}

	public String carPasses(){
		return "The " +" "+ this.carColor +" "+ this.carType +" passes the " +" "+ this.carColor +" "+ this.carType;
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