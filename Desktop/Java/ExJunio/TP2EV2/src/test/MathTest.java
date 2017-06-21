import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

public class TestMath {
	Math m;

	@Before
	public void setUp() {
		m = new Math(2, 3);
	}

	@Test
	public void testSimpleAddition() {
		m = new Math(2, 3);
		assertEquals(m.add(), 5); 

	}

	@Test
	public void testPositiveNegativeAddition() {
		m = new Math(3, -4);
		assertEquals(m.add(), -1);  

	}

	@Test
	public void testNegativePositiveAddition() {
		m = new Math(1, -2);
		assertEquals(m.add(), 1); 
	}

	@Test
	public void testNegativeAddition() {
		m = new Math(-4, 6);
		assertEquals(m.add(), 2); 

	}

}