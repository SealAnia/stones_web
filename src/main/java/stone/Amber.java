package stone;

public class Amber extends SemipreciousStone {
	
	public static final String NAME = "Amber";
	public static final double PRICEFORUNIT = 4.8;
	public static final String COLOR = "yellow";
	private double amberWeight;
	private int amberClarity;
	
	public static String getNAME() {
		return NAME;
	}
	public static void setNAME(String NAME) {
		NAME = "Amber";
	}
	
	public static double getPRICEFORUNIT() {
		return PRICEFORUNIT;
	}
	public static void setPRICEFORUNIT(double PRICEFORUNIT) {
		PRICEFORUNIT = 4.8;
	}
	
	public static String getCOLOR() {
		return COLOR;
	}
	public static void setCOLOR(String COLOR) {
		COLOR = "yellow";
	}
	
	public double getAmberWeight() {
		return amberWeight;
	}
	public void setAmberWeight(double amberWeight) {
		this.amberWeight = amberWeight;
	}
	
	public int getAmberClarity() {
		return amberClarity;
	}
	public void setAmberClarity(int amberClarity) {
		this.amberClarity = amberClarity;
	}
	
	public Amber() {
		
	}
	
	public Amber(String NAME, String COLOR, double weight, double PRICEFORUNIT, int clarity) {
		super(NAME, COLOR, weight, PRICEFORUNIT, clarity);
		this.amberWeight = weight;
		this.amberClarity = clarity;
	}
	
	@Override
	public String toString() {
		return super.toString() + " It costs " +  getPRICEFORUNIT() + "\u0024 for gramm.";
	}
	
	@Override
	public double countPrice() {
		double price = getPRICEFORUNIT() * getAmberWeight();
		if(getAmberClarity() <= 3) {
			price = price * 2;
		}
		else if(getAmberClarity() > 3 && getAmberClarity() <= 7) {
			price = price * 3.5;
		}
		else if(getAmberClarity() > 7) {
			price = price * 5;
		}
		return price;
	}

}
