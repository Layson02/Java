package e1q5_pedidos;

public class PedidoService {
    private final PedidoRepository pedidoRepository;

    public PedidoService(PedidoRepository pedidoRepository) {
        if (pedidoRepository == null) {
            throw new IllegalArgumentException("O repositorio e obrigatorio.");
        }
        this.pedidoRepository = pedidoRepository;
    }

    private boolean valorValido(double valorTotal) {
        return valorTotal > 0;
    }

    private boolean identificadorDisponivel(Long id) {
        return id != null && pedidoRepository.buscarPorId(id) == null;
    }

    public Pedido criarPedido(Long id, String cliente, double valorTotal) {
        if (!valorValido(valorTotal)) {
            throw new IllegalArgumentException("O valor do pedido deve ser maior que zero.");
        }
        if (!identificadorDisponivel(id)) {
            throw new IllegalArgumentException("Identificador duplicado ou invalido.");
        }
        Pedido pedido = new Pedido(id, cliente, valorTotal);
        pedidoRepository.salvar(pedido);
        return pedido;
    }

    public Pedido buscarPedido(Long id) {
        return pedidoRepository.buscarPorId(id);
    }

    public boolean cancelarPedido(Long id) {
        Pedido pedido = buscarPedido(id);
        if (pedido == null || "CANCELADO".equals(pedido.getStatus())) {
            return false;
        }
        pedido.cancelar();
        return true;
    }
}
