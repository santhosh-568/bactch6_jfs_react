import static org.junit.Assert.*;

import org.junit.Test;

public class testcalculator {
	
	Calculator c=new Calculator();
	@Test
	public void testadd() {
		
		assertEquals(5,c.add(2,3));
	}

}
