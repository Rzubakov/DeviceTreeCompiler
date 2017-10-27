package controller;

import java.util.List;
import module.ModuleInt;

public interface ControllerInt {

    public Integer getId();

    public void setId(Integer id);

    public void addModule(ModuleInt module);

    public void deleteModule(ModuleInt module);

    public ModuleInt getModule(int index);

    public List<ModuleInt> getModules();

    public void setModules(List<ModuleInt> modules);

    public String getType();

    public void setType(String type);

    public String getName();

    public void setName(String name);

    public ModuleInt find(ModuleInt module);

    public Integer getSize();

    public void setSize(Integer size);

    public Integer getCurrentSize();

    public void setCurrentSize(Integer currentSize);

    public List<String> getConfig();

    public Boolean isFull();

}
