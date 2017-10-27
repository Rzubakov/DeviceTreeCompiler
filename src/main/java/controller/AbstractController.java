package controller;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import module.ModuleInt;

public abstract class AbstractController implements ControllerInt {

    protected Integer id;
    protected List<ModuleInt> modules = new ArrayList<>();
    protected String type;
    protected String name;
    protected Integer size;
    protected Integer currentSize;
    
    public AbstractController() {
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public void addModule(ModuleInt module) {
        currentSize+=1;
        modules.add(module);
    }

    @Override
    public ModuleInt getModule(int index) {
        return modules.get(index);
    }

    @Override
    public List<ModuleInt> getModules() {
        return modules;
    }

    @Override
    public void setModules(List<ModuleInt> modules) {
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
    public ModuleInt find(ModuleInt module) {
        return modules.get(modules.indexOf(module));
    }

    @Override
    public void deleteModule(ModuleInt module) {
        currentSize-=1;
        modules.remove(modules.indexOf(module));
    }

    @Override
    public String toString() {
        return name + ":" + type;
    }

    @Override
    public Integer getSize() {
        return size;
    }

    @Override
    public void setSize(Integer size) {
        this.size = size;
    }

    @Override
    public Integer getCurrentSize() {
        return currentSize;
    }

    @Override
    public void setCurrentSize(Integer currentSize) {
        this.currentSize = currentSize;
    }

    @Override
    public List<String> getConfig() {
        List<String> config = new ArrayList<>();
        config.add("/*АО Текон-Инжиниринг*/");
        config.add("/*Ведущий инженер-программист: Зубаков Р.А.*/");
        config.add("/*Проект: " + name + "*/");
        config.add("/*" + Calendar.getInstance().getTime().toString() + "*/");
        config.add("/*Тип: " + type + "*/");
        config.add("/dts-v1/;");
        config.add("/{");
        config.add("ubus{");
        config.add("version = \"1.0.0\";");
        modules.forEach((module) -> {
            module.getConfig().forEach(cfg -> {
                config.add(cfg);
            });
        });
        config.add("};");
        config.add("};");
        return config;
    }

    @Override
    public Boolean isFull() {
        return this.currentSize>=this.size;
    }
}
