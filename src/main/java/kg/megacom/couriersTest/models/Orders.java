package kg.megacom.couriersTest.models;

import java.util.Date;

public class Orders {
    private int id;
    private Couriers courier;
    private Addresses from_address_id;
    private Addresses to_address_id;
    private Order_statuses order_statuse;
    private long ransom_sum;
    private long delivery_price;
    private Admins admin;
    private Date orderDate;
    private String comment;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Couriers getCourier() {
        return courier;
    }

    public void setCourier(Couriers courier) {
        this.courier = courier;
    }

    public Addresses getFrom_address_id() {
        return from_address_id;
    }

    public void setFrom_address_id(Addresses from_address_id) {
        this.from_address_id = from_address_id;
    }

    public Addresses getTo_address_id() {
        return to_address_id;
    }

    public void setTo_address_id(Addresses to_address_id) {
        this.to_address_id = to_address_id;
    }

    public Order_statuses getOrder_statuse() {
        return order_statuse;
    }

    public void setOrder_statuse(Order_statuses order_statuse) {
        this.order_statuse = order_statuse;
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

    public Orders() {
    }

    public Orders(int id, Couriers courier, Addresses from_address_id, Addresses to_address_id, Order_statuses order_statuse, long ransom_sum, long delivery_price, Admins admin, Date orderDate, String comment) {
        this.id = id;
        this.courier = courier;
        this.from_address_id = from_address_id;
        this.to_address_id = to_address_id;
        this.order_statuse = order_statuse;
        this.ransom_sum = ransom_sum;
        this.delivery_price = delivery_price;
        this.admin = admin;
        this.orderDate = orderDate;
        this.comment = comment;
    }
}
