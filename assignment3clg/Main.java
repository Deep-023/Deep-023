package assignment3clg;

class Test {
	double base;
	int power,logBase,argument;
	
	Test(){
		this.base = 2.00;
		this.argument=2;
		this.logBase=2;
		this.power=2;
	}
	
	double calculate (double base, int power) {
		double c= (double)Math.pow(base,power);
		return c;
	}
	
	double calculate (int logBase, int argument) {
		double c= ((double)Math.log(argument)/(double)Math.log(logBase));
	    return c;
	}
}

public class Main {
	
	static void Display(Test t1) {
		double r=t1.calculate(t1.logBase,t1.argument);
		System.out.println("Value of the log of 2 to the base 2 =  "+r);
		double rr=t1.calculate(t1.base,t1.power);
		System.out.println("Value of the 2.0 raised to 2 =  "+rr+"\n\n");
		
	}
	public static void main(String[] args) {
		Test t= new Test();
		double r=t.calculate(2,4);
		System.out.println("Value of the log of 4 to the base 2 =  "+r);
		double rr=t.calculate(2.0,4);
		System.out.println("Value of the 2.0 raised to 4 =  "+rr+"\n");
		Display(t);
	}

}

