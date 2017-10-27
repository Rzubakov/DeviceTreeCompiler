package project;

import java.util.List;
import controller.ControllerInt;
import java.util.ArrayList;
import java.util.UUID;

public abstract class AbstractProject implements ProjectInt {

    protected UUID id;
    protected String name;
    protected List<ControllerInt> controllers = new ArrayList<>();

    ;

    @Override
    public UUID getId() {
        return id;
    }

    @Override
    public void setId(UUID id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public List<ControllerInt> getControllers() {
        return controllers;
    }

    @Override
    public void setControllers(List<ControllerInt> controllers) {
        this.controllers = controllers;
    }

    @Override
    public void addController(ControllerInt controller) {
        controllers.add(controller);
    }

    @Override
    public void deleteController(ControllerInt controller) {
        controllers.remove(controller);
    }

}
