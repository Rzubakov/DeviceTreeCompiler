package chanel;

import java.util.Properties;

public class ChanelFactory {

    public static ChanelInt getChanelByType(String type) {
        switch (type) {
            case "SDI":
                return new SDI();
            case "DDI":
                return new DDI();
            case "SDO":
                return new SDO();
            case "DDO":
                return new DDO();
            case "AI":
                return new AI();
        }
        throw new RuntimeException("unknown type chanel " + type);
    }

}
