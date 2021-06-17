package kg.megacom.couriersTest.models;

public class Couriers_statuses {
    private int id;
    private String status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Couriers_statuses() {
    }

    public Couriers_statuses(int id, String status) {
        this.id = id;
        this.status = status;
    }
}
