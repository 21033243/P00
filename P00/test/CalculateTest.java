import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculateTest {
	
int a,b;
Calculator cal;

@Before
public void setUp() throws Exception {
	a = 4321;
	b = 1234;
	cal = new Calculator();
	}

	@Test
	public void testAdd() {
		int actual = cal.add(a, b); 
		int expected = 5555;
		assertEquals (expected, actual);
		}

	@Test
	public void testSubstract() {
		int actual = cal.substract(a, b); 
		int expected = 3087;
		assertEquals (expected, actual);
		}
	
	@Test
	public void testMultiple() {
		int actual = cal.multiple(a, b);  
		int expected = 5332114;
		assertEquals (expected, actual);
		}
	
	@Test
	public void testDevide() {
		int e = 10;
		int f = 2;
		int actual = cal.devide(e, f); 
		int expected = 5;
		assertEquals (expected, actual);
		}

	@Test
	public void testDevideError() {
		int c = 3;
		int d = 0;
		
		//Act
		try{
		    cal.devide(c, d);
			fail("Expected an IllegalArgumentException to be thrown");
		} catch (IllegalArgumentException e){
		    assertEquals("cannot be devided by zero", e.getMessage());
		} catch (Throwable t) {
			assertEquals ("Expected an IllegalArgumentException to be thrown", t.getMessage());
		}

		}
	
	@After
	public void tearDown() throws Exception {
	}
}
