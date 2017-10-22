package project;

import controller.Controller;
import java.util.List;

public abstract class AbstractProject implements ProjectInt {

    protected Integer id;
    protected String name;
    protected List<Controller> controllers;

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
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
    public List<Controller> getControllers() {
        return controllers;
    }

    @Override
    public void setControllers(List<Controller> controllers) {
        this.controllers = controllers;
    }

}
