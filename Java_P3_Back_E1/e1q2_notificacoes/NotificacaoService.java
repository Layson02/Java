package e1q2_notificacoes;

public class NotificacaoService {
    private final Notificacao notificacao;

    public NotificacaoService(Notificacao notificacao) {
        if (notificacao == null) {
            throw new IllegalArgumentException("A notificacao e obrigatoria.");
        }
        this.notificacao = notificacao;
    }

    public void enviar(String destinatario, String mensagem) {
        notificacao.enviar(destinatario, mensagem);
    }
}
