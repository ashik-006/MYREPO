package mavenpackage;
import java.util.Scanner;
public class Scanner_prgm4 {

	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("what is your name");
		String a=obj.nextLine();
		System.out.println("what is your age");
		int b=obj.nextInt();
		System.out.println("Gender");
		char c=obj.next().charAt(0);
		System.out.println("height");
		float d=obj.nextFloat();
		System.out.println("name "+a);
		System.out.println("age "+b);
		System.out.println("gender "+c);
		System.out.println("height "+d);
	}

}
