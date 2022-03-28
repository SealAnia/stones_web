package stone;

public class Diamond extends PreciousStone {
	
	public static final String NAME = "Diamond";
	public static final double PRICEFORUNIT = 11.6;
	public static final String COLOR = "white";
	private double diamondWeight;
	private String diamondClarity;
	
	public double getDiamondWeight() {
		return diamondWeight;
	}
	public void setDiamondWeight(double diamondWeight) {
		this.diamondWeight = diamondWeight;
	}
	
	public String getDiamondClarity() {
		return diamondClarity;
	}
	public void setDiamondClarity(String diamondClarity) {
		this.diamondClarity = diamondClarity;
	}
	
	public Diamond() {
		
	}
	
	public Diamond(String NAME, String COLOR, double weight, double PRICEFORUNIT, String clarity) {
		super(NAME, COLOR, weight, PRICEFORUNIT, clarity);
		this.diamondWeight = weight;
		this.diamondClarity = clarity;
	}
	
	@Override
	public String toString() {
		return super.toString() + " It costs " +  PRICEFORUNIT + "\u0024 for carat.";
	}
	
	@Override
	public double countPrice() {
		double price = PRICEFORUNIT * getDiamondWeight();
		if(getDiamondClarity().equalsIgnoreCase("SV")) {
			price = price * 10;
		}
		else if(getDiamondClarity().equalsIgnoreCase("IF")) {
			price = price * 5;
		}
		return price;
	}

}
