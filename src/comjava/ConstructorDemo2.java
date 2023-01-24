package comjava;

public class ConstructorDemo2 {
	String SName;
	int id;
	int sal;

	public ConstructorDemo2(String sName, int id, int sal) {
		super();
		SName = sName;
		this.id = id;
		this.sal = sal;
	}

	public String getSName() {
		return SName;
	}

	public void setSName(String sName) {
		SName = sName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public static void main(String[] args) {
		ConstructorDemo2 constructorDemo2 = new ConstructorDemo2("sai", 121, 10000);
		int id2 = constructorDemo2.getId();
		System.out.println(id2);
		ConstructorDemo2 constructorDemo3 = new ConstructorDemo2("sai", 251, 10000);
		int id3 = constructorDemo3.getId();
		System.out.println(id3);
		
	}

}
