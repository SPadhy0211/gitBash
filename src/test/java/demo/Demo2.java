package demo;

import org.testng.annotations.Test;

public class Demo2 {

	    @Test
	    public void demo2()
	    {
		System.out.println("add to github");
		System.out.println("---hello---");
	    }
	    
	    @Test(groups = "smoke")
	    public void sample2()
	    {
	    	System.out.println("sample2 added");
	    }

}
