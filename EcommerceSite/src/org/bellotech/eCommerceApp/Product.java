package org.bellotech.eCommerceApp;

public class Product {
    private int productID;
    private Category category;
    private String productName;
    private String description;
    private double amount;
    private int quantityInStock;

    public Product(int productID, String productName, String description, double amount, int quantityInStock) {
        this.productID = productID;
        this.productName = productName;
        this.description = description;
        this.amount = amount;
        this.quantityInStock = quantityInStock;
    }

    public Product(String string, int i, Category category1) {
		// TODO Auto-generated constructor stub
	}

	public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public String getProductDetails() {
        return "Product ID: " + productID + "\nProduct Name: " + productName + "\nDescription: " + description + "\nAmount: " + amount + "\nQuantity In Stock: " + quantityInStock;
    }

    public void updateProductDetails(String productName, String description, double amount, int quantityInStock) {
        this.productName = productName;
        this.description = description;
        this.amount = amount;
        this.quantityInStock = quantityInStock;
    }

    public Category getCategory() {
        return category;
    
	}
}