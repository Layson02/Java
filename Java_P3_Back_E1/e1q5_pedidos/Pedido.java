package e1q5_pedidos;

public class Pedido {
    private final Long id;
    private final String cliente;
    private final double valorTotal;
    private String status;

    public Pedido(Long id, String cliente, double valorTotal) {
        if (id == null || cliente == null || cliente.isBlank() || valorTotal <= 0) {
            throw new IllegalArgumentException("Dados do pedido invalidos.");
        }
        this.id = id;
        this.cliente = cliente;
        this.valorTotal = valorTotal;
        this.status = "CRIADO";
    }

    public Long getId() {
        return id;
    }

    public String getCliente() {
        return cliente;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public String getStatus() {
        return status;
    }

    void cancelar() {
        status = "CANCELADO";
    }
}
