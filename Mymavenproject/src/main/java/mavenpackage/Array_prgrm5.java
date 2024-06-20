package mavenpackage;
// sum of even and odd numbers
public class Array_prgrm5 {

	public static void main(String[] args) 
	{
	int evensum=0;
	int oddsum=0;
	
	int a[]= {1,2,3,4,5,6,7,8,9,10};
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
			evensum=evensum+a[i];
			}
		else
		{
			oddsum=oddsum+a[i];
			
		}
		}
		System.out.println("sum of even nums is "+evensum);
		System.out.println("sum of odd nums is "+oddsum);
		
	}
	}

}
