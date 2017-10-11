
public class TempConv {
	static public void queryT()
	{
		System.out.println("Ënter value in (deg)C: ");
	}
	public TempConv(double c)
	{
		double f;
		f=(9/5.0)*c+32;
		System.out.println("Value in (deg)F is: "+f);
	}
}
