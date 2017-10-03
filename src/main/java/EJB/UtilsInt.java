package EJB;

import controller.Controller;
import java.io.File;
import java.util.List;

import org.primefaces.model.UploadedFile;

public interface UtilsInt {

    public File convert(UploadedFile file);

    public File getDtcFile(List<Controller> controllers);

    public File getDtbFile(List<Controller> controllers);

}
