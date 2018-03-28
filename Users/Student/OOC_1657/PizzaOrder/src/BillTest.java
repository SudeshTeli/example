import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BillTest {
	Pizza a,b,c,d;
	Bill f;
	@Before
	public void setUp() throws Exception {
	a= new Pizza("mushrooms",240);
	b=new Pizza("Pepperoni",500);
	c=new Pizza("Onions",300);
	d=new Pizza("Baccon",550);
	f= new Bill(a,2);
	f.billgeneration();
	}

	@Test
	public void testBill() {
		//fail("Not yet implemented");
		assertEquals(f.quantity,2);
		assertEquals(a,f.pizza);
	}

	@Test
	public void testBillgeneration() {
	//	fail("Not yet implemented");
		assertEquals(f.tprice,960);
	}

}
