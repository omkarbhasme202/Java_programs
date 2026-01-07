import java.util.*;
class oneDarray
{
	public static void main(String[] args) 
	{
		int [] a={1,2,3,4};
		
		for (int i=0;i<a.length ;i++ ) 
		{
			System.out.print(a[i]+" ");	
		}
		System.out.println();
		m1();

	}

	public static void m1()
	{
		int [] b={10,20,30,40};

		for(int i:b)
		{
			System.out.print(i+ " ");
		}
		System.out.println();
		m2();
	}


	public static void m2()
	{
		int [] c={97,36,6,83,5};
		System.out.println(Arrays.toString(c));
	}
}