package kg.megacom.couriersTest.models;

public class Addresses {
    private int id;
    private String address;
    private String phone;

    public Addresses(int id, String address, String phone) {
        this.id = id;
        this.address = address;
        this.phone = phone;
    }

    public Addresses() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
