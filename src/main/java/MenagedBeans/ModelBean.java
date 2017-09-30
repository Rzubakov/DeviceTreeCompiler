package MenagedBeans;

import controller.Controller;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "model")
@SessionScoped
public class ModelBean implements Serializable {

    private List<Controller> controllers = new ArrayList<>();

    public ModelBean() {
    }

    public List<Controller> getControllers() {
        return controllers;
    }

    public void setControllers(List<Controller> controllers) {
        this.controllers = controllers;
    }

    public void addController(Controller controller){
        controllers.add(controller);
    }
    
    public void deleteController(Controller controller){
        controllers.remove(controller);
    }   
    

    
}
