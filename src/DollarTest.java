import junit.framework.TestCase;


public class DollarTest extends TestCase {
	public void testMulitplication() {
		Dollar five = new Dollar(5);
		five.times(2);
		assertEquals(10, five.amount);
	}

}
