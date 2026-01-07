class even1
{
	public static void main(String[] args) 
	{
		int [] a={1,2,3,4,5,6,7,8,9};
		System.out.print("Even no are: ");
		for (int i=0;i<a.length ;i++ ) 
		{
			if (a[i]%2==0) 
			{
				System.out.print( a[i] + " ");	
			}
		}
	}
}