package Week3.Day1;

public class Calculator {
	public void add(int a, int b)
	{
			int c=a+b;
	System.out.println("The Adding of Two argument is:"+c);
	}
	
	public void add(int a, int b, int c)
	{
		
	int d=a+b+c;
	System.out.println("The Adding of Three argument is:"+d);
	}
	public void sub(int a, int b)
	{
		
	int c=b-a;
	System.out.println("The subtraction of Two argument is:"+c);
	}
	public void sub(double a, double b)
	{
		
	double c=a-b;
	System.out.println("The subtraction of Two argument with Differnt Datatype is:"+c);
	}
	public void mul(int a, int b)
	{
		
	int c=a*b;
	System.out.println("The Multiplication of Two argument is:"+c);
	}
	public void mul(double a, int b)
	{
		
	double c=a*b;
	System.out.println("The Multiplication of Two argument with Different Datatype is:"+c);
	}
	public static void main(String[] args) {
		
		 Calculator calc=new  Calculator();
		 calc.add(10,15);
		 calc.add(10,20,5);
		 calc.sub(10, 5);
		 calc.sub(10.5,5.2);
		 calc.mul(10, 20);
		 calc.mul(10.5,5);
		 ;
	}

}
