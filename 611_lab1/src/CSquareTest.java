import org.junit.Test;

import junit.framework.Assert;

public class CSquareTest {
	@Test
	public void testToString() {
		String[] result = new String[3];
		result[0] = "this is a square with area 1.0";
		result[1] = "this is a square with area 4.0";
		result[2] = "this is a square with area 4.6116860141324206E18";
		Assert.assertEquals(new CSquare(0).toString(), result[0]);
		Assert.assertEquals(new CSquare(1).toString(), result[0]);
		Assert.assertEquals(new CSquare(-1).toString(), result[0]);
		Assert.assertEquals(new CSquare(-2147483648).toString(), result[0]);
		Assert.assertEquals(new CSquare(2).toString(), result[1]);
		Assert.assertEquals(new CSquare(2147483647).toString(), result[2]);
	}
}
