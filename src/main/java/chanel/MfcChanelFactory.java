/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chanel;

/**
 *
 * @author Rzubakov
 */
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
