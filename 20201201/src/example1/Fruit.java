package example1;

public class Fruit {
	private String name;
	private int price;

	// constructor
	public Fruit() {
	}

	public Fruit(String name, int price) {
		this.name = name;
		this.price = price;
	}

	// getter
	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	//
	@Override
	public int hashCode() {
		// return super.hashCode();
		return this.name.length()+ this.price;
	}

	@Override
	public boolean equals(Object obj) {
		// Object obj => Fruit 클래스로 Casting
		Fruit fruit = (Fruit) obj;
		boolean b1 = this.name.length() == fruit.name.length();
		boolean b2 = this.price == fruit.price;
		return b1 && b2;
		
		//return this.name.length() == (fruit.name.length()) && this.price == fruit.price;
		// return super.equals(obj);
	}

}// end of class
