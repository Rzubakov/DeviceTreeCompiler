package chanel;

public class SDI extends AbstractChanel {

    public SDI() {
        method = 2;
        debounce = 2;
        T_acc = 2;
        N_acc = 2;
        T_relax = 2;
        invert = 0;
        size = 1;
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
    public Integer getInvert() {
        return invert;
    }

    @Override
    public void setInvert(Integer invert) {
        this.invert = invert;
    }

    @Override
    public String getConfig() {
        return id + " {" + method + "; " + debounce + "; " + T_acc + "; " + N_acc + "; " + T_relax + "; " + invert + "; };";
    }
}
