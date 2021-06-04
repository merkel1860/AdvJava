package core;

public class Citizen extends Person {
    private int CIN;
    private Address address;


    public Citizen() {
    }

    public Citizen(int CIN, Address address) {
        this.CIN = CIN;
        this.address = address;
    }

    public int getCIN() {
        return CIN;
    }

    public void setCIN(int CIN) {
        this.CIN = CIN;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Citizen{" +
                "CIN=" + CIN +
                ", Person=" + super.toString() +
                '}';
    }
}
