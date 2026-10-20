package e1q2_notificacoes;

public class NotificacaoPush implements Notificacao {
    private boolean validarDestinatario(String destinatario) {
        return destinatario != null && !destinatario.isBlank();
    }

    @Override
    public void enviar(String destinatario, String mensagem) {
        if (!validarDestinatario(destinatario)) {
            System.out.println("Falha ao enviar Push: destinatario invalido (" + destinatario + ").");
            return;
        }
        System.out.println("[Push] Para: " + destinatario + " | Mensagem: " + mensagem);
    }
}
