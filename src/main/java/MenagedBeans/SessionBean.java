package MenagedBeans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import project.ProjectFactory;
import project.ProjectInt;

@ManagedBean(name = "sessionBean")
@SessionScoped
public class SessionBean implements Serializable {

    private static final long serialVersionUID = -2762117385230274461L;

    private List<ProjectInt> projects = new ArrayList<>();

    public SessionBean() {
    }

    public List<ProjectInt> getProjects() {
        return projects;
    }

    public void setProjects(List<ProjectInt> projects) {
        this.projects = projects;
    }

    public void deleteProject(ProjectInt project) {
        projects.remove(project);
    }

    public void addProject() {
        projects.add(ProjectFactory.getProject());
    }

}
