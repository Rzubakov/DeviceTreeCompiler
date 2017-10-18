package MenagedBeans;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "projectBean")
@ViewScoped
public class ProjectBean implements Serializable {

    private static final long serialVersionUID = -7337261955538348753L;
    
    @ManagedProperty("#{session}")
    private SessionBean session;

    public ProjectBean() {
    }

    public SessionBean getSession() {
        return session;
    }

    public void setSession(SessionBean session) {
        this.session = session;
    }

}
