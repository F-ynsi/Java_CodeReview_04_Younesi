import java.util.ArrayList;
import java.util.HashMap;

public class Shop {
    private static int counter = 0;
    private String name;
    private String address;
    private ArrayList<Product> products = new ArrayList<>();
    private HashMap<User,Product> purchaseHistory = new HashMap<>();

    public Shop(String name, String address) {
        this.name = name;
        this.address = address;

    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public HashMap<User, Product> getPurchaseHistory() {
        return purchaseHistory;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void addProduct (Product x) {
        products.add(x);
    }



    public void sellProduct (Product x, User y) {

        for (Product p: products) {
            if (x.getProductId() == p.getProductId()) {
                p.setProductQuantity(p.getProductQuantity()-1);
                purchaseHistory.put(y,p);


            }
        }
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", products=" + products +
                '}';
    }
}
