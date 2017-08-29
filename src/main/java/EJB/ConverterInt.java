/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;


import Entitys.modules.Module;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.primefaces.model.UploadedFile;

/**
 *
 * @author Rzubakov
 */
public interface ConverterInt {
    public File convert(UploadedFile file);
    public File convert(List<Module> modules);
}
