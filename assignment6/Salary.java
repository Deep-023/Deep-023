package assignment6;

class Employee{
	public double salary,bonus;
	double getSalary() {
		salary=10000;
		return salary;		
	}
	
	double getBonus() {
		bonus=0;
		return bonus;
	}	
}

class Intern extends Employee{
	double getSalary() {
		salary=10000*3/4;
		return salary;		
	}
	double getBonus() {
		bonus=500;
		return bonus;
	}
}

class Clerk extends Employee{
	double getSalary() {
		salary=10000*1/2;
		return salary;		
	}
	double getBonus() {
		bonus=1000;
		return bonus;
	}
}

class Manager extends Employee{
	double getSalary() {
		salary=10000*2;
		return salary;		
	}
	double getBonus() {
		bonus=2000;
		return bonus;
	}
}
	public class Salary {

	public static void main(String[] args) {
	
		Employee e1= new Employee();
		Intern i1=new Intern();
		Clerk c1= new Clerk();
		Manager m1= new Manager();
		
		System.out.println("Salary of Manager is: "+e1.getSalary()+"\nBonus of Manager is: "+e1.getBonus());
		System.out.println("\nSalary of Intern is: "+i1.getSalary()+"\nBonus of Intern is: "+i1.getBonus());
		System.out.println("\nSalary of Clerk is: "+c1.getSalary()+"\nBonus of Clerk is: "+c1.getBonus());
		System.out.println("\nSalary of Manager is: "+m1.getSalary()+"\nBonus of Manager is: "+m1.getBonus());

		System.out.println("\nTotal Salary of Manager is: "+(e1.getSalary()+e1.getBonus()));
		System.out.println("Total Salary of Intern is: "+(i1.getSalary()+i1.getBonus()));
		System.out.println("Total Salary of Clerk is: "+(c1.getSalary()+c1.getBonus()));
		System.out.println("Total Salary of Manager is: "+(m1.getSalary()+m1.getBonus()));
	}

}
