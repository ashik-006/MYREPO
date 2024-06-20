package mavenpackage;

public class Loops_prgm {

	public static void main(String[] args)
	{
	
int evensum=0;
int oddsum=0;
for(int i=1;i<=10;i++)
{
	if(i%2==0)
	{
		evensum=evensum+i;
	}
	else
	{
		 oddsum=oddsum+i;
	}
}
System.out.println("sum of even num is" +evensum);
System.out.println("sum of odd numbers " +oddsum);
	}

}
