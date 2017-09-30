package MenagedBeans;

import controller.Controller;
import controller.ControllerFactory;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "controllersBean")
@SessionScoped
public class СontrollersBean implements Serializable {

    private static final long serialVersionUID = 4325384860998301404L;

    private List<Controller> controllers;

    public СontrollersBean() {

    }

    @PostConstruct
    public void init() {
        controllers = new ArrayList<>();
    }

    /* Controller */
    public void addController(String type) {
        System.out.println("Add controller " + type);
        controllers.add(ControllerFactory.getControllerByType(type));
    }

    public void deleteController(Controller controller) {
        System.out.println("Del controller " + controller.getType() + " " + controller.getName());
        controllers.remove(controller);
    }

    public List<Controller> getControllers() {
        return controllers;
    }

    public void setControllers(List<Controller> controllers) {
        this.controllers = controllers;
    }

}
