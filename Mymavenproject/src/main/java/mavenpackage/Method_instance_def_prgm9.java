package mavenpackage;
/*Create 2 method in a class and get the 2 float values from main method and print
the sum values into the method. Get the 3 integer values from the main method and
print the result of multiplication into the other method*/

public class Method_instance_def_prgm9 
{
	public void add(float a=10,float b=20)
	{
		float c=a+b;
		System.out.println("sum is "+c);
	}
	public void multi(int c= 5;int d=5;int e=5)
	{
		int mul=c*d*e;
		System.out.println("multiplication is "+mul);
	}
	/*public void student1(String name,int b, String school)
	{
		System.out.println("name is "+name);
		System.out.println("age is "+b);
		System.out.println("school "+school);
	}
	public void student2(String name,int b, String school)
	{
		System.out.println("name is "+name);
		System.out.println("age is "+b);
		System.out.println("school "+school);
	}*/
	public static void main(String[] args) 
	{
		Method_instance_def_prgm9 obj=new Method_instance_def_prgm9();
		obj.add();
		obj.multi();
		//obj.student1("ASHIK", 25, "PVSHS");
		//obj.student2("AMAL", 26, "PVSHS");

	}

}
