public class Carico {

    public Carico(String tipoCarico, int pesoCarico) {
        this.tipoCarico = tipoCarico;
        this.pesoCarico = pesoCarico;
    }

    private String tipoCarico;
    private int pesoCarico;
    private String ciaoGallu;
    
    public String getSaluto(){
        if(ciaoGallu.equal("ciao")){
            return "sueg";
        }else{
            return "bello POO";
        }
    }

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
