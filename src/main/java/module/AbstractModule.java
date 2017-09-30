package module;

import chanel.Chanel;
import java.util.List;

public class AbstractModule implements Module {

    private Integer index;
    private String type;
    private String name;
    private String vname;
    private String ts_vname;
    private Integer size;
    private List<Chanel> chanels;

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void addChanel(Chanel chanel) {
        chanels.add(chanel);
    }

    @Override
    public Chanel getChanel(int index) {
        return chanels.get(index);
    }

    @Override
    public Integer getIndex() {
        return this.index;
    }

    @Override
    public void setIndex(Integer index) {
        this.index = index;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getVname() {
        return this.vname;
    }

    @Override
    public void setVname(String vname) {
        this.vname = vname;
    }

    @Override
    public String getTs_vname() {
        return this.ts_vname;
    }

    @Override
    public void setTs_vname(String ts_vname) {
        this.ts_vname = ts_vname;
    }

    @Override
    public Integer getSize() {
        return size;
    }

    @Override
    public void setSize(Integer size) {
        this.size = size;
    }

    @Override
    public List<Chanel> getChanels() {
        return chanels;
    }

    @Override
    public void setChanels(List<Chanel> chanels) {
        this.chanels = chanels;
    }
    
}
