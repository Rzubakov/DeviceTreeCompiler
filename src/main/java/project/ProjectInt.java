package project;

import controller.Controller;
import java.util.List;

public interface ProjectInt {

    public Integer getId();

    public void setId(Integer id);

    public String getName();

    public void setName(String name);

    public List<Controller> getControllers();

    public void setControllers(List<Controller> controllers);
}
