package JavaKampOOPlecture;

public class Main {
    public static void main(String[] args) {
        String message = "hello friend";
        Product product1 = new Product();
        product1.setName("ABC Coffe MAchine");
        product1.setDiscount(7);
        product1.setUnitPrice(1000);
        product1.setImageUrl("image1.jpg");
        Product product2 = new Product();
        product2.setName("EFG Coffe MAchine");
        product2.setDiscount(4);
        product2.setUnitPrice(5000);
        product2.setImageUrl("image2.jpg");
        Product product3 = new Product();
        product3.setName("XYZ Coffe MAchine");
        product3.setDiscount(10);
        product3.setUnitPrice(2000);
        product3.setImageUrl("image2.jpg");

        System.out.println(product1.getName());
         /*
        //Set value for the Product calss
        product1.name = "ABC Coffe Machine";
        product1.unitsInStock = 10;
        product1.discount = 7;
        product1.unitPrice = 1000;
        product1.imageUrl = "www.amazon.com/Cmachine1.jpg";
        //Set value for the Product calss
        product2.name = "Kitchen Coffe Machine";
        product2.unitsInStock = 1;
        product2.discount = 10;
        product2.unitPrice = 1500;
        product2.imageUrl = "www.amazon.com/Cmachine2.jpg";
        //Set value for the Product calss
        product3.name = "AV Coffe Machine";
        product3.unitsInStock = 5;
        product3.discount = 3;
        product3.unitPrice = 1800;
        product3.imageUrl = "www.amazon.com/Cmachine3.jpg";

        //Get value from calss
        System.out.println("name of the product is " + product1.name);
        */
        Product[] products = {product1, product2, product3};
        for (Product product : products) {
            //System.out.println(product.name); //without getter
            System.out.println(product.getName());//with getter
        }

        IndividualCustomer individualCustomer=new IndividualCustomer();
        individualCustomer.setCustomerNumber("12345");
        individualCustomer.setFirstName("Ali");
        individualCustomer.setLastName("VR");
        individualCustomer.setId(8144);
        individualCustomer.setPhone("054555555");
        CorporateCustomer corparateCustomer=new CorporateCustomer();
        corparateCustomer.setCustomerNumber("0001");
        corparateCustomer.setCompanyName("AV Engineering");
        corparateCustomer.setId(1);
        corparateCustomer.setPhone("03220010101");
        Customer[] customers={individualCustomer,corparateCustomer};
    }
}
