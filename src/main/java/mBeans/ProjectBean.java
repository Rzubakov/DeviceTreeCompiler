package mBeans;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import project.ProjectFactory;

import project.ProjectInt;

@ManagedBean(name = "projectBean")
@ViewScoped
public class ProjectBean implements Serializable {

    private static final long serialVersionUID = -7337261955538348753L;

    @ManagedProperty("#{sessionBean}")
    private SessionBean session;

    public ProjectBean() {
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

    public void deleteProject(ProjectInt project) {
        session.deleteProject(project);
    }

    public void addProject() {
        ProjectInt project = ProjectFactory.getProject();
        project.setId(UUID.randomUUID());
        session.addProject(project);
    }
}
