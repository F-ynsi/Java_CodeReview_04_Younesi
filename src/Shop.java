import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

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

    public void addProduct (Product x) throws StockLimitReachedException {

        if (products.contains(x)) {
            for (Product p: products) {
                if (x.getProductId() == p.getProductId()) {
                    int myQuantity = p.getProductQuantity();
                    int myXQuantity = x.getProductQuantity();

                    if (myQuantity + myXQuantity <= 15) {
                        p.setProductQuantity(myQuantity + myXQuantity);

                    } else {
                        throw new StockLimitReachedException("You cannot add more than 15!");
                    }
                }

            }

        } else {
            products.add(x);
        }



    }



    public void sellProduct (Product x, User y) {

        for (Product p: products) {
            if (x.getProductId() == p.getProductId()) {
                p.setProductQuantity(p.getProductQuantity()-1);
                purchaseHistory.put(y,p);


            }
        }
    }

    //it will give low stock product

    public void showLimitedProduct () {
        System.out.println("Name \t\t\t\tQuantity");
        System.out.println("*".repeat(28));

        for (Product p: products) {
            if (p.getProductQuantity() < 5) {
                System.out.printf("%-20s %d %n", p.getProductName() , p.getProductQuantity());
            }
        }
        System.out.println("*".repeat(28));

    }

    //Menu method
    public void showMenu () {
        System.out.println("          -------------------------");
        System.out.println("+---------------------------------------------+");
        System.out.println("|                                             |");
        System.out.println("|                  Welcome                    |");
        System.out.println("|                  to the                     |");
        System.out.println("|                   Shop                      |");
        System.out.println("|                                             |");
        System.out.println("+---------------------------------------------+");
        System.out.println("           ------------------------");



        Scanner myScan = new Scanner(System.in);
        System.out.println("1) Make a Selection:");
        System.out.println("2) Display all products of category x.");
        System.out.println("3) Display all products where stock < 5.");
        System.out.println("4) Display all products out of stock");
        System.out.println("0) Exit");
        System.out.println("Enter your choice: ");

        int menuScan = myScan.nextInt();

        switch(menuScan){
            case 1:
                System.out.println(products);
                break;
            case 2:
                for (Product p : products) {
                    if (p.getProductCategory() == Category.T_SHIRT) {
                        System.out.println(p);
                    }
                }
                break;
            case 3:
                this.showLimitedProduct();
                break;
            case 4:
                for (Product p : products) {
                    if (p.getProductQuantity() == 0) {
                        System.out.println(p);
                    }
                }
                break;
            case 0:
                break;
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
