package mavenpackage;

public class Static_overloading_prgm12 {
	public static void work()
	{
		int a=5,b=10;
		int mul=a*b;
		System.out.println(mul);
	}
	public static void work(int a,int b,int c )
	{
		int mul=a*b*c;
		System.out.println(mul);
	}
	public static void work(double d,double e)
	{
		double diff=d-e;
		System.out.println(diff);
	}
	public static void main(String[] args)
	{
		Static_overloading_prgm12.work();
		Static_overloading_prgm12.work(2, 4, 6);
		Static_overloading_prgm12.work(2.8, 1.5);

	}

}
