import static org.junit.Assert.fail;

import org.junit.Test;

import junit.framework.Assert;

public class CTriangleTest {

	
	@Test
	public void testToString() {
		String[] result = new String[4];
		result[0] = "this is a triangle with area 0.4330127018922193";
		result[1] = "this is a triangle with area 1.7320508075688772";
		result[2] = "this is a triangle with area 6.0";
		result[3] = "this is a triangle with area 1.99691862125803904E18";
		Assert.assertEquals(new CTriangle(0,0,0).toString(), result[0]);
		Assert.assertEquals(new CTriangle(1,1,1).toString(), result[0]);
		Assert.assertEquals(new CTriangle(-1,-1,-1).toString(), result[0]);
		Assert.assertEquals(new CTriangle(-2147483648,-2147483648,-2147483648).toString(), result[0]);
		Assert.assertEquals(new CTriangle(2,2,8).toString(), result[0]);
		Assert.assertEquals(new CTriangle(2,8,2).toString(), result[0]);
		Assert.assertEquals(new CTriangle(8,2,2).toString(), result[0]);
		Assert.assertEquals(new CTriangle(2,2,2).toString(), result[1]);
		Assert.assertEquals(new CTriangle(2147483647,2147483647,2147483647).toString(), result[3]);
		Assert.assertEquals(new CTriangle(3,4,5).toString(), result[2]);
		Assert.assertEquals(new CTriangle(3,5,4).toString(), result[2]);
		Assert.assertEquals(new CTriangle(4,3,5).toString(), result[2]);
		Assert.assertEquals(new CTriangle(4,5,3).toString(), result[2]);
		Assert.assertEquals(new CTriangle(5,4,3).toString(), result[2]);
		Assert.assertEquals(new CTriangle(5,3,4).toString(), result[2]);	
	}

}
