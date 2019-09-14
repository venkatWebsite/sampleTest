package office;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Predicate;

public class hashMap {
	public static void main(String[] args) {

		ArrayList<Employee> ae= new ArrayList<Employee>();

		ae.add(new Employee("Anand", 5000,25));
		ae.add(new Employee("Prasanna", 4000,22));
		ae.add(new Employee("Syed", 16000,34));
		ae.add(new Employee("Vijay", 26000,47));
		ae.add(new Employee("Vinoth", 12000,28));

		Collections.sort(ae, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				
				return (o1.age<o2.age)?1:(o1.age>o2.age)?-1:0;
			}
		});
		
		for (Employee employee : ae) {
			System.out.print(employee.age+" ");
			System.out.print(employee.name+" ");
			System.out.print(employee.salary);
			System.out.println();
		}
		

		
		
		
		
		
		
		Predicate<Employee> p =e->e.salary>5000 && e.name.length()<=15 && e.age<30;


		for(Employee e:ae) {
			if(p.test(e)) {
				System.out.println(e.name + " "+ e.salary);
			}
		}
	}

}
