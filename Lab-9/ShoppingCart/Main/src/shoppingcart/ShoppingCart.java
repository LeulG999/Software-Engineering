package shoppingcart;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import products.Product;

public class ShoppingCart {

	private List<CartLine> cartLines = new ArrayList<>();

	public void addProduct(Product product) {
		for (CartLine cartLine : cartLines) {
			if (cartLine.getProduct().getProductNumber().equals(product.getProductNumber())) {
				cartLine.setQuantity(cartLine.getQuantity() + 1);
				return;
			}
		}

		CartLine cartLine = new CartLine();
		cartLine.setProduct(product);
		cartLine.setQuantity(1);
		cartLines.add(cartLine);
	}

	public void removeProduct(Product product) {
		Iterator<CartLine> iterator = cartLines.iterator();

		while (iterator.hasNext()) {
			CartLine cartLine = iterator.next();

			if (cartLine.getProduct().getProductNumber().equals(product.getProductNumber())) {
				if (cartLine.getQuantity() > 1) {
					cartLine.setQuantity(cartLine.getQuantity() - 1);
				} else {
					iterator.remove();
				}
				return;
			}
		}
	}

	public void printCart() {
		System.out.println("Content of the shopping cart:");

		for (CartLine cartLine : cartLines) {
			Product product = cartLine.getProduct();

			System.out.println(cartLine.getQuantity() + " "
					+ product.getProductNumber() + " "
					+ product.getDescription() + " "
					+ product.getPrice());
		}

		System.out.println("Total price = " + getTotalPrice());
	}

	public double getTotalPrice() {
		double totalPrice = 0.0;

		for (CartLine cartLine : cartLines) {
			totalPrice += cartLine.getProduct().getPrice() * cartLine.getQuantity();
		}

		return totalPrice;
	}
}