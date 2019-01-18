package shoppingcart;
import java.util.Scanner;

public class ShoppingCartApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		for (int a = 1; a > 0; a ++) {
			System.out.println("Please enter the item name");
			String itemName = input.nextLine();
			input.hasNextLine();
			System.out.println("Please enter the item price");
			int itemPrice = input.nextInt();
			input.hasNextLine(); //It skips lines on the second time through the loop but adding this corrected
			System.out.println("Please enter the item quantity");
			int quantity = input.nextInt();
			Cart items = new Cart();
			items.addOrder(new ItemOrder(itemName, itemPrice, quantity));
			System.out.println("Current Cart:");
			items.showOrder();
			int price = items.getPrice();
			System.out.println("Total Price:" + price);
		}
	}

}
