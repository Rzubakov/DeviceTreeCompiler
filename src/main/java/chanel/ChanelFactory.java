package chanel;

public class ChanelFactory {

    public static Chanel getChanelByType(String type) {
        switch (type) {
            case "SDI":
                return new SDI();
            case "DDI":
                return new DDI();
            case "SDO":
                return new SDO();
            case "AI":
                return new AI();
        }
        throw new RuntimeException("unknown type chanel" + type);
    }

}
