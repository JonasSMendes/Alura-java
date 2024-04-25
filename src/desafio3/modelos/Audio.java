package desafio3.modelos;

public class Audio {
    private String titulo;
    private double duracao;
    private int totalDeReproducao;
    private int curtidas;
    private int classificacao;
    private int reproduzindo;

    public void curtir(){
        curtidas++;
    }
    public void reproduzir(){
        reproduzindo++;
    }

    public int getReproduzindo() {
        return reproduzindo;
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

    public int getTotalDeReproducao() {
        return totalDeReproducao;
    }

    public void setTotalDeReproducao(int totalDeReproducao) {
        this.totalDeReproducao = totalDeReproducao;
    }

    public int getCurtidas() {
        return curtidas;
    }


    public int getClassificacao() {
        return classificacao;
    }

}
