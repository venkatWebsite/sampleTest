package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class compareLaptop {

	
	public static void main(String[] args) {
		
		List<Laptop> laps = new ArrayList<Laptop>();
		
		laps.add(new Laptop("Dell", 8 , 800));
		laps.add(new Laptop("Apple", 12, 1200));
		laps.add(new Laptop("Acer", 2, 700));

		Collections.sort(laps);
		
		System.out.print(laps);
		
	}
}
