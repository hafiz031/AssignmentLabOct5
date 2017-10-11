import java.util.Scanner;

public class UnitConv
{
	private static Scanner sc;

	public static void main(String args[])
	{
		System.out.println("To Convert Unit Enter Selection: ");
		System.out.println("1 for Temprature (C to F)");
		System.out.println("2 for Weight (Kg to Pound)");
		System.out.println("3 for Length");

		sc = new Scanner(System.in);
		int opt=sc.nextInt();
		
		if(opt==1)
		{
			TempConv.queryT();
			double x=sc.nextDouble();
			new TempConv(x);
		}
		else if(opt==2)
		{
			WeightConv.queryW();
			double x=sc.nextDouble();
			new WeightConv(x);
		}
		else if(opt==3)
		{
			LengthConv.queryL();
			double x=sc.nextDouble();
			new LengthConv(x);
		}
	}
}
//hafiz031