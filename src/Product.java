public class Product {

    private static int counter = 1;
    private int productId;
    private String productName;
    private String productDescription;
    private int productPrice;
    private Category productCategory;
    private int productQuantity;



    public Product(String productName, String productDescription,
                   int productPrice, Category productCategory, int productQuantity) {
        this.productName = productName;
        this.productDescription = productDescription;
        this.productPrice = productPrice;
        this.productCategory = productCategory;
        this.productId = counter++;
        this.productQuantity = productQuantity;

    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public Category getProductCategory() {
        return productCategory;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public void setProductCategory(Category productCategory) {
        this.productCategory = productCategory;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + "\'\n" +
                ", productDescription='" + productDescription + "\'\n" +
                ", productPrice=" + productPrice +
                ", productCategory=" + productCategory +
                ", productQuantity=" + productQuantity +
                '}';
    }
}
