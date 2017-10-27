package module;

import chanel.Chanel;
import java.util.ArrayList;
import java.util.List;

public abstract class AbstractModule implements ModuleInt {

    protected String type;
    protected Integer id;
    protected Integer index;
    protected String name;
    protected String vname;
    protected String ts_vname;
    protected String kind;
    protected Integer size;
    protected Integer currentSize;

    private List<Chanel> chanels = new ArrayList<>();

    public AbstractModule() {
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public void addChanel(Chanel chanel) {
        currentSize += chanel.getSize();
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

    @Override
    public String getKind() {
        return kind;
    }

    @Override
    public void setKind(String kind) {
        this.kind = kind;
    }

    @Override
    public String toString() {
        return vname;
    }

    @Override
    public Integer getCurrentSize() {
        return currentSize;
    }

    @Override
    public void setCurrentSize(Integer currentSize) {
        this.currentSize = currentSize;
    }

    @Override
    public Boolean isFull() {
        return currentSize >= size;
    }

    @Override
    public Boolean isSingleFull() {
        return currentSize + 1 > size;
    }

    @Override
    public Boolean isDoubleFull() {
        return currentSize + 2 > size;
    }

    @Override
    public List<String> getConfig() {
        List<String> config = new ArrayList<>();
        config.add("DI32@" + id * 0.01 + "{");
        config.add("vname=\"" + vname + "\";");
        config.add("ts_vname=\"" + ts_vname + "\";");
        config.add("kind=\"" + kind + "\";");
        chanels.forEach((chanel) -> {
            config.add(chanel.getConfig());
        });
        config.add("};");
        return config;
    }

}
