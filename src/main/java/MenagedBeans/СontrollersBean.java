package MenagedBeans;

import controller.Controller;
import controller.ControllerFactory;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import org.primefaces.event.CellEditEvent;

@ManagedBean(name = "controllersBean")
@ViewScoped
public class СontrollersBean implements Serializable {

    private static final long serialVersionUID = 8181446570245892422L;

    @ManagedProperty("#{model}")
    private ModelBean model;

    public СontrollersBean() {

    }

    public List<Controller> getControllers() {
        return model.getControllers();
    }

    public void addController(String type) {
        model.addController(ControllerFactory.getControllerByType(type));
        for (int i = 0; i < model.getControllers().size(); i++) {
            model.getControllers().get(i).setId(i);
        }
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

    public void onCellEdit(CellEditEvent event) {
        System.out.println(event.getNewValue());
    }
}
