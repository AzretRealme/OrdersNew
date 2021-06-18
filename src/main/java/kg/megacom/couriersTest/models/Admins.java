package kg.megacom.couriersTest.models;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "admins")
@Data
public class Admins {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String login;
    private String password;
    private String fio;

    public Admins() {
    }

    public Admins(long id, String login, String password, String fio) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.fio = fio;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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
