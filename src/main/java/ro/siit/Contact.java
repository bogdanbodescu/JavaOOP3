package ro.siit;

public class Contact {
    private int order;
    private String firstName, lastName;
    private String phoneNumber, id;

    public Contact(String id, String firstName, String lastName, String phoneNumber)
    {
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.phoneNumber=phoneNumber;
    }

    @Override
    public String toString(){
        return this.id+"." + this.firstName + " " + this.lastName +" : " + this.phoneNumber + "\n";
    }
}
