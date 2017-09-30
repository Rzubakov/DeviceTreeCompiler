package EJB;

import java.io.File;
import org.primefaces.model.UploadedFile;

public interface ConverterInt {

    public File convert(UploadedFile file);

}
