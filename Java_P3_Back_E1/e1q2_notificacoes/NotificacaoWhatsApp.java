package e1q2_notificacoes;

public class NotificacaoWhatsApp implements Notificacao {

    private boolean validarDestinatario(String destinatario) {
        // Valida se começa com código de país/número válido (ex: pelo menos 10 dígitos)
        return destinatario != null && destinatario.length() >= 10 && destinatario.matches("\\d+");
    }

    @Override
    public void enviar(String destinatario, String mensagem) {
        if (!validarDestinatario(destinatario)) {
            System.out.println("Falha ao enviar WhatsApp: número incompatível (" + destinatario + ").");
            return;
        }
        System.out.println("[WhatsApp] Para: " + destinatario + " | Mensagem: " + mensagem);
    }
}