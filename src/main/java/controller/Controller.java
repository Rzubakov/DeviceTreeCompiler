package controller;

import java.util.List;
import module.Module;

public interface Controller {

    public Integer getId();

    public void setId(Integer id);

    public void addModule(Module module);

    public Module getModule(int index);

    public List<Module> getModules();

    public void setModules(List<Module> modules);

    public String getType();

    public void setType(String type);

    public String getName();

    public void setName(String name);

    public Module find(Module module);

    public void deleteModule(Module module);

    public Integer getSize();

    public void setSize(Integer size);

    public Integer getCurrentSize();

    public void setCurrentSize(Integer currentSize);

    public List<String> getConfig();
    
    public Boolean isFull();
}
