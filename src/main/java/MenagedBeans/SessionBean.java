package MenagedBeans;

import controller.Controller;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "session")
@SessionScoped
public class SessionBean implements Serializable {

    private static final long serialVersionUID = -2762117385230274461L;

    private List<Controller> controllers = new ArrayList<>();

    public SessionBean() {
    }

    public List<Controller> getControllers() {
        return controllers;
    }

    public void setControllers(List<Controller> controllers) {
        this.controllers = controllers;
    }

    public void addController(Controller controller) {
        controllers.add(controller);
    }

    public void deleteController(Controller controller) {
        controllers.remove(controller);
    }

    public Boolean isEmptyControllers() {
        return controllers.isEmpty();
    }

    public Boolean isEmptyModules() {
        int count = 0;
        for (Controller c : controllers) {
            count = +c.getModules().size();
        }
        return count == 0;
    }
}
