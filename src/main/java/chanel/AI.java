package chanel;

public class AI extends AbstractChanel {

    public AI() {
        method = 1;
        filter = 1;
        T_filter = 1;
        zero_range = 1;
        sw_threshold = 1;
        threshold = 1;
        T_periodic = 1;
        size = 1;
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
    public String getConfig(){
        return id + " {" + method + "; " + filter + "; " + T_filter + "; " + zero_range + "; " + sw_threshold + "; " + threshold + "; " + T_periodic + "; };";
    }
}
