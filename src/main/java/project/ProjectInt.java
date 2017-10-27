package project;

import java.util.List;
import controller.ControllerInt;
import java.util.UUID;

public interface ProjectInt {

    public UUID getId();

    public void setId(UUID id);

    public String getName();

    public void setName(String name);

    public List<ControllerInt> getControllers();

    public void setControllers(List<ControllerInt> controllers);

    public void addController(ControllerInt controller);

    public void deleteController(ControllerInt controller);
}
