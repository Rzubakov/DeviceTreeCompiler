package MenagedBeans;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "modulesBean")
@ViewScoped
public class ModulesBean implements Serializable {

    @ManagedProperty("#{controllersBean}")
    private СontrollersBean controllersBean;

    public ModulesBean() {

    }

    @PostConstruct
    public void init() {
        
    }



}
