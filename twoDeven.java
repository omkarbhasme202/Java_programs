import java.util.*;
class twoDeven
{
	public static void main(String[] args) 
	{
		int [][] a={{10,23,42,7}} ;

		for (int i=0;i<a.length ;i++ ) 
		{
			for (int j=0;j<a[i].length ;j++ ) 
			{
				if(a[i][j]%2==0)
				{
					System.out.print(a[i][j]+" ");
				}		
			}	
		}
	}
}