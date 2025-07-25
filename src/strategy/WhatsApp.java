package strategy;

import model.Mensagem;
import singleton.LogService;

public class WhatsApp implements CanalComunicacao {

    @Override
    public void enviar(Mensagem mensagem) {
        System.out.println("Enviando por WhatsApp: " + mensagem.getConteudo());
        LogService.getInstance().registrar("Mensagem enviada por WhatsApp.");
    }
}
