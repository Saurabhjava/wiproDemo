package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class Employee implements Comparable<Employee> {
	private String name;
	private String city;
	private double salary;
	
	
	public Employee(String name, String city, double salary) {
		super();
		this.name = name;
		this.city = city;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}	
	public String toString() {
		return name+"\t"+city+"\t"+salary;
	}
	@Override
	public int compareTo(Employee o) {
		
		return this.name.compareTo(o.name);
	}
}

class SortByCity implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.getCity().compareTo(e2.getCity());
	}
	
}
class SortBySalary implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.getSalary().compareTo(e2.getSalary());
	}
	
}
public class ListDemo {	
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("1: for Name");
		System.out.println("2: for City");
		System.out.println("3: for Salary");
		List<Employee> li=new ArrayList<Employee>();
		
		li.add(new Employee("Amit","Gurgaon",34000));
		li.add(new Employee("Rahul","Delhi",45000));
		li.add(new Employee("Alok","Bangalor",25000));
		li.add(new Employee("Naushad","Mumbai",75000));
		System.out.println("Enter Your Choice");
		int ch=s.nextInt();
		switch(ch) {
		case 1:
			Collections.sort(li);
			break;
		case 2:
			Collections.sort(li,new SortByCity());
			break;
		case 3:
			Collections.sort(li,new SortBySalary());
			break;
		default:
			System.out.println("Enter Correct choice");
		}
		Collections.sort(li);
		for(Employee e:li)
			System.out.println(e);
		
	}

}

