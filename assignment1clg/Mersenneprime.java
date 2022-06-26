package assignment1clg;

public class Mersenneprime {
	
	public void mprime(int a , int b){
		
		long i=a,count=0,j=1;
		long num=0;
		System.out.println("P\tMersenne Prime Number");
		for(i=a;i<=b;i++) {
		num = (long)(Math.pow(2,i))-1;
		for(j=1;j<=num;j++) {
		if(num%j==0)
			count++;
		}
		if(count==2) {
			System.out.println(i+"\t"+num);
		}
		count=0;
	}
	}

	public static void main(String[] args) {
		Mersenneprime var = new Mersenneprime();
		var.mprime(2, 31);
	}

}
