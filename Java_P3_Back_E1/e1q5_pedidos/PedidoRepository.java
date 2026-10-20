package e1q5_pedidos;

public interface PedidoRepository {
    void salvar(Pedido pedido);
    Pedido buscarPorId(Long id);
}
