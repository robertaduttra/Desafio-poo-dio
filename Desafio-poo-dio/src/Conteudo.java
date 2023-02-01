public abstract class Conteudo {
    // quando é abstrata nao consigo estanciar o conteudo.
    // informando valor fixo de XP. filhos daq classe conteudo.
    protected static final double XP_PADRAO = 10d;

    private String titulo;
    private String descricao;

    // criando o metodo que vai se estender pelas outras classes.
    public abstract double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
