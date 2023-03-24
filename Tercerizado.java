import java.util.ArrayList;

public class Tercerizado extends Pessoa {
    private String empresa;

    public Tercerizado() {
    }

    public Tercerizado(long codigo, String nome, String empresa, ArrayList<Contato> contatos) {
        super(codigo, nome, contatos);
        this.empresa = empresa;
    }

    public String getEmpresa() {
        return this.empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public Tercerizado empresa(String empresa) {
        this.empresa = empresa;
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " codigo='" + getCodigo() + "'" +
            ", nome='" + getNome() + "'" +
            ", empresa='" + getEmpresa() + "'" +
            "}";
    }



    
}
