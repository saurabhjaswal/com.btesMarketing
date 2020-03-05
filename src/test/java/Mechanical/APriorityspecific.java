package Mechanical;

import org.testng.annotations.Test;

public class APriorityspecific {
@Test (priority=2,description="this test check specific order12")
public void checkalpha1()
{
	System.out.println("sec");
}
@Test (priority=4,description="this test check specific order ok")
public void sayalpha2()
{
	System.out.println("its ok");
}
@Test (priority=3,description="this test check specific order 3")
public void alpha3()
{
	System.out.println("first");
}
@Test (priority=1,description="this test check specific order")
public void hialpha4()
{
	System.out.println("its ok");
}
}


