import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BillTest {
	Pizza a,c;
	Bill b;
	@Before
	public void setUp() throws Exception {
	a= new Pizza("Mushrooms",240);
	c=new Pizza("Onions",500);
	b= new Bill(a,2);
	b.billgeneration();
	}

	@Test
	public void testBill() {
		//fail("Not yet implemented");
		assertEquals(b.quantity,2);
		assertEquals(a,b.pizza);
	}

	@Test
	public void testBillgeneration() {
	//	fail("Not yet implemented");
		assertEquals(b.tprice,960);
	}

}
