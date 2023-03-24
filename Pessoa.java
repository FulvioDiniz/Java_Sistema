import java.util.ArrayList;

public class Pessoa {
    private long codigo;
    private String nome;
    private ArrayList<Contato> contatos = new ArrayList<Contato>();

    public ArrayList<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(ArrayList<Contato> contatos) {
        this.contatos = contatos;
    }

    public Pessoa contatos(ArrayList<Contato> contatos) {
        this.contatos = contatos;
        return this;
    }

    public void addContato(Contato contato) {
        this.contatos.add(contato);
    }

    public void removeContato(Contato contato) {
        this.contatos.remove(contato);
    }

  


    public Pessoa() {
    }

    

    public Pessoa(long codigo, String nome, ArrayList<Contato> contatos) {
        this.codigo = codigo;
        this.nome = nome;
        this.contatos = contatos;
    }

    public Pessoa(long codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }


    public long getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pessoa codigo(long codigo) {
        this.codigo = codigo;
        return this;
    }

    public Pessoa nome(String nome) {
        this.nome = nome;
        return this;
    }



  @Override
    public String toString() {
        return "\n" +
            "codigo ='" + getCodigo() + "'" +
            "nome='" + getNome() + "'" +
            "contatos='" + getContatos() + "'" +
            "";
    }
    


    
}
