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

    private static final long serialVersionUID = -9210668492369492186L;

    @ManagedProperty("#{session}")
    private SessionBean session;
    private Controller selectedController;
    private Module selectedModule;

    public ChanelsBean() {
    }

    public List<Controller> getControllers() {
        return session.getControllers();
    }

    public void addChanel(String type) {
        selectedModule.addChanel(ChanelFactory.getChanelByType(type));
        for (int i = 0; i < selectedModule.getChanels().size(); i++) {
            selectedModule.getChanels().get(i).setId(i);
        }
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
        System.out.println(selectedModule.getId());
        this.selectedModule = selectedModule;
    }

    public SessionBean getModel() {
        return session;
    }

    public void setModel(SessionBean session) {
        this.session = session;
    }

    public void resetModule() {
        selectedModule = null;
    }
}
