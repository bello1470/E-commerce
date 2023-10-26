package kgambo.eCommerceApp;
import java.util.ArrayList;
import java.util.List;


public class ProductCatalog {



	    private List<Category> categories;
	    private List<Product> products;

	    public ProductCatalog() {
	        categories = new ArrayList<>();
	        products = new ArrayList<>();
	    }

	    public List<Category> getCategories() {
	        return categories;
	    }

	    public List<Product> getProducts() {
	        return products;
	    }

	    public void addCategory(Category category) {
	        categories.add(category);
	    }

	    public void addProduct(Product product) {
	        products.add(product);
	    }

	    public List<Product> searchByName(String productName) {
	        List<Product> result = new ArrayList<>();
	        for (Product product : products) {
	            if (product.getProductName().equalsIgnoreCase(productName)) {
	                result.add(product);
	            }
	        }
	        return result;
	    }

	    public List<Product> searchProductByCategory(String categoryName) {
	        List<Product> result = new ArrayList<>();
	        for (Product product : products) {
	            if (product.getCategory().getCategoryName().equalsIgnoreCase(categoryName)) {
	                result.add(product);
	            }
	        }
	        return result;
	    }
	
}
