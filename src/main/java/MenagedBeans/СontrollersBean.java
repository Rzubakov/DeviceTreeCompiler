package MenagedBeans;

import controller.ControllerInt;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import project.EmptyProject;

@ManagedBean(name = "controllersBean")
@ViewScoped
public class СontrollersBean implements Serializable {

    private static final long serialVersionUID = 8181446570245892422L;

    @ManagedProperty("#{sessionBean}")
    private SessionBean session;
    private EmptyProject selectedProject;

    public СontrollersBean() {
    }

    public SessionBean getSession() {
        return session;
    }

    public void setSession(SessionBean session) {
        this.session = session;
    }

    public List<ControllerInt> getControllers() {
        return selectedProject.getControllers();
    }

    public EmptyProject getSelectedProject() {
        return selectedProject;
    }

    public void setSelectedProject(EmptyProject selectedProject) {
        this.selectedProject = selectedProject;
    }

}
