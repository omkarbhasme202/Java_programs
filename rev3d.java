class rev3d
{
	public static void main(String[] args) 
	{
		int [][] a={{10,20},{30,40}};

		for(int i=a.length-1;i>=0;i--)
		{
			for (int j=a[i].length-1;j>=0 ;j-- ) 
			{
				System.out.print(a[i][j]+ " ");	
			}
		}
	}
}