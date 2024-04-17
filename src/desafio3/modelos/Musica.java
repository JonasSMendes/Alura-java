package desafioAppMusica.modelos;


public class Musica extends Audio  {

    private String cantor;
    private String album;
    private String genero;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    @Override
    public int getClassificacao() {
        if (getCurtidas() > 2000){
            return 10;

        } else if (getCurtidas() > 1000){
            return 6;

        }else {
            return 3;
        }
    }
}
