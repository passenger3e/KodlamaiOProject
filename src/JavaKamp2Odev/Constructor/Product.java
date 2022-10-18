package JavaKamp2Odev.Constructor;

public class Product {

    //Constructor
    public Product(int id,String name,double price){ //if you give parameter you should set parameter as well in declaration of object in main class
        System.out.println("Constructor run"); //when you create object with using new, it is like you are calling this constructor
        this._id=id;
        this._name=name;
        this._price=price;
    }
    public Product(){ //Method Overloading.so we could create a cunstructor without parameters.now you can use getters setters individually

    }
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
