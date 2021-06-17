package kg.megacom.couriersTest.models;

public class Order_statuses {
    private int id;
    private String name;

    public Order_statuses(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Order_statuses() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
