package aula8.modelos.exception;

public class ErrorConersaoException extends RuntimeException {

    private String mensagem;
    public ErrorConersaoException(String mensagem) {
        this.mensagem = mensagem;
    }
    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
