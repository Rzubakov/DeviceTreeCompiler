package mBeans;

import ejb.UtilsInt;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "exporter")
@ViewScoped
public class ExporterBean implements Serializable {

    private static final long serialVersionUID = -4973184799119605654L;

    @ManagedProperty("#{sessionBean}")
    private SessionBean session;
    @EJB
    UtilsInt utils;

    public ExporterBean() {
    }
/*
    public File exportDtcFile() {
        return utils.getDtsFile(session.getControllers());
    }
*/
    public SessionBean getSession() {
        return session;
    }

    public void setSession(SessionBean session) {
        this.session = session;
    }

}
