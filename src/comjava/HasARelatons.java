package comjava;

public class HasARelatons {

	public static void main(String[] args) {
		car c = new car(new Engine(200), "fortuner");
		c.carName();
	

	}

}

class Engine {
	int speed;

	public Engine(int speed) {
		super();
		this.speed = speed;
	}

	void speed() {
		System.out.println("speed of the car is " + " " + speed);
	}

}

class car {
	Engine e;
	String carName;

	public car(Engine e, String carName) {
		super();
		this.e = e;
		this.carName = carName;
	}

	public Engine getE() {
		return e;
	}

	public void setE(Engine e) {
		this.e = e;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	void carName() {
		System.out.println("the brand of the car is " + " " + carName + " "+ "speed is  "+  e.speed);
	}
}
