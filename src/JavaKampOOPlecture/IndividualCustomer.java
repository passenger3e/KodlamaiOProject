package JavaKampOOPlecture;

public class IndividualCustomer extends Customer{ //extends the Customer field property.IndividualCustomer is a Customer
    private String firstName;
    private String lastName;
    //setters getters
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
}
