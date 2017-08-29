/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MenagedBeans;

import EJB.ConverterInt;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;

@ManagedBean(name = "converterBean")
@ViewScoped
public class ConverterBean implements Serializable {

    private static final long serialVersionUID = -2763414850414417113L;

    public ConverterBean() {

    }

    @EJB
    private ConverterInt converterEjb;
    private File tfile;
    private StreamedContent dfile;

    public void convert(FileUploadEvent event) {
        try {
            tfile = converterEjb.convert(event.getFile());
            dfile = new DefaultStreamedContent(new FileInputStream(tfile), "text/plain", tfile.getName());
            FacesContext.getCurrentInstance().addMessage("messages", new FacesMessage(FacesMessage.SEVERITY_INFO, tfile.getName(), ""));
        } catch (FileNotFoundException e) {
            FacesContext.getCurrentInstance().addMessage("messages", new FacesMessage(FacesMessage.SEVERITY_FATAL, e.getMessage(), ""));
        }
    }

    public StreamedContent getDfile() {
        return dfile;
    }

    public void setDfile(StreamedContent dfile) {
        this.dfile = dfile;
    }

}
