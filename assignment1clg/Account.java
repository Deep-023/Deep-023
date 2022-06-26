package assignment1clg;
import java.util.Scanner;


public class Account {
	
	String depositor;
	int accno;
	String acctype;
	int balamt;

	public String getDepositor() {
		return depositor;
	}

	public void setDepositor(String depositor) {
		this.depositor = depositor;
	}

	public int getBalamt() {
		return balamt;
	}

	public void setBalamt(int balamt) {
		this.balamt = balamt;
	}

	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	public String getAcctype() {
		return acctype;
	}
	
	public void setAcctype(String accctype) {
		this.acctype = accctype;
	}
	
	public void initialValue(int a) {
		this.balamt=a;
	}
	
	public void depositamt(int b) {
		this.balamt+= b;
	}

	public void withdrawn(int c) {
		if(this.balamt<c) {
			System.out.println("Paisa utna nikalne ki kosis kro jitna acc me ho");
		}
		else
			this.balamt-= c;
	}
	
	public void namebal() {
	     System.out.println("Account holder name: "+ this.depositor);
	     System.out.println("Account balance : "+ this.balamt);
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Account cheenu = new Account();
		System.out.print("\nEnter the Depositor name: ");
		cheenu.setDepositor(sc.nextLine());
		System.out.print("Enter the Account Number: ");
		cheenu.setAccno(sc.nextInt());
		System.out.print("Enter type of Account: ");
		sc.nextLine();
		cheenu.setAcctype(sc.nextLine());
		System.out.print("Enter the Balance amount: ");
		cheenu.initialValue(sc.nextInt());
		
		System.out.println("\nChoose one of the following operations");
		System.out.println("Enter 1 to deposit amount in bank account");
		System.out.println("Enter 2 to withdraw amount from bank account");
		System.out.println("Enter 3 to check details of bank account");
		System.out.println("Enter 4 to exit");
		
		int option;
		do{
			System.out.print("Enter your choice: ");
			option = sc.nextInt();
		switch(option){
			
		case 1:
		{
	    	
	    	System.out.print("\nEnter the amount to be deposited: ");
	    	cheenu.depositamt(sc.nextInt());
	    	cheenu.namebal();
	    	break;
		}
		case 2:
		{
			System.out.print("\nEnter the amount to be withdrawn: ");
			cheenu.withdrawn(sc.nextInt());
			cheenu.namebal();
			break;
		}
		case 3:
		{
			cheenu.namebal();
			break;
		}
		case 4:
			System.out.println("You had exited the program successfully");
			break;
		}
		}while(option != 4);
	}
}