package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class comparatorFunction {

	public static void main(String[] args) {
		
		List<Laptop> laps = new ArrayList<Laptop>();
		
		laps.add(new Laptop("Google", 16, 1500));
		laps.add(new Laptop("Apple", 4, 1000));
		laps.add(new Laptop("HP", 8, 5000));
		
		Comparator<Laptop> obj = new Comparator<Laptop>() {

			public int compare(Laptop lap1, Laptop lap2) {
	
				if(lap1.getPrice() > lap2.getPrice())
					return 1;
				
				return -1;
			}
			
		
		};
		
		
		Collections.sort(laps, obj);
		
		for(Laptop l : laps) {
		
		System.out.println(l);
		}
	}
	
}
