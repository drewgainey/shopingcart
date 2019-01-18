package shoppingcart;
import java.util.ArrayList;

public class Cart {

	ArrayList<ItemOrder> orders = new ArrayList<ItemOrder>();

	public int getPrice() {
		int price = 0;
		for (ItemOrder order : orders) {
			price += order.getItemPrice();
		}
		return price;
	}

	public void addOrder(ItemOrder itemOrder) {
		orders.add(itemOrder);
	}

	public void showOrder() {
		for (ItemOrder order : orders) {
			System.out.println("Item: " + order.getItemName() + " Price:" + order.getItemPrice() + " Quantity:"
					+ order.getItemQuantity());
		}
	}

	public void removeOrder(String itemName) {
		for (int i = orders.size()-1; i >= 0; i --) {
			if (orders.get(i).getItemName().equals(itemName)) {
				orders.remove(i);
			}
		}
		
	}
}
