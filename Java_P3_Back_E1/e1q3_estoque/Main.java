package e1q3_estoque;

public class Main {
    public static void main(String[] args) {
        EstoqueService estoque = new EstoqueService();
        Produto produto = new Produto(1L, "Teclado", 120.0, 10);
        estoque.adicionarProduto(produto);

        System.out.println(estoque.adicionarEstoque(1L, 5));
        System.out.println(estoque.removerEstoque(1L, 3));
        System.out.println(estoque.removerEstoque(1L, 20));
        System.out.println(estoque.adicionarEstoque(1L, 0));

        produto.desativar();
        System.out.println(estoque.adicionarEstoque(1L, 2));
        System.out.println(estoque.consultarEstoque(1L));
    }
}
