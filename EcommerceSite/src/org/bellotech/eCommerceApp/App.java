package org.bellotech.eCommerceApp;

import java.util.List;
import java.util.Scanner;

import org.bellotech.eCommerceApp.PaymentProcessor.PaymentGateway;

public class App {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 /* 
		 * System.out.print("Enter your credit card number: "); String creditCardNumber
		 * = scanner.nextLine();
		 * 
		 * System.out.print("Enter your shipping address: "); String shippingAddress =
		 * scanner.nextLine();
		 * 
		 * System.out.print("Enter your billing address: "); String billingAddress =
		 * scanner.nextLine();
		 * 
		 * boolean paymentSuccessful =
		 * PaymentProcessor.PaymentGateway.processPayment(creditCardNumber,
		 * shippingAddress, billingAddress);
		 * 
		 * if (paymentSuccessful) { System.out.println("Payment was successful."); }
		 * else { System.out.println("Payment was unsuccessful."); }
		 * 
		 * // Close the scanner scanner.close();
		 */
		/*
		 * // When you run the Main class, you will see the product details before and
		 * after //calling the updateProductDetails() method. Product product = new
		 * Product(1, "Product Name", "Product Description", 100.0, 10);
		 * 
		 * System.out.println(product.getProductDetails());
		 * 
		 * product.updateProductDetails("Updated Product Name",
		 * "Updated Product Description", 200.0, 5);
		 * 
		 * System.out.println(product.getProductDetails());
		 */
	        
		/*
		 * ProductCatalog productCatalog = new ProductCatalog();
		 * 
		 * // Adding categories and products to the catalog
		 * 
		 * Category category1 = new Category(111, "Electronics"); Category category2 =
		 * new Category(222, "Books"); productCatalog.addCategory(category1);
		 * productCatalog.addCategory(category2);
		 * 
		 * Product product1 = new Product("Product1", 100, category1); Product product2
		 * = new Product("Product2", 200, category2);
		 * productCatalog.addProduct(product1); productCatalog.addProduct(product2);
		 * 
		 * // Searching products by name
		 * System.out.println("Enter a product name to search: "); String productName =
		 * scanner.nextLine(); List<Product> foundProducts =
		 * productCatalog.searchByName(productName); if (!foundProducts.isEmpty()) {
		 * System.out.println("Found products: "); for (Product product : foundProducts)
		 * { System.out.println(product); } } else {
		 * System.out.println("No products found with that name."); }
		 * 
		 * // Searching products by category
		 * System.out.println("Enter a category name to search: "); String categoryName
		 * = scanner.nextLine(); List<Product> productsByCategory =
		 * productCatalog.searchProductByCategory(categoryName); if
		 * (!productsByCategory.isEmpty()) {
		 * System.out.println("Products in the selected category: "); for (Product
		 * product : productsByCategory) { System.out.println(product); } } else {
		 * System.out.println("No products found in that category."); }
		 */

	    User user = (String username, int userID)->{
	    	System.out.println(username );
	    	System.out.println(userID);
	    };
	       user.register("mustapha", 1111);
	}
}
