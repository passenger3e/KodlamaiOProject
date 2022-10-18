package JavaKamp2Odev.ClassesWithAttributes;

public class Main {
    public static void main(String[] args) {
    Product product=new Product();
    product.id=1;
    product.name="Laptop";
    product.description="Asus Laptop";
    product.stockAmount=5;
    ProductManager productManager=new ProductManager();
    productManager.Add(product);
    }
}
