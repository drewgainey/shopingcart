package shoppingcart;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CartTest {

	@Test
	public void shouldReturnTotalPriceAsOne() {
		Cart underTest = new Cart();
		underTest.addOrder(new ItemOrder("",1,1));
		int check = underTest.getPrice();
		assertEquals(1,check); 
	}
	@Test
	public void shouldReturnTotalPriceAsTwo() {
		Cart underTest = new Cart();
		underTest.addOrder(new ItemOrder("",1,1));
		underTest.addOrder(new ItemOrder("",1,1));
		int check = underTest.getPrice();
		assertEquals(2,check); 
	}
	@Test
	public void shouldReturnTotalPriceAsOneAfterRemoval() {
		Cart underTest = new Cart();
		underTest.addOrder(new ItemOrder("Shoes",1,1));
		underTest.addOrder(new ItemOrder("Shirts",1,1));
		underTest.removeOrder("Shoes");
		int check = underTest.getPrice();
		assertEquals(1,check);
	}
}
