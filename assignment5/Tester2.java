package assignment5;
import java.util.Scanner;

class Recruitment {
	
	public static double Display(double c) {
		if(c>60.00)
			System.out.println("\nCongratulations you are selected!!!!!  "+c);
		else
			System.out.println("\nYou are rejected  "+c);	
	return 0.0;
}
}

class Testing extends Recruitment{
	int count=0;
	String a= "Aim of company is to improving living of people";
	String b= "Till the time i enjoy working at that position";		
	String c= "Final Method is last Method";
	String d= "Latest version of java is 4.7.1";
	String e= "Some new functions and importance of objects in programmes";
	String f= "i wish to learn method overriding";
	String g= "Teamwork and coordination makes a team successful";
	String h= "Working with team is always better";
	
	int takeTest() {
		count= 0;
		Scanner sc= new Scanner(System.in);
		System.out.println("1.What is the vision of the company?");
		String z = sc.nextLine();
		if(z.equals(a)) {count++;}
		System.out.println("2.How long will you stay in this role?");
		String y = sc.nextLine();
		if(y.equals(b)) {count++;}
		System.out.println("3.What is final method in Java?");
		String x = sc.nextLine();
		if(x.equals(c)) {count++;}
		System.out.println("4.What is the latest version of Java?");
		String w = sc.nextLine();
		if(w.equals(d)) {count++;}
		System.out.println("5.What did you learn about Java in last job?");
		String v = sc.nextLine();
		if(v.equals(e)) {count++;}
		System.out.println("6.What do you wish to learn?");
		String u = sc.nextLine();
		if(u.equals(f)) {count++;}
		System.out.println("7.What makes a team successful?");
		String t = sc.nextLine();
		if(t.equals(g)) {count++;}
		System.out.println("8.Do you work faster in team or as individual?");
		String o = sc.nextLine();
		if(o.equals(h)) {count++;}
		return count;
		}
	
	    void generateResult() {
		double res = ((double)count/8)*100;
		System.out.println("Count is "+count);
		Display(res);		
	 }	 
}

public class Tester2 {

	public static void main(String[] args) {
		Testing t = new Testing();
		t.takeTest();
		t.generateResult();
		
	}

}
