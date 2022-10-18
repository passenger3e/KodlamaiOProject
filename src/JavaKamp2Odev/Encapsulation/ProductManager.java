package JavaKamp2Odev.Encapsulation;

public class ProductManager {
    public void Add(Product product){
        //System.out.println("Product is Added: "+product.name); // now name is private so can't be accessed anymore
    }
    public void Add2(int id,String name, double price){ // this declaration is wrong eg. if you want to add another parameter you have to edit all calling method codes too.

    } //Instructor didn't give more information about what we do if we want to add more parameter

}
