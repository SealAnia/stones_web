package stone;

public abstract class Stone implements Countable {
	
	private static String name;
	private static String color;
	private double weight;
	private static double priceForUnit;
	
	public static String getName() {
		return name;
	}
	public void setName(String name) {
		Stone.name = name;
	}
	
	public static String getColor() {
		return color;
	}
	public void setColor(String color) {
		Stone.color = color;
	}
	
	public static double getPriceForUnit() {
		return priceForUnit;
	}
	public void setPriceForUnit(double priceForUnit) {
		Stone.priceForUnit = priceForUnit;
	}
	
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public Stone() {
		
	}
	
	public Stone(String name, String color, double weight, double priceForUnit) {
		Stone.name = name;
		Stone.color = color;
		this.weight = weight;
		Stone.priceForUnit = priceForUnit;
	}
	
	public abstract double countPrice();
	
	@Override
	public String toString() {
		return name + " is " + color + ".";
	}
	
}
