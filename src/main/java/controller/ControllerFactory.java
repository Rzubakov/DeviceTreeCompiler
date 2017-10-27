package controller;

public class ControllerFactory {

    public static ControllerInt getControllerByType(String type) {

        switch (type) {
            case "Mfc1500":
                return new Mfc1500();

        }
        throw new RuntimeException("unknown type chanel" + type);
    }

}
