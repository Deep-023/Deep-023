package assignment1clg;
import java.lang.*;
import java.util.Scanner;

public class EvenOdd {
	
	void printEvenOdd( int i , int j) {
		int count=0,count2=0;
		System.out.print("\nEven Numbers : ");
		for(int k=i;k<=j;k++) {
		if(k%2==0) {
			System.out.print(k+" ");
			count++;
			}
	        }
		System.out.println();
		System.out.print("Odd Numbers  : ");
		for(int k=i;k<=j;k++) {
			if(k%2!=0) {
				
			    count2++;
				System.out.print(k+" ");
			}
		    }
		System.out.println("\n\nNumber of even numbers in the range = "+count+"\nNumber of odd numbers in the range = "+count2);
	}

	public static void main(String[] args) {
	
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter the starting number: ");
    int n = sc.nextInt();
    System.out.print("Enter the ending number: ");
    int m = sc.nextInt();
    
    EvenOdd num = new EvenOdd();
    num.printEvenOdd(n,m);
    
    
	}

}
