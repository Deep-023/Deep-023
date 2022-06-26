package assignment4;
import java.util.Scanner;

public class Bookrating {
    
    static double avgrat(int arr[][],int r, int c) {
    	double avg=0;
    	for(int i=0;i<c;i++)
    	avg+= arr[r][i];
    	avg= avg/(c);
    	return avg ;
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hbooknum=0;
		double highrat=0;
		int booknum;
		System.out.print("Enter number of books : ");
		booknum= sc.nextInt();
	    int[][] bookRating = new int[booknum][];
		for(int i=0;i<booknum;i++) {
			System.out.print("\nEnter number of ratings for Book "+(i+1)+" : ");
			int num= sc.nextInt();
			bookRating[i]= new int[num];
			for(int j=0;j<num;j++) {
				System.out.print("Enter Rating No."+(j+1)+" : ");
				bookRating[i][j]= sc.nextInt();
			}
		}
		System.out.println();
		for(int i=0;i<booknum;i++) {
			System.out.println("The average of Book No."+(i+1)+" is "+(avgrat(bookRating,i,(bookRating[i].length))));
			if((avgrat(bookRating,i,(bookRating[i].length)))> highrat) {
			hbooknum=i+1;	
			highrat= (avgrat(bookRating,i,(bookRating[i].length)));
			}
		}
		System.out.println("\nMost popular Book is Book "+hbooknum+" with "+highrat+" Ratings.");

	}

}
