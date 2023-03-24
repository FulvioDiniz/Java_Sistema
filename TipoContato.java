public enum TipoContato {

    CELULAR("Celular"),
    EMAIL("E-mail");

    private String descricao;


    private TipoContato(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "" +
            " descricao='" + getDescricao() + "'" +
            "";
    }
    
    
}
