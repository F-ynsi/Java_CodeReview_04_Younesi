import java.util.HashMap;

public class Main {
    public static void main(String[] args) {


        Product product1 = new Product( "t-Shirt", "the color is red",
                20, Category.T_SHIRT, 16);

        Product product2 = new Product( "TROUSER", "the color is blue",
                30, Category.TROUSER, 6);

        Product product3 = new Product( "SHIRT", "the color is green",
                40, Category.SHIRT,9);

        Product product4 = new Product( "JACKET", "the color is orange",
                50, Category.JACKET,6);

        Product product5 = new Product( "ACCESSORY", "the color is gold",
                60, Category.ACCESSORY,2);

        Product product6 = new Product( "Shirt", "Super cool",
                33, Category.T_SHIRT,4);

        Product product7 = new Product( "Shirt", "cool",
                73, Category.T_SHIRT,0);



        HashMap<Integer, Product> myProducts = new HashMap<>();

        myProducts.put(product2.getProductId(),product2);
        myProducts.put(product3.getProductId(),product3);
        myProducts.put(product4.getProductId(),product4);
        myProducts.put(product5.getProductId(),product5);


        for (Integer i : myProducts.keySet()) {
            System.out.println(myProducts.get(i));
        }


        System.out.println("\n\n\n-----------------My shop before adding products------------------");
        Shop myShop1 = new Shop ("Coriander", "Karsplatz");
        System.out.println(myShop1);
        System.out.println("\n-----------------My shop after adding products------------------");
        try {
            myShop1.addProduct(product3);
            myShop1.addProduct(product2);
            myShop1.addProduct(product5);
            myShop1.addProduct(product6);
            myShop1.addProduct(product7);

        } catch (StockLimitReachedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(myShop1);


        System.out.println("\n\n\n--------------------Users------------------------------");

        User user1 = new User(60,"eva","Younesi", "ff@yahoo", "stephansplats",
                444, 5587537);

        User user2 = new User(70,"fff","ynsi", "ff@yahoo", "stephansplats",
                222, 5587537);

        User user3 = new User(80,"aaa","hill", "ff@yahoo", "stephansplats",
                564, 5587537);

        User user4 = new User(90,"evaaa","power", "ff@yahoo", "stephansplats",
                765, 5587537);

        HashMap<Integer, User> users = new HashMap<>();
        users.put(user1.getId(),user1);
        users.put(user2.getId(),user2);
        users.put(user3.getId(),user3);
        users.put(user4.getId(),user4);

        for (Integer i : users.keySet()) {
            System.out.println(users.get(i));
        }

        System.out.println("\n-----------------------------------------------------------");

        System.out.println("--------------------------Purchase process----------------------------------");
        System.out.println("------------------Shop before purchase--------------------");
        System.out.println(myShop1);
        System.out.println("------------------Shop history before purchase--------------------");
        System.out.println(myShop1.getPurchaseHistory());

        System.out.println("------------------Shop after purchase--------------------");
        myShop1.sellProduct(product3,user2);
        System.out.println(myShop1);
        System.out.println("------------------Shop history after purchase--------------------");
        System.out.println(myShop1.getPurchaseHistory());


        System.out.println("\n\n------------------Low stock test--------------------");

        myShop1.showLimitedProduct();


        System.out.println("\n\n------------------Add max 15 items test - throws StockLimitReachedException--------------------");
        try {
            myShop1.addProduct(product3);
        } catch (StockLimitReachedException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n\n------------------Testing Menu--------------------");
        myShop1.showMenu();






















    }

}
