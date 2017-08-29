package Entitys.chanels;

public class Chanel {

    private String modification = null;
    private Integer method = null;
    private Integer filter = null;
    private Integer T_filter = null;
    private Integer zero_range = null;
    private Integer sw_threshold = null;
    private Integer threshold = null;
    private Integer T_periodic = null;
    private Integer debounce = null;
    private Integer T_acc = null;
    private Integer N_acc = null;
    private Integer T_relax = null;
    private Integer invert = null;
    private Integer T_interim = null;
    private Integer type = null;
    private Integer T_pulse = null;
    private Integer T_delay = null;
    private Integer size = null;

    public Chanel(String modification) {
        this.modification = modification;
        switch (this.modification) {
            case "AI":
                this.method = 1;
                this.filter = 1;
                this.T_filter = 1;
                this.zero_range = 1;
                this.sw_threshold = 1;
                this.threshold = 1;
                this.T_periodic = 1;
                this.size = 1;
                break;
            case "SDI":
                this.method = 2;
                this.debounce = 10;
                this.T_acc = 1;
                this.N_acc = 2;
                this.T_relax = 50;
                this.invert = 0;
                this.size = 1;
                break;
            case "DDI":
                this.method = 3;
                this.debounce = 1;
                this.T_acc = 1;
                this.N_acc = 1;
                this.T_relax = 1;
                this.invert = 0;
                this.T_interim = 1;
                this.size = 2;
                break;
            case "SDO":
                this.method = 4;
                this.type = 0;
                this.T_pulse = 1;
                this.T_delay = 1;
                this.size = 1;
                break;
            case "DDO":
                this.method = 5;
                this.T_pulse = 1;
                this.T_delay = 1;
                this.T_interim = 1;
                this.size = 2;
                break;
        }
    }

    public Chanel(Chanel chanel) {
        this.modification = chanel.modification;
        this.method = chanel.method;
        this.filter = chanel.filter;
        this.T_filter = chanel.T_filter;
        this.zero_range = chanel.zero_range;
        this.sw_threshold = chanel.sw_threshold;
        this.threshold = chanel.threshold;
        this.T_periodic = chanel.T_periodic;
        this.debounce = chanel.debounce;
        this.T_acc = chanel.T_acc;
        this.N_acc = chanel.N_acc;
        this.T_relax = chanel.T_relax;
        this.invert = chanel.invert;
        this.T_interim = chanel.T_interim;
        this.type = chanel.type;
        this.T_pulse = chanel.T_pulse;
        this.T_delay = chanel.T_delay;
        this.size = chanel.size;
    }

    public String getModification() {
        return modification;
    }

    public void setModification(String modification) {
        this.modification = modification;
    }

    public Integer getMethod() {
        return method;
    }

    public void setMethod(Integer method) {
        this.method = method;
    }

    public Integer getFilter() {
        return filter;
    }

    public void setFilter(Integer filter) {
        this.filter = filter;
    }

    public Integer getT_filter() {
        return T_filter;
    }

    public void setT_filter(Integer T_filter) {
        this.T_filter = T_filter;
    }

    public Integer getZero_range() {
        return zero_range;
    }

    public void setZero_range(Integer zero_range) {
        this.zero_range = zero_range;
    }

    public Integer getSw_threshold() {
        return sw_threshold;
    }

    public void setSw_threshold(Integer sw_threshold) {
        this.sw_threshold = sw_threshold;
    }

    public Integer getThreshold() {
        return threshold;
    }

    public void setThreshold(Integer threshold) {
        this.threshold = threshold;
    }

    public Integer getT_periodic() {
        return T_periodic;
    }

    public void setT_periodic(Integer T_periodic) {
        this.T_periodic = T_periodic;
    }

    public Integer getDebounce() {
        return debounce;
    }

    public void setDebounce(Integer debounce) {
        this.debounce = debounce;
    }

    public Integer getT_acc() {
        return T_acc;
    }

    public void setT_acc(Integer T_acc) {
        this.T_acc = T_acc;
    }

    public Integer getN_acc() {
        return N_acc;
    }

    public void setN_acc(Integer N_acc) {
        this.N_acc = N_acc;
    }

    public Integer getT_relax() {
        return T_relax;
    }

    public void setT_relax(Integer T_relax) {
        this.T_relax = T_relax;
    }

    public Integer getInvert() {
        return invert;
    }

    public void setInvert(Integer invert) {
        this.invert = invert;
    }

    public Integer getT_interim() {
        return T_interim;
    }

    public void setT_interim(Integer T_interim) {
        this.T_interim = T_interim;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getT_pulse() {
        return T_pulse;
    }

    public void setT_pulse(Integer T_pulse) {
        this.T_pulse = T_pulse;
    }

    public Integer getT_delay() {
        return T_delay;
    }

    public void setT_delay(Integer T_delay) {
        this.T_delay = T_delay;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getConfig() {
        switch (this.modification) {
            case "AI":
                return "{" + "method=" + "<" + method + ">;" + "filter=" + "<" + filter + ">;" + "T_filter=" + "<" + T_filter + ">;" + "zero_range=" + "<" + zero_range + ">;" + "sw_threshold=" + "<" + sw_threshold + ">;" + "threshold=" + "<" + threshold + ">;" + "T_periodic=" + "<" + T_periodic + ">;" + "};";
            case "SDI":
                return "{" + "method=" + "<" + method + ">;" + "debounce=" + "<" + debounce + ">;" + "T_acc=" + "<" + T_acc + ">;" + "N_acc=" + "<" + N_acc + ">;" + "T_relax=" + "<" + T_relax + ">;" + "invert=" + "<" + invert + ">;" + "};";
            case "DDI":
                return "{" + "method=" + "<" + method + ">;" + "debounce=" + "<" + debounce + ">;" + "T_acc=" + "<" + T_acc + ">;" + "N_acc=" + "<" + N_acc + ">;" + "T_relax=" + "<" + T_relax + ">;" + "invert=" + "<" + invert + ">;" + "T_interim=" + "<" + T_interim + ">;" + "};";
            case "SDO":
                return "{" + "method=" + "<" + method + ">;" + "type=" + "<" + type + ">;" + "T_pulse=" + "<" + T_pulse + ">;" + "T_delay=" + "<" + T_delay + ">;" + "};";
            case "DDO":
                return "{" + "method=" + "<" + method + ">;" + "T_pulse=" + "<" + T_pulse + ">;" + "T_delay=" + "<" + T_delay + ">;" + "T_interim=" + "<" + T_interim + ">;" + "};";
        }
        return null;
    }
}
