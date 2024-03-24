package ExceptionDemo1;
import java.lang.*;
public class pipeDemo {
public Static void main(String[] args)
{
	try
	{
		int a[]=new int[10];
		a[10]=10/0;
	}
	catch(ArthemeticException|ArrayIndexOutOfBounds Exception aie)
	{
		Throwable aie;
		((Throwable) aie).printStackTrace();
		
	}
}
}
