package assignment2clg;
import java.util.*;
import java.util.Scanner;

public class Employee2 implements Comparable<Employee2>{

	int age;
	int salary;
	String name;
	
 	Employee2(){
		this.age=18;
		this.salary=20000;
		this.name= "Unknown";
	}
	
	

	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public int getSalary() {
		return salary;
	}



	public void setSalary(int salary) {
		this.salary = salary;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of employee: ");
		int n = sc.nextInt();
		Employee2 emp[]= new Employee2[n];
		 for(int i=0;i<emp.length;i++) {
			 emp[i]= new Employee2();// initialize every element in array as reference for object
			 sc.nextLine();
			 System.out.format("\nEnter Name of Employee %d : ",i+1);
			 emp[i].setName(sc.nextLine());
			 System.out.printf("Enter Age of Employee %d: ",i+1);
			 emp[i].setAge(sc.nextInt());
			 System.out.printf("Enter Salary of Employee %d: ",i+1);
			 emp[i].setSalary(sc.nextInt());
		}
		 
		 Arrays.sort(emp);
		 
		 System.out.println("\n\n");
		 System.out.println("Employee are successfully sorted on basis of age:-");
		 for(int i=0; i<emp.length; i++) {
			 System.out.println("\nName of Employee : "+emp[i].getName());
			 System.out.println("Age of Employee: "+emp[i].getAge());
			 System.out.println("Salary of Employee: "+emp[i].getSalary());
		 }
	}



	@Override
	public int compareTo(Employee2 emp) {
		
		if(age==emp.age)
        return 0;

		else if(age>emp.age)
        return 1;

		else
		return -1;

	}

}

