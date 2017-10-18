package project;

public class ProjectFactory {

    public static ProjectInt getProject(String type) {
        return new Project();
    }
}
