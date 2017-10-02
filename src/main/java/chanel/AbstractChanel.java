package chanel;

public abstract class AbstractChanel implements Chanel {

    protected Integer id;
    protected Integer type;
    protected Integer size;
    protected Integer method;
    protected Integer debounce;
    protected Integer T_acc;
    protected Integer N_acc;
    protected Integer T_relax;
    protected Integer T_interim;
    protected Integer invert;
    protected Integer T_pulse;
    protected Integer T_delay;
    protected Integer filter;
    protected Integer T_filter;
    protected Integer zero_range;
    protected Integer sw_threshold;
    protected Integer threshold;
    protected Integer T_periodic;

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public Integer getType() {
        return type;
    }

    @Override
    public void setType(Integer type) {
        this.type = type;
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
    public Integer getMethod() {
        return method;
    }

    @Override
    public void setMethod(Integer method) {
        this.method = method;
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
    public Integer getT_pulse() {
        return T_pulse;
    }

    @Override
    public void setT_pulse(Integer T_pulse) {
        this.T_pulse = T_pulse;
    }

    @Override
    public Integer getT_delay() {
        return T_delay;
    }

    @Override
    public void setT_delay(Integer T_delay) {
        this.T_delay = T_delay;
    }

    @Override
    public Integer getFilter() {
        return filter;
    }

    @Override
    public void setFilter(Integer filter) {
        this.filter = filter;
    }

    @Override
    public Integer getT_filter() {
        return T_filter;
    }

    @Override
    public void setT_filter(Integer T_filter) {
        this.T_filter = T_filter;
    }

    @Override
    public Integer getZero_range() {
        return zero_range;
    }

    @Override
    public void setZero_range(Integer zero_range) {
        this.zero_range = zero_range;
    }

    @Override
    public Integer getSw_threshold() {
        return sw_threshold;
    }

    @Override
    public void setSw_threshold(Integer sw_threshold) {
        this.sw_threshold = sw_threshold;
    }

    @Override
    public Integer getThreshold() {
        return threshold;
    }

    @Override
    public void setThreshold(Integer threshold) {
        this.threshold = threshold;
    }

    @Override
    public Integer getT_periodic() {
        return T_periodic;
    }

    @Override
    public void setT_periodic(Integer T_periodic) {
        this.T_periodic = T_periodic;
    }

    @Override
    public String getConfig() {
        switch (this.getClass().getName()) {
            case "chanel.AI":
                return id + " {" + method + "; " + filter + "; " + T_filter + "; " + zero_range + "; " + sw_threshold + "; " + threshold + "; " + T_periodic + "; };";
            case "chanel.SDI":
                return id + " {" + method + "; " + debounce + "; " + T_acc + "; " + N_acc + "; " + T_relax + "; " + invert + "; };";
            case "chanel.DDI":
                return id + " {" + method + "; " + debounce + "; " + T_acc + "; " + N_acc + "; " + T_relax + "; " + invert + "; " + T_interim + "; };";
            case "chanel.SDO":
                return id + " {" + method + "; " + type + "; " + T_pulse + "; " + T_delay + "; };";
            case "chanel.DDO":
                return id + " {" + method + "; " + T_pulse + "; " + T_delay + "; " + T_interim + "; };";
        }
        throw new RuntimeException();
    }
}
