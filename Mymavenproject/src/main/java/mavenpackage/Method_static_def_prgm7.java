package mavenpackage;

public class Method_static_def_prgm7 {
	
	static int a=10;
	static int b=20;
	public static void sum()
	{
		int sum = a+b;
		System.out.println("SUM IS "+sum);
	}
	public static void multi()
	{
		int mul=a*b;
		System.out.println("MUL IS "+mul);
	}
	public static void main(String[] args) 
	{
		Method_static_def_prgm7.sum();
		Method_static_def_prgm7.multi();
	}

}
