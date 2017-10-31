package mBeans;

import ejb.MailInt;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "requestBean")
@SessionScoped
public class RequestBean implements Serializable {

    private static final long serialVersionUID = 7840676564059844198L;

    @EJB
    private MailInt mailService;
    private String email;
    private String firstname;
    private String lastname;

    public RequestBean() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void sendRequest() {
        mailService.send("rzubakov@tecon.ru", "RequestRegistration", "Запрос от пользователя:\n" + email + "\n" + firstname + "\n" + lastname + "\n");
    }
}
