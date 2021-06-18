package kg.megacom.couriersTest.models;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "couriers_status")
@Data
public class Couriers_statuses {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String status;



    public Couriers_statuses(long id, String status) {
        this.id = id;
        this.status = status;
    }

    public Couriers_statuses() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
