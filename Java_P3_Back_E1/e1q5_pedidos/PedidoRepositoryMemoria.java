package e1q5_pedidos;

import java.util.ArrayList;

public class PedidoRepositoryMemoria implements PedidoRepository {
    private final ArrayList<Pedido> pedidos = new ArrayList<>();

    @Override
    public void salvar(Pedido pedido) {
        pedidos.add(pedido);
    }

    @Override
    public Pedido buscarPorId(Long id) {
        for (Pedido pedido : pedidos) {
            if (pedido.getId().equals(id)) {
                return pedido;
            }
        }
        return null;
    }
}
