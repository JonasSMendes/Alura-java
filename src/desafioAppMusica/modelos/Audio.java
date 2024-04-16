package desafioAppMusica;

public class Audio {
    private String titulo;
    private double duracao;
    private int totalDeReprosucao;
    private int curtidas;
    private String classificacao;

    public void Curtir(){
        curtidas++;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public int getTotalDeReprosucao() {
        return totalDeReprosucao;
    }

    public void setTotalDeReprosucao(int totalDeReprosucao) {
        this.totalDeReprosucao = totalDeReprosucao;
    }

    public int getCurtidas() {
        return curtidas;
    }


    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }
}
