package kg.megacom.couriersTest.models;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orders_status")
@Data
public class Order_statuses {
    @Id
    private long id;

    private String name;

    public Order_statuses(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Order_statuses() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
