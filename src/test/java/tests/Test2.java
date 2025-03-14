package tests;

import org.testng.annotations.Test;

public class Test2 {
	@Test(priority = -4)
	
	public void test1()
	{
		System.out.println("I am test -4");
		
	}
@Test(priority = -1)
	
	public void test2()
	{
		System.out.println("I am test -1");
		
	}
@Test(priority = 0)

public void test3()
{
	System.out.println("I am test 0");
	
}
@Test(priority = 5)

public void test4()
{
	System.out.println("I am test 5");
	
}


}
