package EJB;

import java.io.File;
import java.util.List;

import org.primefaces.model.UploadedFile;
import controller.ControllerInt;

public interface UtilsInt {

    public File convert(UploadedFile file);

    public File getDtsFile(List<ControllerInt> controllers);

    public File getDtbFile(List<ControllerInt> controllers);

}
