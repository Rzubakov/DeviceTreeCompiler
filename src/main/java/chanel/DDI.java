package chanel;

public class DDI extends AbstractChanel {

    public DDI() {
        method = 3;
        debounce = 20;
        T_acc = 3;
        N_acc = 3;
        T_relax = 3;
        invert = 3;
        T_interim = 3;
        size = 2;
    }

    @Override
    public Integer getDebounce() {
        return debounce;
    }

    @Override
    public void setDebounce(Integer debounce) {
        this.debounce = debounce;
    }

    @Override
    public Integer getT_acc() {
        return T_acc;
    }

    @Override
    public void setT_acc(Integer T_acc) {
        this.T_acc = T_acc;
    }

    @Override
    public Integer getN_acc() {
        return N_acc;
    }

    @Override
    public void setN_acc(Integer N_acc) {
        this.N_acc = N_acc;
    }

    @Override
    public Integer getT_relax() {
        return T_relax;
    }

    @Override
    public void setT_relax(Integer T_relax) {
        this.T_relax = T_relax;
    }

    @Override
    public Integer getT_interim() {
        return T_interim;
    }

    @Override
    public void setT_interim(Integer T_interim) {
        this.T_interim = T_interim;
    }

    @Override
    public Integer getInvert() {
        return invert;
    }

    @Override
    public void setInvert(Integer invert) {
        this.invert = invert;
    }

    @Override
    public String getConfig() {
        return id + " {" + "method=<" + method + ">; debounce=<" + debounce + ">; T_acc=<" + T_acc + ">; N_acc=<" + N_acc + ">; T_relax=<" + T_relax + ">; invert=<" + invert + ">; T_interim=<" + T_interim + ">; };";
    }
}
