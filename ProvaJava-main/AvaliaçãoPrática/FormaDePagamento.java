public class FormaDePagamento {
    private String saborPizza;
    private String bebidas;
    private String ingredientes;
    private int quantidadeEstocada;

    // Construtor
    public FormaDePagamento(String saborPizza, String bebidas, String ingredientes, int quantidadeEstocada) {
        this.saborPizza = saborPizza;
        this.bebidas = bebidas;
        this.ingredientes = ingredientes;
        this.quantidadeEstocada = quantidadeEstocada;
    }

    // Getters e Setters
    public String getSaborPizza() {
        return saborPizza;
    }

    public void setSaborPizza(String saborPizza) {
        this.saborPizza = saborPizza;
    }

    public String getBebidas() {
        return bebidas;
    }

    public void setBebidas(String bebidas) {
        this.bebidas = bebidas;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public int getQuantidadeEstocada() {
        return quantidadeEstocada;
    }

    public void setQuantidadeEstocada(int quantidadeEstocada) {
        this.quantidadeEstocada = quantidadeEstocada;
    }

    public static void main(String[] args) {
        FormaDePagamento formaDePagamento = new FormaDePagamento("Margherita", "Coca-Cola", "Tomate, Queijo Mozzarella", 100);
        System.out.println("Sabor da pizza: " + formaDePagamento.getSaborPizza());
        System.out.println("Bebidas: " + formaDePagamento.getBebidas());
        System.out.println("Ingredientes: " + formaDePagamento.getIngredientes());
        System.out.println("Quantidade em estoque: " + formaDePagamento.getQuantidadeEstocada());
    }
}
