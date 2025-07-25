package main;

import factory.CanalFactory;
import model.Mensagem;
import strategy.CanalComunicacao;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a mensagem: ");
        String texto = scanner.nextLine();

        System.out.print("Escolha o canal (email, sms, whatsapp): ");
        String canal = scanner.nextLine();

        Mensagem mensagem = new Mensagem(texto);
        try {
            CanalComunicacao comunicacao = CanalFactory.criarCanal(canal);
            comunicacao.enviar(mensagem);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        scanner.close();
    }
}
