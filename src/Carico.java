public class Carico {

    public Carico(String tipoCarico, int pesoCarico) {
        this.tipoCarico = tipoCarico;
        this.pesoCarico = pesoCarico;
    }

    private String tipoCarico;
    private int pesoCarico;

    public int getPesoCarico() {
        return pesoCarico;
    }

    public void setPesoCarico(int pesoCarico) {
        this.pesoCarico = pesoCarico;
    }

    public String getTipoCarico() {
        return tipoCarico;
    }

    public void setTipoCarico(String tipoCarico) {
        this.tipoCarico = tipoCarico;
    }
}
