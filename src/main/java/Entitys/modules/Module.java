package Entitys.modules;

import Entitys.chanels.Chanel;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Module {

    private Integer number;
    private String type;
    private String name;
    private String vname;
    private String ts_vname;
    private List<Chanel> chanels;
    private Integer countChanel;
    private Integer currentSize;

    public Module(String type) {
        chanels = new ArrayList<>();
        this.type = type;
        switch (this.type) {
            case "DI32":
                this.type = "DI";
                this.name = "DI32";
                this.vname = "DI32/i";
                this.ts_vname = "DI32";
                this.countChanel = 32;
                this.currentSize = 0;
                break;
            case "DO32":
                this.type = "DO";
                this.name = "DO32";
                this.vname = "DO32/o";
                this.ts_vname = "DO32";
                this.countChanel = 32;
                this.currentSize = 0;
                break;
            case "AIG16":
                this.type = "AI";
                this.name = "AIG16";
                this.vname = "AIG16/i";
                this.ts_vname = "AIG16";
                this.countChanel = 16;
                this.currentSize = 0;
                break;
        }
    }

    public Module(Module module) {
        this.number = 0;
        this.type = module.type;
        this.name = module.name;
        this.vname = module.vname;
        this.ts_vname = module.ts_vname;
        this.chanels = new ArrayList<>(module.chanels);
        this.countChanel = module.countChanel;
        this.currentSize = module.currentSize;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public List<Chanel> getChanels() {
        return chanels;
    }

    public void setChanels(List<Chanel> chanels) {
        this.chanels = chanels;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVname() {
        return vname;
    }

    public void setVname(String vname) {
        this.vname = vname;
    }

    public String getTs_vname() {
        return ts_vname;
    }

    public void setTs_vname(String ts_vname) {
        this.ts_vname = ts_vname;
    }

    public Integer getCountChanel() {
        return countChanel;
    }

    public void setCountChanel(Integer countChanel) {
        this.countChanel = countChanel;
    }

    public Integer getCurrentSize() {
        return currentSize;
    }

    public void setCurrentSize(Integer currentSize) {
        this.currentSize = currentSize;
    }

    public List<String> getConfig() {
        ArrayList<String> config = new ArrayList<>();
        config.add(name + "@0," + (number < 10 ? "0" + number : number) + "{");
        config.add("vname = \"" + (number < 10 ? "0" + number : number) + "_" + vname + "\";");
        config.add("ts_vname = \"" + name + "@" + (number < 10 ? "0" + number : number) + "\";");
        config.add("kind = <0x0>;");
        for (int i = 0; i < chanels.size(); i++) {
            config.add(i + " " + chanels.get(0).getConfig());
        }
        config.add("};");
        return config;
    }

    public void insertChanel(String type) {
        Chanel chanel = new Chanel(type);
        currentSize += chanel.getSize();
        chanels.add(chanel);

    }

    public void deleteChanel(Chanel chanel) {
        currentSize -= chanel.getSize();
        chanels.remove(chanel);
    }

    public void copyChanel(Chanel chanel) {
        currentSize += chanel.getSize();
        chanels.add(new Chanel(chanel));
    }

    public Boolean isFull() {
        return countChanel <= currentSize;
    }
}
