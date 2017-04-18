package testcases;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

public class UnderstandingAssertions {
	@Rule
	public ErrorCollector errorcollector = new ErrorCollector();

	@Test
	
	public void testFriendlistFacebook (){
		int actual_total_friends = 100;
		int expected_total_friends=101;
		System.out.println("A");
		try{
		Assert.assertEquals(expected_total_friends, actual_total_friends);
		}catch (Throwable t){
			System.out.println("Error Encountered");
			errorcollector.addError(t);
		}
		System.out.println("B");
		
		try{
			Assert.assertEquals("A", "B");
			}catch (Throwable t){
				System.out.println("Error Encountered");
				errorcollector.addError(t);
			}
		try{
			Assert.assertEquals("A", "A");
			}catch (Throwable t){
				System.out.println("Error Encountered");
				errorcollector.addError(t);
			}
	 //Assert.assertTrue("One more error", 2>3); 
	}
	
}
