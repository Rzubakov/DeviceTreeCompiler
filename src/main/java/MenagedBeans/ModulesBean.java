package MenagedBeans;

import controller.Controller;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import module.Module;
import module.ModuleFactory;

@ManagedBean(name = "modulesBean")
@ViewScoped
public class ModulesBean implements Serializable {

    @ManagedProperty("#{model}")
    private ModelBean model;

    private Controller selectedController;

    public ModulesBean() {
    }

    public List<Controller> getControllers() {
        return model.getControllers();
    }

    public void addModule(String type) {
        selectedController.addModule(ModuleFactory.getModuleByType(type));
        for (int i = 0; i < selectedController.getModules().size(); i++) {
            selectedController.getModules().get(i).setId(i);
        }
    }

    public void deleteModule(Module module) {
        selectedController.deleteModule(module);
    }

    public Controller getSelectedController() {
        return selectedController;
    }

    public void setSelectedController(Controller selectedController) {
        this.selectedController = selectedController;
    }

    public ModelBean getModel() {
        return model;
    }

    public void setModel(ModelBean model) {
        this.model = model;
    }


}
