package QI;

public class Wanshu {

	static int n=0,i=0,sum;
	public static void main(String[] args) {
	for (n = 2; n < 1000; n++)
	{
		sum = 0;
		for (i = 1; i < n; i++)
		{
			if (n%i == 0)
			{
				sum += i;

			}
		}
		if (sum == n)
		{
			System.out.println("因子"+n);;//表示因子
			for (i = 1; i < n; i++)
			{
				if (n%i == 0)
				{
					System.out.print("\t"+i);
				}
			}
			System.out.println("");
		}
	}
 }
}

