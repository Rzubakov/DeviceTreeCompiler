package MenagedBeans;

import chanel.Chanel;
import chanel.ChanelFactory;
import controller.Controller;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import module.Module;

@ManagedBean(name = "chanelsBean")
@ViewScoped
public class ChanelsBean implements Serializable {

    @ManagedProperty("#{model}")
    private ModelBean model;

    private Controller selectedController;
    private Module selectedModule;

    public ChanelsBean() {
    }

    public List<Controller> getControllers() {
        return model.getControllers();
    }

    public void addChanel(String type) {
        selectedModule.addChanel(ChanelFactory.getChanelByType(type));
    }

    public void deleteChanel(Chanel chanel) {

    }

    public Controller getSelectedController() {
        return selectedController;
    }

    public void setSelectedController(Controller selectedController) {
        this.selectedController = selectedController;
    }

    public Module getSelectedModule() {
        return selectedModule;
    }

    public void setSelectedModule(Module selectedModule) {
        this.selectedModule = selectedModule;
    }

    public ModelBean getModel() {
        return model;
    }

    public void setModel(ModelBean model) {
        this.model = model;
    }

}
