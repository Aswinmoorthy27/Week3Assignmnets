package Overriding;

public class AxisBank implements BankInfo{

	
	//overriding
	public int deposit(int x) {
		System.out.println("Deposit amount is "+x);
		return x;
	}

	public void saving() {
         System.out.println("Saving plan start from 12months above");		
	}

	public void fixed() {
        System.out.println("fixed plan start from 10years above");		

		
	}

	//overriding
	public void deposit() {
              System.out.println("Deposit your amount");	
              
	}
	public static void main(String[] args) {
		
		AxisBank Ax=new AxisBank();
		Ax.deposit();
		Ax.deposit(2000);
		Ax.fixed();
		Ax.saving();
	}

}
