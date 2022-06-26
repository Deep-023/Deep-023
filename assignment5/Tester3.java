package assignment5;
import java.util.Scanner;

class Stock{
	Scanner sc= new Scanner(System.in);
    String name;
    int arr[];
    public int profit=0;
	
	public void input() {
		System.out.print("Enter the name of stock: ");
		name= sc.nextLine();
		System.out.print("Enter number of days: ");
		int n = sc.nextInt();
		arr= new int[n]; 
		System.out.print("Enter price of stock on each day with spaces: ");
		for(int i=0;i<n;i++) {
			arr[i]= sc.nextInt();
		}
	}
}

class Transaction extends Stock{
	
	public void findMaximumProfit() {
		input();
		System.out.println();
		int flag=1;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				flag=0;
				break;
			}
		}
		if(flag==1) {
			System.out.format("Buy on day %d and sell on day %d\n",1,arr.length);
			profit= arr[arr.length-1]- arr[0];
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=i; j<arr.length-2;j++) {
			if(arr[i]<arr[j+1] && arr[j+1]>arr[j+2]) {
				System.out.format("Buy on day %d and sell on day %d\n",i+1,j+2);
				profit+= (arr[j+1]-arr[i]);
				i=j+1;
				break;	
			}
			}
			}
		if(arr[arr.length-2]<arr[arr.length-1] && flag==0) {
			System.out.format("Buy on day %d and sell on day %d\n",arr.length-1,arr.length);
			profit+= arr[arr.length-1]-arr[arr.length-2];
		}
		System.out.println("\nTotal Profit earned is "+profit);
	}
}
public class Tester3 {

	public static void main(String[] args) {
		Transaction s1= new Transaction();
		s1.findMaximumProfit();
	}

}
