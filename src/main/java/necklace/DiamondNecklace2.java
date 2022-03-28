package necklace;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import stone.Diamond;

public class DiamondNecklace2 {
	
	private static DiamondNecklace2 instance = new DiamondNecklace2();

    private List<Diamond> diamondNecklace;

    public static DiamondNecklace2 getInstance() {
        return instance;
    }

    private DiamondNecklace2() {
    	diamondNecklace = new ArrayList<>();
    }

    public void add(Diamond diamond) {
    	diamondNecklace.add(diamond);
    }
    
    Comparator<Diamond> comparePrices = new Comparator<Diamond>() {
		@Override
		public int compare(Diamond o1, Diamond o2) {
			return Double.compare(o1.countPrice(), o2.countPrice());
		}
	};
	
    public List<Diamond> list() {
        return diamondNecklace.stream()
        		.sorted(comparePrices)
                .collect(Collectors.toList());
    }

}
