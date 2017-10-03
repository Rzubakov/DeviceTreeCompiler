package chanel;

public class DDO extends AbstractChanel {

    public DDO() {
        method = 5;
        T_pulse = 6;
        T_delay = 6;
        T_interim = 6;
        size = 2;
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
        return id + " {" + method + "; " + T_pulse + "; " + T_delay + "; " + T_interim + "; };";
    }
}
