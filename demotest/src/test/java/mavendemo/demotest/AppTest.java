package mavendemo.demotest;



import org.testng.annotations.Test;
import org.junit.Assert;


public class AppTest {
		@Test
	public void test1() {
		//new CodeCoverage();
		Assert.assertEquals(Main.start(), "start");
		}
		
    @Test
    public void test2() 
    {
    	Assert.assertEquals(Main.stop(),"stop");
    }
}