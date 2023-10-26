package org.bellotech.eCommerceApp;
import java.util.ArrayList;
import java.util.List;

public class Category {
    private int categoryID;
    private String categoryName;
    private List<Product> products;

    public Category(int categoryID, String categoryName) {
        this.categoryID = categoryID;
        this.categoryName = categoryName;
        this.products = new ArrayList<>();
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public List<Product> getCategoryProduct() {
        return products;
    }

    public void addProductToCategory(Product product) {
        this.products.add(product);
    }
}