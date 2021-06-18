package kg.megacom.couriersTest.models;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "addresses")
@Data
public class Addresses {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String address;
    private String phone;

    public Addresses(long id, String address, String phone) {
        this.id = id;
        this.address = address;
        this.phone = phone;
    }

    public Addresses() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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
