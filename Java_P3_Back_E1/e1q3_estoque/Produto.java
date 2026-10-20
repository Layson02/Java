package e1q3_estoque;

public class Produto {
    private final Long id;
    private final String nome;
    private final double preco;
    private int estoque;
    private boolean ativo;

    public Produto(Long id, String nome, double preco, int estoqueInicial) {
        if (id == null || nome == null || nome.isBlank() || preco < 0 || estoqueInicial < 0) {
            throw new IllegalArgumentException("Dados do produto invalidos.");
        }
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoqueInicial;
        this.ativo = true;
    }

    private boolean quantidadeValida(int quantidade) {
        return quantidade > 0;
    }

    private boolean possuiEstoqueSuficiente(int quantidade) {
        return estoque >= quantidade;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int consultarEstoque() {
        return estoque;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void ativar() {
        ativo = true;
    }

    public void desativar() {
        ativo = false;
    }

    public boolean adicionarEstoque(int quantidade) {
        if (!ativo || !quantidadeValida(quantidade)) {
            return false;
        }
        estoque += quantidade;
        return true;
    }

    public boolean removerEstoque(int quantidade) {
        if (!ativo || !quantidadeValida(quantidade) || !possuiEstoqueSuficiente(quantidade)) {
            return false;
        }
        estoque -= quantidade;
        return true;
    }
}
