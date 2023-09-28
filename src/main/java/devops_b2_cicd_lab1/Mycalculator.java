package devops_b2_cicd_lab1;

public class Mycalculator {
	
	public int sum(int a, int b)
	{
		return(a+b);
	}
	
	public int diff(int a, int b)
	{
		return(a-b);
	}

	public static void main(String[] args) {
		
		Mycalculator calc = new Mycalculator();
		System.out.println("Sum is "+calc.sum(20, 10));
		System.out.println("Diff is "+calc.diff(20, 10));

	}

}