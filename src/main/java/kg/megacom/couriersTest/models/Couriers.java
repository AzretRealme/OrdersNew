package kg.megacom.couriersTest.models;

public class Couriers {
    private int id;
    private String fio;
    private String phone;
    private Couriers_statuses couriers_statuses;

    public Couriers(int id, String fio, String phone, Couriers_statuses couriers_statuses) {
        this.id = id;
        this.fio = fio;
        this.phone = phone;
        this.couriers_statuses = couriers_statuses;
    }

    public Couriers() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
