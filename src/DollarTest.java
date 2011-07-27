import junit.framework.TestCase;


public class DollarTest extends TestCase {
	public void testMulitplication() {
		Dollar five = new Dollar(5);
		Dollar product = five.times(2);
		assertEquals(10, product.amount);
		product = five.times(3);
		assertEquals(15, product.amount);
	}

}
