package assignment5;
import java.util.Scanner;

class Production{
	String title,director,writer;
	static int playnum=0;
	
	Production(String title,String director,String writer)
	{
		this.title= title;
		this.director= director;
		this.writer= writer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	public String toString(){
		return ("\nTitle: "+title+"\nName of director: "+director+"\nName of Writer: "+writer);
	}
}

class Play extends Production {
	
	Play(String t, String d , String w){
		super(t,d,w);
		playnum++;
	}
	
	public String toString() {
		return super.toString();
	}
}

class Musical extends Play{
	String composer,lyricist;
	static int movnum=0;
	
	Musical(String t,String d , String w, String c, String l){
		super(t,d,w);
		composer=c;
		lyricist=l;
		movnum++;
	}

	public String getComposer() {
		return composer;
	}

	public void setComposer(String composer) {
		this.composer = composer;
	}

	public String getLyricist() {
		return lyricist;
	}

	public void setLyricist(String lyricist) {
		this.lyricist = lyricist;
	}
	public String toString() {
	return (super.toString()+"\nName of Composer: "+composer+"\nName of Lyricist: "+lyricist);
}
}

public class Tester4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Play [] arrp= new Play[3];
		for(int i=0;i<3;i++) {
			System.out.println("Enter details of "+(i+1)+" play Performance:-");
			System.out.print("Enter the title: ");
			String title= sc.nextLine();
			System.out.print("Enter name of Director: ");
			String director= sc.nextLine();
			System.out.print("Enter name of Writer: ");
			String writer= sc.nextLine();
			arrp[i]= new Play(title,director,writer);
			System.out.println();
		}

		Musical [] arr= new Musical[2];
		for(int i=0;i<2;i++) {
			System.out.println("Enter details of "+(i+1)+" Musical Performance:-");
			System.out.print("Enter the Title: ");
			String title= sc.nextLine();
			System.out.print("Enter name of Director: ");
			String director= sc.nextLine();
			System.out.print("Enter name of Writer: ");
			String writer= sc.nextLine();
			System.out.print("Enter name of Composer: ");
			String composer= sc.nextLine();
			System.out.print("Enter name of Lyricist: ");
			String lyricist= sc.nextLine();
			arr[i]= new Musical(title,director,writer,composer,lyricist);	
			System.out.println();
		}
		
		for(int i=0;i<3;i++)
			System.out.println(arrp[i]);
		for(int i=0;i<2;i++)
			System.out.println(arr[i]);
		System.out.println("\nTotal number of performances are "+Play.playnum);
		System.out.println("Total box office collection is Rupees "+(((Play.playnum-Musical.movnum)*500)+Musical.movnum*800));
	}

}
