package factory;

import strategy.CanalComunicacao;
import strategy.Email;
import strategy.SMS;
import strategy.WhatsApp;
import strategy.*;

public class CanalFactory {

    public static CanalComunicacao criarCanal(String tipo) {
        switch (tipo.toLowerCase()) {
            case "email":
                return new Email();
            case "sms":
                return new SMS();
            case "whatsapp":
                return new WhatsApp();
            default:
                throw new IllegalArgumentException("Tipo de canal desconhecido: " + tipo);
        }
    }
}
