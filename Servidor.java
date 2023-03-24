import java.util.ArrayList;


public class Servidor extends Pessoa {
    private String siape;

    public Servidor() {
    }

    public Servidor(long codigo, String nome, String siape, ArrayList<Contato> contatos) {
        super(codigo, nome, contatos);
        this.siape = siape;
    }

    public String getSiape() {
        return this.siape;
    }

    public void setSiape(String siape) {
        this.siape = siape;
    }

    public Servidor siape(String siape) {
        this.siape = siape;
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " codigo='" + getCodigo() + "'" +
            ", nome='" + getNome() + "'" +
            ", siape='" + getSiape() + "'" +
            "}";
    }



    
}
