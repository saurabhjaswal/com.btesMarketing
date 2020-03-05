package Mechanical;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTRUE {

	@Test
	public void check()
	{
//Assert True- it will pass True condition if it gets true and pass your test
		//Assert.assertTrue(true);
		
		String name="SaurabhJaswal";
		//my String contains SaurabhJaswal,it will Pass my test else Fail my test.
		//condition Message-yes,we can put condition mess.(contains("saurabh","cond.message").
		Assert.assertTrue(name.contains("SaurabhJaswal"),"Names are matching");
		
		
	}
	@Test
	public void check1()
	{
		//it will pass false condition if it gets false and it will fail your test.
		//Assert.assertTrue(false);
		String name="SaurabhJaswal";
		//condition Message-yes,we can put condition mess.(contains("saurabh","cond.message").
		Assert.assertTrue(name.contains("Anku"),"Names are not matching");
	
		
	}
	
}
