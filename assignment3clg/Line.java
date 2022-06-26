package assignment3clg;
import java.util.Scanner;

public class Line {
	int x1;
	int x2;
	int y1;
	int y2;
	int slope;
	
	public Line(int slope) {
		this.slope=slope;
	}
	
	public Line(int slope,int x1, int y1) {
		this.x1 = x1;
		this.y1 = y1;
		this.slope= slope;
	}
	

	public Line(int x1, int x2, int y1, int y2) {
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 1 for Slope-y-intercept\nEnter 2 for Slope point form\nEnter 3 for Two Point form");
		System.out.print("Enter your choice: ");
		int choice= sc.nextInt();
		
		switch(choice){
		case 1:
		{
		System.out.println("");
		System.out.print("Enter m: ");
		int m= sc.nextInt();
		Line l1= new Line(m);
		System.out.printf("\nSlope-y-intercept: y = %dx + c",l1.slope);
		break;
		}
		
		case 2:
		{
		System.out.println("");
		System.out.print("Enter m,x1,y1 respectively: ");
		int m= sc.nextInt();
		int x1= sc.nextInt();
		int y1= sc.nextInt();
		Line l1= new Line(m,x1,y1);
		System.out.printf("\n Slope point form: (y - %d) = %d(x - %d)",l1.y1,l1.slope,l1.x1);
		break;
		}
		
		case 3:
		{
		System.out.println("");
		System.out.print("Enter x1,y1,x2,y2 respectively: ");
		int x1= sc.nextInt();
		int y1= sc.nextInt();
		int x2= sc.nextInt();
		int y2= sc.nextInt();
		Line l1= new Line(x1,x2,y1,y2);
		System.out.printf("\n Two Point form: (y - %d) = %d / %d(x - %d)",l1.y1,(l1.y2-l1.y1),(l1.x2-l1.x1), l1.x1);
		break;
		}
		
		
	}
	}
	}

