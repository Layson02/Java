package e1q3_estoque;

import java.util.ArrayList;
import java.util.List;

public class EstoqueService {
    private final ArrayList<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(Produto produto) {
        if (produto == null || buscarPorId(produto.getId()) != null) {
            throw new IllegalArgumentException("Produto nulo ou identificador duplicado.");
        }
        produtos.add(produto);
    }

    public Produto buscarPorId(Long id) {
        for (Produto produto : produtos) {
            if (produto.getId().equals(id)) {
                return produto;
            }
        }
        return null;
    }

    public boolean adicionarEstoque(Long id, int quantidade) {
        Produto produto = buscarPorId(id);
        return produto != null && produto.adicionarEstoque(quantidade);
    }

    public boolean removerEstoque(Long id, int quantidade) {
        Produto produto = buscarPorId(id);
        return produto != null && produto.removerEstoque(quantidade);
    }

    public int consultarEstoque(Long id) {
        Produto produto = buscarPorId(id);
        if (produto == null) {
            throw new IllegalArgumentException("Produto nao encontrado.");
        }
        return produto.consultarEstoque();
    }

    public List<Produto> listarProdutos() {
        return List.copyOf(produtos);
    }
}
