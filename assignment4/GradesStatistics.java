package assignment4;
import java.util.Arrays;
import java.util.Scanner;

public class GradesStatistics {
	
	static double average(int arr[],int n) {
		double avg= 0;
		for(int i=0;i<n;i++) {
			avg+=arr[i];
		}
		avg = avg/n;
		return avg;
	}
	
	static double stddev(int arr[],int n) {
		
		double s=0;
		double avg= average(arr,n);
		for(int i=0;i<n;i++) {
		s+= (double)Math.pow((arr[i]-avg), 2);
		}
		s=s/(n);
		double sdev = (double)Math.pow(s, (0.5));
		return sdev;
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of students : ");
		int nstu= sc.nextInt();
		int[] arr= new int[nstu];
		for(int i=0;i<nstu;i++) {
			System.out.print("Enter the grade of student "+(i+1)+" : ");
			arr[i]= sc.nextInt();
		}
		System.out.print("\n{ ");
		for(int element: arr)
			System.out.print(element+" ");
		System.out.println("}");
		
		System.out.println("The Average is "+average(arr,nstu));
		Arrays.sort(arr);
		System.out.println("The Minimum is "+ arr[0]);
		System.out.println("The Maximum is "+ arr[nstu-1]);
		if(nstu%2==0) {
			int median = (arr[nstu/2]+arr[nstu/2-1])/2;
			System.out.println("The Median is "+ median);
		}
		if(nstu%2==1) {
			int median = arr[nstu/2+1];
			System.out.println("The Median is "+ median);
		}
		System.out.format("The std. deviation is %.2f",stddev(arr,nstu));
	}

}
