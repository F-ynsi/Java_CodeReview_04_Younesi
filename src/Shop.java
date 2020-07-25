import java.util.ArrayList;

public class Shop {
    private static int counter = 0;
    private String name;
    private String address;
    private ArrayList<Product> products = new ArrayList<>();

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

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void addProduct (Product x) {
        products.add(x);

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
