package com.org.lab1.collection;

import java.util.ArrayList;
import java.util.List;
import com.org.lab1.employee.*;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Collection {

	private List<Employee> empList= new ArrayList<Employee>();
	
	@Bean
	public List<Employee> getEmpList()
	{
		empList.add(new Employee(1, "harsh",55000.0));
		empList.add(new Employee(2,"sagar",40000.0));
		empList.add(new Employee(3,"madhav",25000.0));
		empList.add(new Employee(4,"viru",10000.0));
		
		return empList;
	}
}
