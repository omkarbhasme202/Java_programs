
class example1
{
	public static void main(String[] args) 
	{
		int [][] a={{10,20},{30,40},{50,60}};

		for (int i=0;i<a.length ;i++ ) 
		{
			for (int j=0;j<a[i].length ;j++ ) 
				{
					System.out.print(a[i][j] +" ");	
				}	
		}
		System.out.println();
		m1();
	}

	public static void m1()
	{
		int [][] b={{50,59},{30,56},{23,43}};

		for (int [] j:b ) 
		{
			for (int k:j ) 
			{
				System.out.print(k+ " ");		
			}	
		}
		System.out.println();

		
	}

	
}