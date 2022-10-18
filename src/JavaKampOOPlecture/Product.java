package JavaKampOOPlecture;

public class Product {
   private String name;
    double unitPrice;
    double discount;
    String imageUrl;
    int unitsInStock;

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getDiscount() {
        return discount;
    }
    public void setDiscount(double discount){
        this.discount=discount;
    }
    public String getImageUrl(){
        return imageUrl;
    }
    public void setImageUrl(String imageUrl){
        this.imageUrl=imageUrl;
    }
}
