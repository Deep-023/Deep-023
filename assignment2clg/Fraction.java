package assignment2clg;

	import java.util.Scanner;
	public class Fraction {
	    int den;
	    int num;
	  
	    Fraction() {   //constructor without parameters
	        den =1;
	        num =1;
	    }
	    
	    Fraction(int a , int b){  //constructor with parameters
	        this.num=a;
	        this.den= b;
	    }
	    
	   public static int reduce(int a, int b){   //getting G.C.D of both numbers

	        int r=1;
	        int c= Math.min((Math.abs(a)),b);
	        for(int i=2;i<=c;i++) {
	            if (a % i == 0 && b % i == 0)
	                r = i;
	        }
	        return r;
	    }
	    void sub(Fraction f1,Fraction f2){  //subtracting two fractional numbers
	        int r= reduce((f1.num*f2.den - f1.den*f2.num),(f1.den*f2.den));
	        int subn =((f1.num*f2.den - f1.den*f2.num)/r);
	        int subd =((f1.den*f2.den)/r);
	        System.out.print("Subtraction   : "+f1.num+"/"+f1.den+" - "+f2.num+"/"+f2.den+"  = ");
	        System.out.println(subn+"/"+subd);
	    }

	    Fraction add(Fraction f1, Fraction f2){  //adding two fractional numbers
	        Fraction obj = new Fraction();
	        int r= reduce((f1.num*f2.den + f1.den*f2.num),(f1.den*f2.den));
	        obj.num=((f1.num*f2.den + f1.den*f2.num)/r);
	        obj.den=((f1.den*f2.den)/r);
	        return obj;
	    }
	    Fraction mul(Fraction f1,Fraction f2){  //multiplying two fractional numbers
	        Fraction obj = new Fraction();
	        int r= reduce((f1.num*f2.num),(f1.den*f2.den));
	        obj.num =((f1.num*f2.num)/r);
	        obj.den =((f1.den*f2.den)/r);
	        return obj;
	    }
	    void div(Fraction f1, Fraction f2){  //dividing two fractional numbers
	        int r= reduce((f1.num*f2.den),(f1.den*f2.num));
	        int divn =((f1.num*f2.den)/r);
	        int divd =((f1.den*f2.num)/r);
	        System.out.print("Division      : "+f1.num+"/"+f1.den+" / "+f2.num+"/"+f2.den+"  = ");
	        System.out.println(divn+"/"+divd);
	    }

	    void mulTable(int e) {
	       
	        Fraction obj = new Fraction();
	        Fraction obj2 = new Fraction();
	        Fraction obj3 = new Fraction();
	        Fraction f3 = new Fraction(1,e);
	        Fraction f4= new Fraction(1,e);
	        Fraction f5= new Fraction(1,e);
	        System.out.print("\n\t\t" + f3.num + "/" + f3.den + "\t\t");  //printing 1st element of table of 1st row
	        do {
	            obj = add(f3,f4);
	            if (obj.num < obj.den)
	                System.out.print(obj.num + "/" + obj.den + "\t\t"); //printing rest of elements of table of 1st row
	            else break;
	            f3.num = obj.num;
	            f3.den = obj.den;
	        } while (f3.num<f3.den);
            System.out.println(); //giving a new line space
	        do {
	            f3.num=1;
	            f3.den=e;
	            if (f4.num < f4.den) {
	                System.out.print("\n" + f4.num + "/" + f4.den + "\t\t");
	                for (int n=e-1;n>0;n--) {
	                    obj3 = mul(f3,f4);
	                    System.out.print(obj3.num + "/" + obj3.den);
	                    System.out.print("\t\t");
	                    obj = add(f3,f5);
	                    f3.num = obj.num;
	                    f3.den = obj.den;
	                }
	            }
	            System.out.println();
	            obj2 = add(f4,f5);
	            f4.num = obj2.num;
	            f4.den = obj2.den;
	        } while (f4.num < f4.den);
	    }

	    public static void main(String[] args){
	        Fraction f = new Fraction();
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the numerator of 1st number: ");
	        int a = sc.nextInt();
	        System.out.print("Enter the denominator of 1st number: ");
	        int b = sc.nextInt();
	        Fraction f1 = new Fraction(a,b);
	        System.out.print("Enter the numerator of 2st number: ");
	        int c = sc.nextInt();
	        System.out.print("Enter the denominator of 2st number: ");
	        int d = sc.nextInt();
	        Fraction f2 = new Fraction(c,d);
	        System.out.println("\nArithmetic operations are given below: ");
	        Fraction adc= f.add(f1,f2);
	        System.out.print("Addition      : "+a+"/"+b+" + "+c+"/"+d+"  = ");
	        System.out.println(adc.num+"/"+adc.den);
	        f.sub(f1,f2);
	        Fraction mulr =f.mul(f1,f2);
	        System.out.print("Multiplication: "+a+"/"+b+" * "+c+"/"+d+"  = ");
	        System.out.println(mulr.num+"/"+ mulr.den);
	        f.div(f1,f2);
	        System.out.print("\nEnter the denominator for multiplication table: ");
	        int e = sc.nextInt();
	        f.mulTable(e);
	    }
	}

