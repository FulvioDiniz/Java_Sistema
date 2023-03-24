public class Chave {

    private long codigo;
    private String sala;
    private Boolean disponivel;
    
    public Chave() {
    }

    public Chave(long codigo, String sala, Boolean disponivel) {
        this.codigo = codigo;
        this.sala = sala;
        this.disponivel = disponivel;
    }

    public long getCodigo() {
        return this.codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getSala() {
        return this.sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public Boolean isDisponivel() {
        return this.disponivel;
    }

    public Boolean getDisponivel() {
        return this.disponivel;
    }

    public void setDisponivel(Boolean disponivel) {
        this.disponivel = disponivel;
    }

    public Chave codigo(long codigo) {
        this.codigo = codigo;
        return this;
    }

    public Chave sala(String sala) {
        this.sala = sala;
        return this;
    }

    public Chave disponivel(Boolean disponivel) {
        this.disponivel = disponivel;
        return this;
    }

    public void retirarChave() {
        this.disponivel = false;
    }

    public void devolverChave() {
        this.disponivel = true;
    }

    @Override
    public String toString() {
        return "" +
            "codigo='" + getCodigo() + "'" +
            " sala='" + getSala() + "'" +
            " disponivel='" + isDisponivel() + "'" +
            "";
    }


}
