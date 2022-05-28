package Week3.Day1;

public class AxisBank extends BankInfo{

	public void Deposit()
	{
		System.out.println("Bank Current Deposit Amount is : Rs 20,000");
	}
	
	public static void main(String[] args) {
		
		AxisBank ab=new AxisBank();
		ab.Deposit();
		ab.Fixed();
		ab.Savings();
		
	}

}
