package chanel;

public class MfcChanelFactory implements ChanelFactory {

    @Override
    public Chanel getChanelByType(String type) {
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
        throw new RuntimeException("unknown type" + type);
    }

}
