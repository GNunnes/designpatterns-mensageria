package strategy;

import model.Mensagem;

public interface CanalComunicacao {
    void enviar(Mensagem mensagem);
}