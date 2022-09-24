public class Main {
    public static void main(String[] args) {

        // Bu kısımda kullandığımızda parametresiz Constructor çalışmış olacak.
//        Product product = new Product();
//        product.setName("Laptop");
//        product.setId(1);
//        product.setDescription("Asus Laptop");
//        product.setPrice(5000);
//        product.setStockAmount(5);

        Product product = new Product(1, "Laptop", "Asus Laptop", 5000, 5);

        ProductManager productManager = new ProductManager();
        productManager.Add(product);

        System.out.println(product.getKod());
    }
}