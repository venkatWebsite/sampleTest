import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class sele {

	public static void main(String[] args) {
		
/*		WebDriverManager.iedriver().setup();
		 DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
		  
		 capabilities.setCapability(InternetExplorerDriver.
		   INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);

		WebDriver driver = new InternetExplorerDriver(capabilities);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("https://amazon.in");
		*/
		
		
		String str = "vimali vimali hello";
		
		String[] s =str.split("");
		
HashMap<String,Integer>hm = new HashMap<String,Integer>();
		for(String temp:s) {
			if(hm.get(temp)!=null) {
				hm.put(temp, hm.get(temp)+1);
			}else {
				hm.put(temp, 1);
				
			}
		}
		Iterator<String> tempite=hm.keySet().iterator();
		String res ="";
		while(tempite.hasNext()) {
			String temp=tempite.next();
			if(!(hm.get(temp)>1)) {
				System.out.println(temp+" is repeated "+hm.get(temp)+" times");
				res = res+temp;
			}
		}
		System.out.println(res);
		
		System.out.println("*************************************************************************************");
		
		Set<Entry<String, Integer>> set = hm.entrySet();
		
List<Entry<String, Integer>> list = new ArrayList<Map.Entry<String,Integer>>(set);
		

Collections.sort(list, new Comparator<Entry<String, Integer>>() {

	public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
		
		return o1.getKey().compareTo(o2.getKey());
	}
});


		for(Entry<String, Integer> val : list) {
			
			System.out.println(val);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
