package mavenpackage;
/*Create 4 methods in a class.
1. Print the name , age and salary using static method
2. Get the string and integer value from the main method and print it on the
method.
3. Get 2 integer values from main method, subtract it and print the value in the
main method.
4. Find the sum of two integer numbers as default and print it on the main metho*/
public class Method_instance_para_prgm10 
{
	static int a=10,b=15;

public void employee()
{
	String name ="ashik";
	int age = 25;
	float sallery = 15000;
	System.out.println("NAME IS : "+name);
	System.out.println("AGE IS : "+age);
	System.out.println("SALLERY IS : "+sallery);
}
public void strint(String a,int b)
{
	System.out.println("String is :" +a);
	System.out.println("Integer is :" +b);
}
public int sub(int a,int b)
{
	int c=a-b;
	return c;
}
public int sum()
{
	int c=a+b;
	return c;
}

public static void main(String[] args) 
{
	Method_instance_para_prgm10 obj=new Method_instance_para_prgm10();
    obj.employee();
    obj.strint("ashik", 25);
   System.out.println( "sub : " +obj.sub(25, 20));
   System.out.println( "sum : " +obj.sum());
	}

}
