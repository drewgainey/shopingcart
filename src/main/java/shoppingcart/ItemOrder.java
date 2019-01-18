package shoppingcart;

public class ItemOrder {

	private int itemPrice;
	private String itemName;
	private int quantity;

	public ItemOrder(String itemName, int itemPrice, int quantity) {
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.quantity = quantity;
	}

	public int getItemPrice() {
		return itemPrice;
	}
	public String getItemName() {
		return itemName;
	}
	public int getItemQuantity() {
		return quantity;
	}

}
