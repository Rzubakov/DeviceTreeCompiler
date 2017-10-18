package MenagedBeans;

import EJB.UtilsInt;
import java.io.File;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "exporter")
@ViewScoped
public class ExporterBean implements Serializable {

    private static final long serialVersionUID = -4973184799119605654L;

    @ManagedProperty("#{model}")
    private ModelBean model;
    @EJB
    UtilsInt utils;

    public ExporterBean() {
    }

    public File exportDtcFile() {
        return utils.getDtsFile(model.getControllers());
    }

    public ModelBean getModel() {
        return model;
    }

    public void setModel(ModelBean model) {
        this.model = model;
    }

}
