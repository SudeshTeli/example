import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PizzaTest {
	Pizza a,b,c,d;
	@Before
	public void setUp() throws Exception {
		a= new Pizza("mushrooms",240);
		b=new Pizza("Pepperoni",500);
		c=new Pizza("Onions",300);
		d=new Pizza("Baccon",550);
		
	}

	@Test
	public void testGetName() {
		//fail("Not yet implemented");
		assertEquals(a.name,"mushrooms");
	}

	@Test
	public void testGetPrice() {
	//	fail("Not yet implemented");
		assertEquals(b.price,500);
	}

	@Test
	public void testTax() {
		//fail("Not yet implemented");
		//
	}

}
