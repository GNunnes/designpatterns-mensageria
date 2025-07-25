# 💬 Sistema de Mensageria com Design Patterns (Java)


![Java](https://img.shields.io/badge/Java-17%2B-blue?style=for-the-badge&logo=java)
![IntelliJ](https://img.shields.io/badge/IDE-IntelliJ%20IDEA-orange?style=for-the-badge&logo=intellijidea)
![License](https://img.shields.io/badge/license-MIT-green?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-Concluído-success?style=for-the-badge)

---

## 📌 Sobre o Projeto

Este projeto é uma implementação prática de **Padrões de Projeto (Design Patterns)** em Java, simulando um sistema de envio de mensagens por diferentes canais: **Email**, **SMS** e **WhatsApp**.

A ideia central é demonstrar como aplicar os padrões **Strategy**, **Factory Method** e **Singleton** de forma simples, objetiva e funcional.

---

## 🧠 Padrões de Projeto Utilizados

| Padrão          | Descrição                                                                 |
|-----------------|---------------------------------------------------------------------------|
| Strategy         | Permite alternar entre diferentes canais de envio em tempo de execução. |
| Factory Method   | Instancia dinamicamente o canal de envio com base em entrada do usuário.|
| Singleton        | Controla uma única instância do serviço de log.                         |

---

## 🏗 Estrutura do Projeto

```bash
designpatterns-mensageria
│
├── model
│   └── Mensagem.java
│
├── strategy
│   ├── CanalComunicacao.java
│   ├── Email.java
│   ├── SMS.java
│   └── WhatsApp.java
│
├── factory
│   └── CanalFactory.java
│
├── singleton
│   └── LogService.java
│
└── main
    └── Main.java
```

## ▶️ Como Executar

### Requisitos:
- Java 17 ou superior
- IntelliJ IDEA (ou outra IDE Java)
- JDK configurado no projeto

### Passo a passo:
1. Clone o repositório:
```bash
git clone https://github.com/GNunnes/designpatterns-mensageria.git
```
2. Abra o projeto no IntelliJ IDEA.
3. Compile o projeto.
4. Execute a classe Main.java.
5. Interaja via terminal:
   - Digite a mensagem
   - Escolha o canal: email, sms ou whatsapp

### Exemplo:

```bash
Digite a mensagem: Olá
Escolha o canal (email, sms, whatsapp): sms
Enviando por SMS: Olá
[LOG]: Mensagem enviada por SMS.
```

## 💡 Possibilidades de Expansão
- Adicionar o padrão Observer para múltiplos listeners no envio de mensagens.
- Implementar o padrão Builder para mensagens mais complexas (com título, prioridade, etc).
- Integrar com APIs reais de envio (Twilio, SendGrid, etc) usando Adapter.

## 📄 Licença

Este projeto está sob a licença MIT.
<br>
Veja o arquivo LICENSE para mais detalhes.
<br>

Desenvolvedor em transição de carreira, apaixonado por tecnologia, qualidade de código e boas práticas. Sempre aprendendo, sempre evoluindo. 🚀

## 👤 Desenvolvido por

Gustavo N. Bezerra - [LinkedIn](https://www.linkedin.com/in/gustavo-nunnes) | [GitHub](https://github.com/GNunnes) |<i>gustavonunnes@hotmail.com</i>


