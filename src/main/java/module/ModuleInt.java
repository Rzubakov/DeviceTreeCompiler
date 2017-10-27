package module;

import java.util.List;
import java.util.UUID;
import chanel.ChanelInt;

public interface ModuleInt {

    public String getType();

    public void setType(String type);

    public UUID getId();

    public void setId(UUID id);

    public Integer getIndex();

    public void setIndex(Integer index);

    public String getName();

    public void setName(String name);

    public String getVname();

    public void setVname(String vname);

    public String getTs_vname();

    public void setTs_vname(String name);

    public Integer getSize();

    public void setSize(Integer size);

    public void addChanel(ChanelInt chanel);

    public ChanelInt getChanel(int index);

    public List<ChanelInt> getChanels();

    public void setChanels(List<ChanelInt> chanels);

    public String getKind();

    public void setKind(String kind);

    public List<String> getConfig();

    public Integer getCurrentSize();

    public void setCurrentSize(Integer currentSize);

    public Boolean isFull();

    public Boolean isSingleFull();

    public Boolean isDoubleFull();

}
