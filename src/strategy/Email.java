package strategy;

import model.Mensagem;
import singleton.LogService;

public class Email implements CanalComunicacao {

    @Override
    public void enviar(Mensagem mensagem) {
        System.out.println("Enviando por Email: " + mensagem.getConteudo());
        LogService.getInstance().registrar("Mensagem enviada por Email.");
    }
}