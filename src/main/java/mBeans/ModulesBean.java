package mBeans;

import controller.ControllerInt;
import java.io.Serializable;
import java.util.List;
import java.util.UUID;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import module.ModuleFactory;
import module.ModuleInt;
import project.EmptyProject;
import project.ProjectInt;

@ManagedBean(name = "modulesBean")
@ViewScoped
public class ModulesBean implements Serializable {

    private static final long serialVersionUID = -7924916689541286483L;
    private ProjectInt selectedProject;
    private ControllerInt selectedController;
    @ManagedProperty("#{sessionBean}")
    private SessionBean session;

    public ModulesBean() {
        selectedProject = new EmptyProject();
    }

    public void addModule(String type) {
        ModuleInt module = ModuleFactory.getModuleByType(type);
        module.setId(UUID.randomUUID());
        selectedController.addModule(module);
    }

    public void deleteModule(ModuleInt module) {
        selectedController.deleteModule(module);
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

    public List<ControllerInt> getControllers() {
        return selectedProject.getControllers();
    }

    public List<ProjectInt> getProjects() {
        return session.getProjects();
    }
}
