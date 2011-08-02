import junit.framework.TestCase;


public class DollarTest extends TestCase {
	public void testMulitplication() {
		Dollar five = new Dollar(5);
		assertEquals(new Dollar(10), five.times(2));
		assertEquals(new Dollar(15), five.times(3));
	}
	
	public void testEquality() {
		assertTrue(new Dollar(5).
				equals(new Dollar(5)));
		assertFalse(new Dollar(5).
				equals(new Dollar(6)));
		assertTrue(new Franc(5).equals(new Franc(5)));
		assertFalse(new Franc(5).equals(new Franc(6)));	
	}

// 6èÕéûì_Ç≈ÇÕà»â∫ÇÕí ÇÁÇ»Ç¢
//	public void testEqualityBetweenDollarAndFranc() {
//		assertFalse(new Dollar(5).equals(new Franc(5)));
//	}

	public void testFrancMultiplication() {
		Franc five = new Franc(5);
		assertEquals(new Franc(10), five.times(2));
		assertEquals(new Franc(15), five.times(3));		
	}

}
