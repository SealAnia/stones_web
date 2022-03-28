package stone;

public class SemipreciousStone extends Stone {
	
private int clarity;
	
	public int getClarity() {
		return clarity;
	}
	public void setClarity(int clarity) {
		this.clarity = clarity;
	}
	
	public SemipreciousStone() {
		
	}
	
	public SemipreciousStone(String name, String color, double weight, double priceForUnit, int clarity) {
		super(name, color, weight, priceForUnit);
		this.clarity = clarity;
	}
	
	@Override
	public String toString() {
		return super.toString() + " It weights " + getWeight() + " gramm.";
	}
	
	@Override
	public double countPrice() {
		double price = getWeight() * getPriceForUnit();
		return price;
	}

}
