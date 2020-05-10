package jUnitTestExamplePackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		jUnitTesting junit = new jUnitTesting();
		String result = junit.addString("Vasu", "Gupta");
		assertEquals ("VasuGupta", result);	
	}

}
