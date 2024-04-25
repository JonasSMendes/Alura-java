package desafio3.classifica;

import desafio3.modelos.Audio;

public class AvaliandoANota {
    
    public void Avaliacao(Audio audio){
        if (audio.getClassificacao() >= 7){
            System.out.println(audio.getTitulo() +  " a galera já considera como favorito");
        } else if (audio.getClassificacao() >= 6) {
            System.out.println(audio.getTitulo() + " a galera ta gostando");
        }else {
            System.out.println(audio.getTitulo() + " começou agora");
        }
    }
}
