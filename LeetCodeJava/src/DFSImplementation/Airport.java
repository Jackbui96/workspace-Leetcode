package DFSImplementation;

public class Airport extends Place implements FlyBehavior {

    String address;

    public Airport (String name) {
        super(name);
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public void fly() {
        System.out.print("You can use this place to fly.");
    }
}
