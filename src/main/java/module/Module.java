package module;

import chanel.Chanel;
import java.util.List;

public interface Module {

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

    public void addChanel(Chanel chanel);

    public Chanel getChanel(int index);

    public List<Chanel> getChanels();

    public void setChanels(List<Chanel> chanels);

    public String getKind();

    public void setKind(String kind);
}
