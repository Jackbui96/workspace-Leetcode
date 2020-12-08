package DFSImplementation;

abstract class Place {

    String name;

    Place(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract public void setAddress(String address);
    abstract public String getAddress();
}
