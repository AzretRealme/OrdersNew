package kg.megacom.couriersTest.models;

public class Admins {
    private int id;
    private String login;
    private String password;
    private String fio;

    public Admins() {
    }

    public Admins(int id, String login, String password, String fio) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.fio = fio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }
}
