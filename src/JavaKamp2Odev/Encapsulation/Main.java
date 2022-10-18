package JavaKamp2Odev.Encapsulation;
/*
Encapsulation,SEtter and Getter Topics are observed/ studied
 */
public class Main {
    public static void main(String[] args) {
        Product product=new Product();
      //  product.id=1;
      //  product.price=1000;
       // product.name="Laptop";
        product.setId(1);
        product.getId();
        product.setName("Phone");
        product.getName();
        product.setPrice(1200);
        product.getPrice();
        ProductManager productManager=new ProductManager();
        productManager.Add2(2,"Glasses",1500);//you can't add another parameter in pruduct manager if you do you should change this method ass well while passing data.Instructor didn't give more information about what we do if we want to add more parameter
        System.out.println("Product special code is: "+product.getCode());
    }
}
