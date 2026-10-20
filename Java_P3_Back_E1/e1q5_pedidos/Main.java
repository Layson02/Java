package e1q5_pedidos;

public class Main {
    public static void main(String[] args) {
        PedidoService service = new PedidoService(new PedidoRepositoryMemoria());
        Pedido pedido = service.criarPedido(1L, "Layson", 250.0);

        System.out.println(service.buscarPedido(pedido.getId()).getStatus());
        System.out.println(service.cancelarPedido(1L));
        System.out.println(service.cancelarPedido(1L));

        try {
            service.criarPedido(1L, "Outro cliente", 100.0);
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }

        try {
            service.criarPedido(2L, "Cliente invalido", 0.0);
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
