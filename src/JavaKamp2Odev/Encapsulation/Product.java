package JavaKamp2Odev.Encapsulation;

public class Product {
    private int _id;
    private String _name;
    private double _price;
    private String _code;

    //getter setter
    public int getId(){

        return _id;
    }
    public void setId(int id){
        this._id=id;
    }
    public String getName(){

        return _name;
    }
    public void setName(String name){
        this._name=name;
    }
    public double getPrice(){
        return _price;
    }
    public void setPrice(double price){
        this._price=price;
    }
    public String getCode(){
        return this._name.substring(0,2)+_id;
    }
}
