package EJB;

import controller.Controller;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.util.Calendar;
import java.util.List;
import javax.ejb.Stateless;
import org.primefaces.model.UploadedFile;

@Stateless
public class Utils implements UtilsInt {

    public Utils() {
    }

    @Override
    public File convert(UploadedFile file) {
        String filename = Calendar.getInstance().getTime().getTime() + "_" + file.getFileName().substring(0, file.getFileName().length() - 4);
        String expansion = file.getFileName().substring(file.getFileName().length() - 3, file.getFileName().length());
        ProcessBuilder builder;
        try {
            if (expansion.equals("dts")) {
                Files.copy(file.getInputstream(), FileSystems.getDefault().getPath("/tmp/", filename + ".dts"));
                // builder = new ProcessBuilder("cmd.exe", "/c", "dtc -Idts -Odtb -o configs/" + filename + ".dtb" + " configs/" + filename + ".dts");
                builder = new ProcessBuilder("dtc", "-Idts", "-Odtb", "-o", "tmp/" + filename + ".dtb", "tmp/" + filename + ".dts");
                builder.redirectOutput(new File("/tmp/out_" + filename + ".txt"));
                builder.redirectErrorStream(true);
                builder.start().waitFor();
                return new File("/tmp/" + filename + ".dtb");
            } else {
                Files.copy(file.getInputstream(), FileSystems.getDefault().getPath("/tmp/", filename + ".dtb"));
                // builder = new ProcessBuilder("cmd.exe", "/c", "dtc -Idtb -Odts -o configs/" + filename + ".dts" + " configs/" + filename + ".dtb");
                builder = new ProcessBuilder("dtc", "-Idtb", "-Odts", "-o", "tmp/" + filename + ".dts", "tmp/" + filename + ".dtb");
                builder.redirectOutput(new File("/tmp/out_" + filename + ".txt"));
                builder.redirectErrorStream(true);
                builder.start().waitFor();
                return new File("/tmp/" + filename + ".dts");
            }
        } catch (IOException | InterruptedException e) {
            System.out.println(e);
        }
        return null;
    }

    //   @Override
    //   public File convert(List<Module> modules) {
    //       List<String> config = new ArrayList<>();
    //       config.add("/*АО Текон-Инжиниринг*/");
    //       config.add("/*Ведущий инженер-программист: Зубаков Р.А.*/");
    //       config.add("/*" + Calendar.getInstance().getTime().toString() + "*/");
    //       config.add("/dts-v1/;");
    //       config.add("/{");
    //       config.add("ubus{");
    //       config.add("version = \"1.0.0\";");
    //       modules.forEach((module) -> {
    //           config.addAll(module.getConfig());
    //       });
    //       config.add("};");
    //       config.add("};");
    //       try (PrintWriter print = new PrintWriter("c://out.dts")) {
    //           config.forEach((line) -> {
    //               print.println(line);
    //           });
    //      } catch (Exception e) {
    //           System.out.println(e);
    //       }
    //      return null;
    //  }
    @Override
    public File getDtsFile(List<Controller> controller) {

        controller.forEach(c -> {
            try (PrintWriter print = new PrintWriter("c://Testing/" + c.getName() + ".dts")) {
                c.getConfig().forEach(cfg -> {
                    print.println(cfg);
                });
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        return null;
    }

    @Override
    public File getDtbFile(List<Controller> controllers
    ) {
        return null;
    }
}
