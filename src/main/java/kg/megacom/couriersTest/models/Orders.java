package kg.megacom.couriersTest.models;

import java.util.Date;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import javax.persistence.*;

@Entity
@Table(name = "orders")
@Data
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "courier_id", nullable = false)
    private Couriers courier;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "from_address_id", nullable = false)
    private Addresses from_address;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "to_address_id", nullable = false)
    private Addresses to_address;

    @ManyToOne
    @JoinColumn(name = "order_status_id")
    private Order_statuses order_statuses;
    private long ransom_sum;
    private long delivery_price;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "admin_id", nullable = false)
    private Admins admin;
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "order_date")
    private Date orderDate;
    private String comment;

    public Orders(long id, Couriers courier, Addresses from_address, Addresses to_address, Order_statuses order_statuses, long ransom_sum, long delivery_price, Admins admin, Date orderDate, String comment) {
        this.id = id;
        this.courier = courier;
        this.from_address = from_address;
        this.to_address = to_address;
        this.order_statuses = order_statuses;
        this.ransom_sum = ransom_sum;
        this.delivery_price = delivery_price;
        this.admin = admin;
        this.orderDate = orderDate;
        this.comment = comment;
    }

    public Orders() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Couriers getCourier() {
        return courier;
    }

    public void setCourier(Couriers courier) {
        this.courier = courier;
    }

    public Addresses getFrom_address() {
        return from_address;
    }

    public void setFrom_address(Addresses from_address) {
        this.from_address = from_address;
    }

    public Addresses getTo_address() {
        return to_address;
    }

    public void setTo_address(Addresses to_address) {
        this.to_address = to_address;
    }

    public Order_statuses getOrder_statuses() {
        return order_statuses;
    }

    public void setOrder_statuses(Order_statuses order_statuses) {
        this.order_statuses = order_statuses;
    }

    public long getRansom_sum() {
        return ransom_sum;
    }

    public void setRansom_sum(long ransom_sum) {
        this.ransom_sum = ransom_sum;
    }

    public long getDelivery_price() {
        return delivery_price;
    }

    public void setDelivery_price(long delivery_price) {
        this.delivery_price = delivery_price;
    }

    public Admins getAdmin() {
        return admin;
    }

    public void setAdmin(Admins admin) {
        this.admin = admin;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
