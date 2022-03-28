package necklace;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import stone.Amber;

public class AmberNecklace2 {
	
	private static AmberNecklace2 instance = new AmberNecklace2();

    private List<Amber> necklace;

    public static AmberNecklace2 getInstance() {
        return instance;
    }

    private AmberNecklace2() {
        necklace = new ArrayList<>();
    }

    public void add(Amber amber) {
        necklace.add(amber);
    }
    
    Comparator<Amber> comparePrices = new Comparator<Amber>() {
		@Override
		public int compare(Amber o1, Amber o2) {
			return Double.compare(o1.countPrice(), o2.countPrice());
		}
	};

    public List<Amber> list() {
        return necklace.stream()
                .sorted(comparePrices)
                .collect(Collectors.toList());
    }

}
