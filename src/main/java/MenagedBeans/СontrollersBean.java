package MenagedBeans;

import controller.ControllerFactory;
import controller.ControllerInt;
import java.io.Serializable;
import java.util.List;
import java.util.UUID;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import project.EmptyProject;
import project.ProjectInt;

@ManagedBean(name = "controllersBean")
@ViewScoped
public class СontrollersBean implements Serializable {

    private static final long serialVersionUID = 8181446570245892422L;

    @ManagedProperty("#{sessionBean}")
    private SessionBean session;
    private ProjectInt selectedProject;

    public СontrollersBean() {
        selectedProject = new EmptyProject();
    }

    public void addController(String type) {
        ControllerInt controller = ControllerFactory.getControllerByType(type);
        controller.setId(UUID.randomUUID());
        selectedProject.addController(controller);
    }

    public void deleteController(ControllerInt controller) {
        selectedProject.deleteController(controller);
    }

    public SessionBean getSession() {
        return session;
    }

    public void setSession(SessionBean session) {
        this.session = session;
    }

    public List<ProjectInt> getProjects() {
        return session.getProjects();
    }

    public List<ControllerInt> getControllers() {
        return selectedProject.getControllers();
    }

    public ProjectInt getSelectedProject() {
        return selectedProject;
    }

    public void setSelectedProject(EmptyProject selectedProject) {
        this.selectedProject = selectedProject;
    }

}
