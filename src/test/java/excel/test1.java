package excel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class test1 {
	
	public static void main(String[] args) {
		
		List<test> ts = new ArrayList<test>();
		
		ts.add(new test("HP", 2, 800));
		ts.add(new test("LG", 1, 500));
		ts.add(new test("Mac", 4, 1800));
		
		Comparator<test> obj = new Comparator<test>() {

			public int compare(test o1, test o2) {
			if(o1.getPrice() > o2.getPrice())
				return -1;
			return 1;
			}
			
			
			
		};
		
		
		Collections.sort(ts , obj);
		
		for (test test : ts) {
			System.out.println(test);
		}
	}

}
