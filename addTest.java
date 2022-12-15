import static org.junit.Assert.*;

import org.junit.Test;

public class addTest {

	@Test
	public void addtest1() {
		assertEquals(5, Class_Calculator.add(4,1));
	}
	
	@Test
	public void addtest2() {
		assertEquals(10, Class_Calculator.add(5,5));
		
	}
	
	@Test 
	//the maximum value that can be represented by an int data type in Java. ( 2147483647) 
	public void addTest3() {
		assertEquals(2147483647,Class_Calculator.add(6, 6));
	}

}
