package excel;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.gargoylesoftware.htmlunit.javascript.host.Map;

public class test  {
	

	private String brand;
	private int ram;
	private int price;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "test [brand=" + brand + ", ram=" + ram + ", price=" + price + "]";
	}
	public test(String brand, int ram, int price) {
		this.brand = brand;
		this.ram = ram;
		this.price = price;
	}
	public int compareTo(test t1) {

		if(this.ram > t1.ram)
			return 1;
		
		return -1;
	}
	
	
	
	
}
