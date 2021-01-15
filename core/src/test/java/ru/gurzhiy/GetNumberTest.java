package ru.gurzhiy;

 import org.junit.Test;
 import static org.junit.Assert.assertEquals;

public class GetNumberTest {
	
	private GetNumber instance = new GetNumber();
	
	@Test
	public void testGetNumber(){
		assertEquals(10000, instance.getNumber());
	}
    
}
