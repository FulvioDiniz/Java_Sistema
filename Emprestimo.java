
import java.time.LocalDateTime;


public class Emprestimo {
    private long codigo;
    private LocalDateTime retirada;
    private LocalDateTime devolucao;
    private Pessoa pessoaretirou;
    private Pessoa pessoadevolveu;
    private Chave chave;


    public Emprestimo() {
    }

    public Emprestimo(long codigo, Pessoa pessoaretirou, Chave chave) {
        this.codigo = codigo;
        this.pessoaretirou = pessoaretirou;
        this.retirada = LocalDateTime.now();
        this.chave = chave;
        }

    public long getCodigo() {
        return this.codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public LocalDateTime getRetirada() {
        return this.retirada;
    }

    public void setRetirada(LocalDateTime retirada) {
        chave.retirarChave();
        this.retirada = retirada;
    }



    public LocalDateTime getDevolucao() {
        return this.devolucao;
    }

    public void setDevolucao(LocalDateTime devolucao) {
        this.devolucao = devolucao;
    }


    public Emprestimo codigo(long codigo) {
        this.codigo = codigo;
        return this;
    }

    public Emprestimo retirada(LocalDateTime retirada) {
        this.retirada = retirada;
        return this;
    }

    public Emprestimo devolucao(LocalDateTime devolucao) {
        this.devolucao = devolucao;
        return this;
    }
    
    public void setPessoaretirou(Pessoa pessoaretirou) {
        this.pessoaretirou = pessoaretirou;
    }

    public void setPessoadevolveu(Pessoa pessoadevolveu) {
        this.pessoadevolveu = pessoadevolveu;
    }

    public Pessoa getPessoaretirou() {
        return pessoaretirou;
    }

    public Pessoa getPessoadevolveu() {
        return pessoadevolveu;
    }


    public Chave getChave() {
        return this.chave;
    }

    public void setChave(Chave chave) {
        this.chave = chave;
    }

    public Emprestimo chave(Chave chave) {
        this.chave = chave;
        return this;
    }

    public void finalizarEmprestimo(Pessoa pessoa){
        chave.devolverChave();
        setPessoadevolveu(pessoa);
        setDevolucao(LocalDateTime.now());
    }

    // public void finalizarEmprestimo(Pessoa pessoa, LocalDateTime devolucao2){
    //     setPessoadevolveu(pessoa);
    //     setDevolucao(devolucao2);
    // }




    @Override
    public String toString() {
        return "{\n" +
            "codigo='" + getCodigo() + "'" +
            "retirada='" + getRetirada() + "'" +
            "devolucao='" + getDevolucao() + "\n" +
            "\n" +
            "pessoaretirou=[" + getPessoaretirou() + 
            "]\n" +
            "pessoadevolveu=[" + getPessoadevolveu() + "" +
            "]\n" +
            "\nchave='" + getChave() + "'" +
            "}\n";
    }



}
