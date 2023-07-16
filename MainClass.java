package com.veri;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;



public class MainClass {

	public static void main(String [] args) {
		List<Employee> list=new ArrayList<Employee>();
		list.add(new Employee(111,"Jiya Briein",32, "Female","HR",2011,2500.0));
		list.add(new Employee(122,"Paul Niksui",25, "Male","Sales and Marketing",2011,2500.0));
		list.add(new Employee(133,"Martin Theron",29, "Male","Infrastructure",2011,2500.0));
		list.add(new Employee(144,"Murali Gowda",28, "Female","Product Development",2011,2500.0));
		list.add(new Employee(155,"Nima Roy",27, "Male","HR",2011,2500.0));
		list.add(new Employee(166,"Iqbal Hussain",43, "Male","Security and Transport",2011,2500.0));
		list.add(new Employee(177,"Manu Sharma",35, "Female","Account and Finance",2011,2500.0));
		list.add(new Employee(188,"Wang Liu",31, "Male","Sales and Marketing",2011,2500.0));

		//Print the list of male and female employees in the list 
	long femaleCount=	list.stream().filter(e->e.getGender().equals("Female")).count();
	System.out.println(femaleCount);
	long maleCount=	list.stream().filter(e->e.getGender().equals("Male")).count();
	System.out.println(maleCount);

	//print the departments in the list
	list.stream().map(e->e.getDepartment()).distinct().collect(Collectors.toList()).forEach(System.out::println);
	}

}
