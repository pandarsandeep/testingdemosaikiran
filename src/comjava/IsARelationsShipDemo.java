package comjava;

public class IsARelationsShipDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pet pet = new Pet();
		pet.tiger();// super class method
		pet.cat();// sub class method
		//creating the object for super class
		Wild wild = new Wild();
		wild.tiger();
		
	}

}

class Wild {
	String s;

	void tiger() {
		System.out.println("this is form super class ");
	}

}

class Pet extends Wild {
	void cat() {
		System.out.println("this is from subclass");

	}

}