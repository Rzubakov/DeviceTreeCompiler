package mBeans;

import chanel.ChanelFactory;
import chanel.ChanelInt;
import controller.ControllerInt;
import java.io.Serializable;
import java.util.List;
import java.util.UUID;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import module.ModuleInt;
import project.EmptyProject;
import project.ProjectInt;

@ManagedBean(name = "chanelsBean")
@ViewScoped
public class ChanelsBean implements Serializable {

    private static final long serialVersionUID = -9210668492369492186L;
    private ProjectInt selectedProject;
    private ControllerInt selectedController;
    private ModuleInt selectedModule;

    @ManagedProperty("#{sessionBean}")
    private SessionBean session;

    public ChanelsBean() {
        selectedProject = new EmptyProject();
    }

    public void addChanel(String type) {
        ChanelInt chanel = ChanelFactory.getChanelByType(type);
        chanel.setId(UUID.randomUUID());
        selectedModule.addChanel(chanel);
    }

    public SessionBean getSession() {
        return session;
    }

    public void setSession(SessionBean session) {
        this.session = session;
    }

    public ProjectInt getSelectedProject() {
        return selectedProject;
    }

    public void setSelectedProject(ProjectInt selectedProject) {
        this.selectedProject = selectedProject;
    }

    public ControllerInt getSelectedController() {
        return selectedController;
    }

    public void setSelectedController(ControllerInt selectedController) {
        this.selectedController = selectedController;
    }

    public ModuleInt getSelectedModule() {
        return selectedModule;
    }

    public void setSelectedModule(ModuleInt selectedModule) {
        this.selectedModule = selectedModule;
    }

    public List<ProjectInt> getProjects() {
        return session.getProjects();
    }

    public List<ControllerInt> getControllers() {
        return selectedProject.getControllers();
    }

    public List<ModuleInt> getModules() {
        return selectedController.getModules();
    }
}
