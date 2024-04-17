package desafioAppMusica.modelos;

public class Podcast extends Audio{
    private String programa;

    private String descricao;

    private String apresentador;

    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    @Override
    public int getClassificacao() {
        if (this.getReproduzindo() > 2000){
            return 10;

        } else if (this.getReproduzindo() > 1000){
            return 6;

        }else {
            return 3;
        }
    }
}
