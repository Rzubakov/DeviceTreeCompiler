package MenagedBeans;

import controller.Controller;
import controller.ControllerFactory;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "controllersBean")
@ViewScoped
public class СontrollersBean implements Serializable {

    private static final long serialVersionUID = 8181446570245892422L;

    @ManagedProperty("#{session}")
    private SessionBean session;

    public СontrollersBean() {

    }

    public List<Controller> getControllers() {
        return session.getControllers();
    }

    public void addController(String type) {
        session.addController(ControllerFactory.getControllerByType(type));
        for (int i = 0; i < session.getControllers().size(); i++) {
            session.getControllers().get(i).setId(i);
        }
    }

    public void deleteController(Controller controller) {
        session.deleteController(controller);
    }

    public SessionBean getModel() {
        return session;
    }

    public void setModel(SessionBean session) {
        this.session = session;
    }

}
