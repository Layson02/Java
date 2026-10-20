package e1q2_notificacoes;

public class NotificacaoEmail implements Notificacao {

    private boolean validarDestinatario(String destinatario) {
        return destinatario != null && destinatario.contains("@") && destinatario.contains(".");
    }

    @Override
    public void enviar(String destinatario, String mensagem) {
        if (!validarDestinatario(destinatario)) {
            System.out.println("Falha ao enviar E-mail: endereço de e-mail inválido (" + destinatario + ").");
            return;
        }
        System.out.println("[E-mail] Para: " + destinatario + " | Mensagem: " + mensagem);
    }
}