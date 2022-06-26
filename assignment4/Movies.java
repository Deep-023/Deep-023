package assignment4;
import java.util.Arrays;
import java.util.Scanner;

public class Movies implements Comparable<Movies> {
	String name;
	String type;
	String heroName;
	String heroine;
	Long budget;
	

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter number of Movies: ");
		int no= sc.nextInt();
		Movies[] mov= new Movies[no]; 
		for(int i=0;i<no;i++) {
			mov[i]= new Movies();
			sc.nextLine();
			System.out.print("\nEnter the name of movie: ");
			mov[i].name= sc.nextLine();
			System.out.print("Enter type of movie( action , thriller , comedy ,drama ): ");
			mov[i].type= sc.nextLine();
			System.out.print("Enter name of hero: ");
			mov[i].heroName= sc.nextLine();
			System.out.print("Enter name of heroine: ");
			mov[i].heroine= sc.nextLine();
			System.out.print("Enter budget of movie: ");
			mov[i].budget= sc.nextLong();			
		}
		Arrays.sort(mov);
		System.out.println("\nMovies sorted on the basis of increasing budget is given below:");
		for(int i=0;i<no;i++) {
			System.out.println((i+1)+"...  "+mov[i].name);
		}
		}
		
public int compareTo(Movies mov) {
		
		if(budget==mov.budget)
        return 0;

		else if(budget>mov.budget)
        return 1;

		else
		return -1;

	}

}
