import java.io.*;
import java.util.*;
class Arithmetic{
	public static void main(String[] args)
	{
		System.out.println("Enter two number");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Addition       :"+(a+b));
		System.out.println("Subtraction    :"+(a-b));
		System.out.println("Multiplication :"+(a*b));
		System.out.println("Division       :"+(a/b));
		System.out.println("Modulus        :"+(a%b));
    }
}	
              
/*       Output
D:\program files\Notepad++\Kyyba Java Programs>java Arithmetic
Enter two number
3 4
Addition       :7
Subtraction    :-1
Multiplication :12
Division       :0
Modulus        :3
*/