package assignment5;
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;

class Employee {
	private String name;
	private String id;
	private int age;
	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}
	
	public int getAge() {
		return age;
	}
	
	Employee(String name, String id, int age){
		this.name= name;
		this.id= id;
		this.age= age;
	}
}

class SalariedEmployee extends Employee{
	
	private double empsalary;

	public double getEmpsalary() {
		return empsalary;
	}

	SalariedEmployee(String name, String id, int age,double empsalary) {
		super(name, id, age);
		this.empsalary= empsalary;
	}
	
}	


public class Tester {

	public static void main(String[] args) {
		String name,id;
		double salary;
		int age; 
		boolean a; 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of Employees: ");
        int n= sc.nextInt();
        SalariedEmployee[] arr = new SalariedEmployee[n];
        for(int i=0;i<n;i++) {
        	sc.nextLine();
        	System.out.print("\nEnter the name of Employee No."+(i+1)+" : ");
        	name= sc.nextLine();
        	System.out.print("Enter the id of Employee No."+(i+1)+" : ");
        	id= sc.nextLine();
        	System.out.print("Enter the age of Employee No."+(i+1)+" : ");
        	age= sc.nextInt();
        	System.out.print("Enter the Salary of Employee No."+(i+1)+" : ");
        	salary= sc.nextDouble();
        	System.out.print("Employee is permanent Employee (Enter true/false ): ");
        	a = sc.nextBoolean();
        	if(a)
        		salary+=2000.00;
        	arr[i]= new SalariedEmployee(name,id,age,salary);
        }
        for(int i=0;i<n;i++) {
        	for(int j=i;j<n;j++) {
        		if(arr[i].getEmpsalary()>arr[j].getEmpsalary()) {
        		SalariedEmployee e = arr[i];
        		arr[i]=arr[j];
        		arr[j]=e;
        		}
        	}
        }
        
        
        	System.out.println("\nName  : "+arr[n-1].getName());
        	System.out.println("Id    : "+arr[n-1].getId());
        	System.out.println("Age   : "+arr[n-1].getAge());
        	System.out.println("Salary: "+arr[n-1].getEmpsalary());
        }
}
