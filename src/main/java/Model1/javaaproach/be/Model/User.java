package Model1.javaaproach.be.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "User")

public class user {

    @Id
    private String login;

    private String passwordHash;

    private Boolean isActive;

    @OneToOne
    private Person person;

    public String getLogin() {
        return login;
    }

    public user setLogin(String login) {
        this.login = login;
        return this;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public user setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
        return this;
    }

    public Boolean getActive() {
        return isActive;
    }

    public user setActive(Boolean active) {
        isActive = active;
        return this;
    }

    public Person getPerson() {
        return person;
    }

    public user setPerson(Person person) {
        this.person = person;
        return this;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", passwordHash='" + passwordHash + '\'' +
                ", isActive=" + isActive +
                ", person=" + person +
                '}';
    }
}

