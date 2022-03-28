package necklace;

public class Necklace<S> {

	protected S stone;
	
	protected Necklace(S stone) {
		this.stone = stone;
	}
	
	//public abstract void makeNecklace();
	
	@Override
	public String toString() {
		return stone.toString();
	}

}
