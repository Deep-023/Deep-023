package assignment3clg;
import java.util.Scanner;

public class Posting {
	int courseWork;
	int AptTest;
	int TechTest;
	int interview;
	
	Posting(int courseWork, int AptTest, int TechTest,int interview){
		this.courseWork= courseWork;
		this.AptTest= AptTest;
		this.TechTest= TechTest;
		this.interview= interview;
	}
	
	Posting(int TechTest,int interview){
		this.TechTest= TechTest;
		this.interview= interview;
	}
	
	Posting(int interview){
		this.interview= interview;
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 1 to apply for Programmer post\nEnter 2 to apply for Team Leader\nEnter 3 to apply for Project Manager ");
		System.out.print("Enter your Choice: ");
		int choice= sc.nextInt();
		
		if(choice==1) {
		System.out.print("Enter your marks of Course Work: ");
		int c= sc.nextInt(); 
		System.out.print("Enter your marks of Aptitude test: ");
		int a= sc.nextInt(); 
		System.out.print("Enter your marks of Technical Test: ");
		int t= sc.nextInt(); 
		System.out.print("Enter your marks of Interview: ");
		int i= sc.nextInt(); 
		Posting mem= new Posting(c,a,t,i);
		int sum= mem.courseWork+mem.AptTest+mem.interview+mem.TechTest;
		if(sum>=80)
			System.out.println("You are recurited for the post of programmer.");
	}
		
		if(choice==2) {
			System.out.print("Enter your marks of Technical Test: ");
			int t= sc.nextInt(); 
			System.out.print("Enter your marks of Interview: ");
			int i= sc.nextInt(); 
			Posting mem= new Posting(t,i);
			int sum= mem.TechTest+mem.interview;
			if(sum>=85)
				System.out.println("You are recurited for the post of Team Leader.");
		}
		
		if(choice==3) {

			System.out.print("Enter your marks of Interview: ");
			int i= sc.nextInt(); 
			Posting mem= new Posting(i);
			if(mem.interview>=90)
				System.out.println("You are recurited for the post of Project Manager.");
		}
	}
}
