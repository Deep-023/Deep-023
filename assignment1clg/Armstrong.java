package assignment1clg;
import java.util.Scanner;

public class Armstrong {
	
	void Armstrong(int a, int b){
		int k,count=0,sum=0,n;
		System.out.println();
		System.out.print("\nArmstrong numbers within given range are: ");
		for(int i=a;i<=b;i++) 
		{	
			k=i;
			while(k!=0) {
				k=k/10;
				count++;
			}
			n=i;
			while(n!=0) {
				
				sum= (int) (sum + Math.pow((n%10), count));
				n= n/10;
			}
			if(sum==i) {
				System.out.print(sum+ " ");
			}
			sum=0;
			count=0;
	     }	
	}
	
	void Prime(int a, int b) {
		int i = a,j=1,count=0,k=0;
		System.out.print("\n\nPrime numbers within given range are: ");
		for(i=a;i<=b;i++) {
			
			for(j=1;j<=i;j++) {
			if(i%j==0) {
				count++;
			}
			}
			if(count==2) {
				k++;
				System.out.print(i+" ");
			}
			count=0;
			
		}
		System.out.println("\n\nNumber of prime numbers are: "+ k);
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the starting number: ");
		int i = sc.nextInt();
		//System.out.println();
		System.out.print("Enter the ending number: ");
		int j = sc.nextInt();
		
		Armstrong arm = new Armstrong();
		arm.Armstrong(i,j);
		arm.Prime(i,j);
	}
}
