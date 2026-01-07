import java.util.*;
class example2
{
	public static void main(String[] args) 
	{
		int [][] a={{10,20,30},{543,766,8}};

		for (int i=0;i<a.length ;i++ ) 
		{
			System.out.print(Arrays.toString(a[i]));
		}
		System.out.println();
		m1();
	}

	public static void m1()
	{
		int [][][] b={{{10,11,12},{23,34,56},{56,67}}};

		System.out.print(Arrays.deepToString(b));
	}
}