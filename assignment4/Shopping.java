package assignment4;
import java.util.Scanner;

public class Shopping {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int[] totalcost= new int[3];
		int count=0;
		int costliest=0;
		int[][][] cart= new int[3][2][];
		for(int i=0;i<3;i++) {
		System.out.print("\nEnter number of Perishable items in Cart "+(i+1)+" : ");
		int n= sc.nextInt();
		cart[i][0]= new int[n];
		for(int k=0;k<n;k++) {
			System.out.print("Enter cost of perishable item number "+(k+1)+" : ");
			cart[i][0][k]= sc.nextInt(); }
		System.out.print("\nEnter number of Non-Perishable items in Cart "+(i+1)+" : ");
		int j= sc.nextInt();
		cart[i][1]= new int[j];
		for(int k=0;k<j;k++) {
			System.out.print("Enter cost of non-perishable item number "+(k+1)+" : ");
			cart[i][1][k]= sc.nextInt(); }
		
		for(int j1=0;j1<2;j1++) {
			for(int k=0;k<cart[i][j1].length;k++)
				totalcost[i]+=cart[i][j1][k]; 
		}
		}
		System.out.println();
		for(int i=0;i<3;i++)
		System.out.println("Total cost of cart"+(i+1)+" = "+(totalcost[i]));
		
		for(int i=0;i<3;i++) {
			for(int k=0;k<cart[i][0].length;k++)
				count++;
		}
		System.out.println("\nNumber of Perishable items sold (on 3 carts) = "+count); 
		
		for(int i=0;i<3;i++) {
			for(int k=0;k<cart[i][1].length;k++) {
				if(cart[i][1][k]>costliest)
					costliest= cart[i][1][k];
			}
		}
		System.out.println("\nCostliest Non-Perishable item of Price : "+costliest);		

	}

}
