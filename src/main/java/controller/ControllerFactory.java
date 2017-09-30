package controller;

public class ControllerFactory {

    public static Controller getControllerByType(String type) {
        System.out.println("get controller " + type);
        switch (type) {
            case "Mfc1500":return new Mfc1500();
                
        }
        throw new RuntimeException("unknown type chanel" + type);
    }


}
