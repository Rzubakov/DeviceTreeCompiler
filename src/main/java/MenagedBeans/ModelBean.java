package MenagedBeans;

import controller.Controller;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "model")
@SessionScoped
public class ModelBean implements Serializable {

    private List<Controller> controllers = new ArrayList<>();

    public ModelBean() {
    }

    @PostConstruct
    public void constr() {
        System.out.println("@PostConstruct model");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("@PreDestroy model");
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

}
