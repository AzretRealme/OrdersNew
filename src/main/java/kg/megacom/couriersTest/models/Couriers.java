package kg.megacom.couriersTest.models;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "couriers")
@Data
public class Couriers {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String fio;
    private String phone;

    @ManyToOne
    @JoinColumn(name = "courier_status_id")
    private Couriers_statuses couriers_statuses;

    public Couriers(long id, String fio, String phone, Couriers_statuses couriers_statuses) {
        this.id = id;
        this.fio = fio;
        this.phone = phone;
        this.couriers_statuses = couriers_statuses;
    }

    public Couriers() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Couriers_statuses getCouriers_statuses() {
        return couriers_statuses;
    }

    public void setCouriers_statuses(Couriers_statuses couriers_statuses) {
        this.couriers_statuses = couriers_statuses;
    }
}
