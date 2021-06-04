package core;

public class Citizen extends Person {
    private int CIN;
    private Address address;


    public Citizen(int CIN, Person person) {
        this.setFname(person.getFname());
        this.setLname(person.getLname());
        this.setYob(person.getYob());
        this.CIN = CIN;
    }

    public Citizen(String fname, String lname, int yob, int CIN) {
        super(fname, lname, yob);
        this.CIN = CIN;
    }



    public Citizen(int CIN, Address address) {
        this.CIN = CIN;
        this.address = address;
    }

    public void setPerson(Person person){
        this.setFname(person.getFname());
        this.setLname(person.getLname());
        this.setYob(person.getYob());
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
