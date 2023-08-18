package demo;

import org.testng.annotations.Test;

public class Demo {
	    @Test(groups = "Smoke")
	    public void demo()
	    {
		System.out.println("add to repo");
		System.out.println("add to github");	
	    }
	    
	    @Test
	    public void sample()
	    {
	    	System.out.println("sample added");
	    }

}
