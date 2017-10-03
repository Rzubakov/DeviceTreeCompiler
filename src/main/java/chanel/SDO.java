package chanel;

public class SDO extends AbstractChanel {

    public SDO() {
        method = 4;
        type = 1;
        T_pulse = 1;
        T_delay = 2;
        size = 1;
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
    public String getConfig() {
        return id + " {" + method + "; " + type + "; " + T_pulse + "; " + T_delay + "; };";
    }
}
