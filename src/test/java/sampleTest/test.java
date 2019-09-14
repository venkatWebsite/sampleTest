package sampleTest;

public class test {
	public static String alpha;
	public static void main(String[] args) {
	test obj =new test();
	obj.text1();	
	obj.text2();
		
	}
	public void text1() {
        alpha= "venkat";
		System.out.println("this is first text");
		
	}
public void text2() {
String name= "venkat";

if (alpha == name) {
	System.out.println("name got matched");
}else {
	System.out.println("not matched");
}

	}


}
