public class Contato{

    private long id;
    private TipoContato tipo;
    private String valor;

    public Contato() {
    }

    public Contato(long id, TipoContato tipo, String valor) {
        this.id = id;
        this.tipo = tipo;
        this.valor = valor;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public TipoContato getTipo() {
        return this.tipo;
    }

    public void setTipo(TipoContato tipo) {
        this.tipo = tipo;
    }

    public String getValor() {
        return this.valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Contato id(long id) {
        this.id = id;
        return this;
    }

    public Contato tipo(TipoContato tipo) {
        this.tipo = tipo;
        return this;
    }
    
    public Contato valor(String valor) {
        this.valor = valor;
        return this;
    }

    @Override
    public String toString() {
        return "\n" +
            "id='" + getId() + "'" +
            "tipo='" + getTipo() + "'" +
            "valor='" + getValor() + "'" +
            "";
    }
    







}
