public class ProductManager {
    public void Add(Product product) {
        //JDBC kodları ile DB ye eklemeye yapacağız.
        System.out.println("Ürün Başarılı bir şekilde Eklendi.=>" + product.name);
    }

    public void Remove(int id) {
        //JDBC kodları ile DB ye Silme yapacağız.
        System.out.println("Ürün Başarılı bir şekilde Silindi.");
    }

    public void Update(Product product) {
        //JDBC kodları ile DB ye Güncelleme yapacağız.
        System.out.println("Ürün Başarılı bir şekilde Güncellendi. =>" + product.name);
    }

}
