package EJB;

import java.io.File;
import java.util.Properties;
import org.primefaces.model.UploadedFile;

public interface UtilsInt {

    public File convert(UploadedFile file);

    public Properties getConfig();

}
