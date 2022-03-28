package stone;

public class PreciousStone extends Stone {
	
private String clarity;
	
	public String getClarity() {
		return clarity;
	}
	public void setClarity(String clarity) {
		this.clarity = clarity;
	}
	
	public PreciousStone() {
		
	}
	
	public PreciousStone(String name, String color, double weight, double priceForUnit, String clarity) {
		super(name, color, weight, priceForUnit);
		this.clarity = clarity;
	}
	
	@Override
	public String toString() {
		return super.toString() + " It weights " + getWeight() + " carat." + " Clarity: " + clarity.toUpperCase() + ".";
	}
	
	@Override
	public double countPrice() {
		double price = getWeight() * getPriceForUnit();
		return price;
	}

}
