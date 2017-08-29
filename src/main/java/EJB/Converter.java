package EJB;

import Entitys.modules.Module;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.ejb.Stateless;
import org.primefaces.model.UploadedFile;

@Stateless
public class Converter implements ConverterInt {

    public Converter() {
    }

    @Override
    public File convert(UploadedFile file) {
        String filename = Calendar.getInstance().getTime().getTime() + "_" + file.getFileName().substring(0, file.getFileName().length() - 4);
        String expansion = file.getFileName().substring(file.getFileName().length() - 3, file.getFileName().length());
        ProcessBuilder builder;
        try {
            if (expansion.equals("dts")) {
                Files.copy(file.getInputstream(), FileSystems.getDefault().getPath("configs", filename + ".dts"));
                builder = new ProcessBuilder("cmd.exe", "/c", "dtc -Idts -Odtb -o configs/" + filename + ".dtb" + " configs/" + filename + ".dts");
                builder.start().waitFor();
                Files.delete(FileSystems.getDefault().getPath("configs", filename + ".dts"));
                return new File("configs/" + filename + ".dtb");
            } else {
                Files.copy(file.getInputstream(), FileSystems.getDefault().getPath("configs", filename + ".dtb"));
                builder = new ProcessBuilder("cmd.exe", "/c", "dtc -Idtb -Odts -o configs/" + filename + ".dts" + " configs/" + filename + ".dtb");
                builder.start().waitFor();
                Files.delete(FileSystems.getDefault().getPath("configs", filename + ".dtb"));
                return new File("configs/" + filename + ".dts");
            }
        } catch (IOException | InterruptedException e) {
            System.out.println(e);
        }
        return null;
    }

    @Override
    public File convert(List<Module> modules) {
        List<String> config = new ArrayList<>();
        config.add("/*АО Текон-Инжиниринг*/");
        config.add("/*Ведущий инженер-программист: Зубаков Р.А.*/");
        config.add("/*" + Calendar.getInstance().getTime().toString() + "*/");
        config.add("/dts-v1/;");
        config.add("/{");
        config.add("ubus{");
        config.add("version = \"1.0.0\";");
        modules.forEach((module) -> {
            config.addAll(module.getConfig());
        });
        config.add("};");
        config.add("};");
        try (PrintWriter print = new PrintWriter("c://out.dts")) {
            config.forEach((line) -> {
                print.println(line);
            });
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

}
