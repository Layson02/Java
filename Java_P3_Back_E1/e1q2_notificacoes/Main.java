package e1q2_notificacoes;

public class Main {
    public static void main(String[] args) {
        NotificacaoService email = new NotificacaoService(new NotificacaoEmail());
        NotificacaoService sms = new NotificacaoService(new NotificacaoSMS());
        NotificacaoService whatsapp = new NotificacaoService(new NotificacaoWhatsApp());
        NotificacaoService push = new NotificacaoService(new NotificacaoPush());

        email.enviar("cliente@email.com", "Pedido confirmado.");
        sms.enviar("5511999999999", "Pedido enviado.");
        whatsapp.enviar("5511988888888", "Pedido entregue.");
        push.enviar("cliente-app", "Nova promocao disponivel.");
    }
}
