public class Cliente {
    private String nome;
    private String endereco;
    private String solicitaPizza;
    private String selecionaFormaPagamento;

    // Construtor
    public Cliente(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    // Métodos
    public void solicitaPizza(String pizza) {
        this.solicitaPizza = pizza;
    }

    public void selecionaFormaPagamento(String formaPagamento) {
        this.selecionaFormaPagamento = formaPagamento;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public static void main(String[] args) {
        Cliente cliente = new Cliente("João", "Rua das Flores, 123");
        cliente.solicitaPizza("Margherita");
        cliente.selecionaFormaPagamento("Cartão de crédito");
        System.out.println("Nome do cliente: " + cliente.getNome());
        System.out.println("Endereço do cliente: " + cliente.getEndereco());
        System.out.println("Pizza solicitada: " + cliente.solicitaPizza);
        System.out.println("Forma de pagamento selecionada: " + cliente.selecionaFormaPagamento);
    }
}