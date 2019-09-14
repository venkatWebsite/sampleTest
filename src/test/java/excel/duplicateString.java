package excel;

import java.util.HashMap;
import java.util.Iterator;

public class duplicateString {

	public static void main(String[] args) {

		String str = "Hello welcome to Hello world Hello welcome";

		String[] s = str.split(" ");

		HashMap<String, Integer> hm = new HashMap<String, Integer>();

		for(String s1 : s) {
			
			if(hm.get(s1) !=null) {
				
				hm.put(s1, hm.get(s1) + 1);
			}else {
				
				hm.put(s1, 1);
			}
			
		}

		Iterator<String> temp = hm.keySet().iterator();

		while(temp.hasNext()) {
			
			String tempStr = temp.next();
			
			if(hm.get(tempStr) > 1) {
				
				System.out.println(tempStr + "  "+hm.get(tempStr));
			}
			
		}
		
	}

}
