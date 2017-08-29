/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MenagedBeans;

import EJB.ConverterInt;
import Entitys.chanels.*;
import Entitys.modules.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "generatorBean")
@SessionScoped
public class GeneratorBean implements Serializable {

    @EJB
    private ConverterInt converterEjb;
    private static final long serialVersionUID = 4325384860998301404L;
    private List<Module> modules = new ArrayList<>();
    private Module selectedModule;
    private Chanel selectedChanel;
    private Integer startCount;

    public GeneratorBean() {
        startCount = 2;
    }

    @PostConstruct
    public void init() {
        modules = new ArrayList<>();
    }

    public List<Module> getModules() {
        return modules;
    }

    public void setModules(List<Module> modules) {
        this.modules = modules;
    }

    public Module getSelectedModule() {
        return selectedModule;
    }

    public void setSelectedModule(Module selectedModule) {
        this.selectedModule = selectedModule;
    }

    public Integer getStartCount() {
        return startCount;
    }

    public void setStartCount(Integer startCount) {
        this.startCount = startCount;
    }

    public Chanel getSelectedChanel() {
        return selectedChanel;
    }

    public void setSelectedChanel(Chanel selectedChanel) {
        this.selectedChanel = selectedChanel;
    }

    public void insertModule(String type) {
        modules.add(new Module(type));
        reOrder();
    }

    public void deleteModule() {
        modules.remove(selectedModule);
        selectedModule = null;
        reOrder();
    }

    public void copyModule() {
        modules.add(new Module(selectedModule));
        reOrder();
    }

    public void insertChanel(String type) {
        selectedModule.insertChanel(type);
    }

    public void deleteChanel(Chanel chanel) {
        selectedModule.deleteChanel(chanel);
    }

    public void copyChanel(Chanel chanel) {
        selectedModule.copyChanel(chanel);
    }

    public void reOrder() {
        modules.forEach(module -> {
            module.setNumber(modules.indexOf(module) + startCount);
        });
    }

    public void generate() {
        converterEjb.convert(modules);
    }
}
