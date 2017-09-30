package controller;

import java.util.ArrayList;
import java.util.List;
import module.Module;

public abstract class AbstractController implements Controller {

    protected List<Module> modules = new ArrayList<>();
    protected String type;
    protected String name;

    public AbstractController() {
    }

    @Override
    public void addModule(Module module) {
        modules.add(module);
    }

    @Override
    public Module getModule(int index) {
        return modules.get(index);
    }

    @Override
    public List<Module> getModules() {
        return modules;
    }

    @Override
    public void setModules(List<Module> modules) {
        this.modules = modules;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void setType(String type) {
        this.type = type;
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
    public Module find(Module module) {
        return modules.get(modules.indexOf(module));
    }

    @Override
    public void deleteModule(Module module) {
        modules.remove(modules.indexOf(module));
    }

    @Override
    public String toString(){
        return name+":"+type;
    }
}
