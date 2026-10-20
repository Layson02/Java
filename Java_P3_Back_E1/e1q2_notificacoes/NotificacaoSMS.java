package e1q2_notificacoes;

public class NotificacaoSMS implements Notificacao {

    private boolean validarDestinatario(String destinatario) {
        // Valida se não é nulo e contém apenas números/espaços
        return destinatario != null && destinatario.matches("\\d+");
    }

    @Override
    public void enviar(String destinatario, String mensagem) {
        if (!validarDestinatario(destinatario)) {
            System.out.println("Falha ao enviar SMS: número de telefone inválido (" + destinatario + ").");
            return;
        }
        System.out.println("[SMS] Para: " + destinatario + " | Mensagem: " + mensagem);
    }
}