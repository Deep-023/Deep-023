package assignment3clg;
import java.util.Scanner;

public class Date {
	int year,date,hrs,min,sec;
	String month;
	
	Date(){
		this.month = "January";
		this.date= 1;
		this.year =  2000;
		this.hrs=00;
		this.min=00;
		this.sec=00;
	}
	void setDate(int year, String month, int date) {
		this.year =  year;
		this.month = month;
		this.date= date;
	}
	void setDate(int year, String month, int date, int hrs, int min) {
		this.month = month;
		this.date= date;
		this.year = year;
		this.hrs=hrs;
		this.min=min;	
	}
	void setDate(int year, String month, int date, int hrs, int min, int sec) {
		this.month = month;
		this.date= date;
		this.year = year;
		this.hrs=hrs;
		this.min=min;
		this.sec=sec;
	}
	
	static void displayDate(int a,int year, String month, int date, int hrs, int min, int sec) {
		Date d1= new Date();
		if(a==1) {
			d1.setDate(year, month, date);
			System.out.printf(d1.month+" "+d1.date+", "+d1.year);
		}
		if(a==2) {
			d1.setDate(year, month, date, hrs, min);
			System.out.printf(d1.month+" "+d1.date+", "+d1.year+", "+d1.hrs+":"+d1.min);
		}
		if(a==3) {
			d1.setDate(year, month, date, hrs, min, sec);
			System.out.printf(d1.month+" "+d1.date+", "+d1.year+", "+d1.hrs+":"+d1.min+":"+d1.sec);
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter year: ");
		int year= sc.nextInt();
		System.out.print("Enter month: ");
		String month= sc.next();
		System.out.print("Enter date: ");
		int date= sc.nextInt();
		System.out.print("Enter hours: ");
		int hours= sc.nextInt();
		System.out.print("Enter mins: ");
		int mins= sc.nextInt();
		System.out.print("Enter sec: ");
		int sec= sc.nextInt();
		
		System.out.println("\nEnter 1 to print year,month and date only.");
		System.out.println("Enter 2 to print year,month,date,hours,minutes.");
		System.out.println("Enter 3 to print year,month,date,hours,minute,seconds.");
		System.out.print("\nEnter your choice: ");
		int choice = sc.nextInt();
		
		displayDate(choice,year, month, date, hours, mins, sec);
		
		
	}

}
