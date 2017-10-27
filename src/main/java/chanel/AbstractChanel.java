package chanel;

import java.util.UUID;

public class AbstractChanel implements ChanelInt {

    protected UUID id;
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
    public UUID getId() {
        return id;
    }

    @Override
    public void setId(UUID id) {
        this.id = id;
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
    public Integer getType() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setType(Integer type) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Integer getDebounce() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setDebounce(Integer debounce) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Integer getT_acc() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setT_acc(Integer T_acc) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Integer getN_acc() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setN_acc(Integer N_acc) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Integer getT_relax() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setT_relax(Integer T_relax) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Integer getT_interim() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setT_interim(Integer T_interim) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Integer getInvert() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setInvert(Integer invert) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Integer getT_pulse() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setT_pulse(Integer T_pulse) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Integer getT_delay() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setT_delay(Integer T_delay) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Integer getFilter() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setFilter(Integer filter) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Integer getT_filter() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setT_filter(Integer T_filter) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Integer getZero_range() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setZero_range(Integer zero_range) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Integer getSw_threshold() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setSw_threshold(Integer sw_threshold) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Integer getThreshold() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setThreshold(Integer threshold) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Integer getT_periodic() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setT_periodic(Integer T_periodic) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getConfig() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
