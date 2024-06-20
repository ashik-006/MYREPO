package mavenpackage;

public class Constructor_prgm11 {

	public Constructor_prgm11()
	{
		int a=10,b=15;
		int mul=a*b;
		System.out.println(mul);
	}
	Constructor_prgm11(int a,int b,int c)
	{
		int mul=a*b*c;
		System.out.println(mul);
	}
	Constructor_prgm11(double d,double e)
	{
		double diff=d-e;
		System.out.println(diff);
	}
	public static void main(String[] args) {
		Constructor_prgm11 obj=new Constructor_prgm11();
		Constructor_prgm11 obj1=new Constructor_prgm11(5,7,8);	
		Constructor_prgm11 obj2=new Constructor_prgm11 (6.3,1.2);
	}
}
