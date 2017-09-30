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

    private static final long serialVersionUID = 4325384860998301404L;

    @ManagedProperty("#{model}")
    private ModelBean model;

    public СontrollersBean() {

    }

    public List<Controller> getControllers() {
        return model.getControllers();
    }

    public void addController(String type) {
        model.addController(ControllerFactory.getControllerByType(type));
    }

    public void deleteController(Controller controller) {
        model.deleteController(controller);
    }

    public ModelBean getModel() {
        return model;
    }

    public void setModel(ModelBean model) {
        this.model = model;
    }

}
