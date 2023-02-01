import java.time.LocalDate;

public class Mentoria extends Conteudo {
    // mentoria tem tudo que o conteudo tem.

    private LocalDate data;

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    public Mentoria() {

    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        // para ter acesso ao devido a ser private coloca o get na frente.
        return "Mentoria [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", data=" + data + "]";
    }

}
