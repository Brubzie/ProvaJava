public class Produto {
    private String saborPizza;
    private String ingredientes;
    private String bebidas;
    private int quantidadeEstocada;

    // Construtor
    public Produto(String saborPizza, String ingredientes, String bebidas, int quantidadeEstocada) {
        this.saborPizza = saborPizza;
        this.ingredientes = ingredientes;
        this.bebidas = bebidas;
        this.quantidadeEstocada = quantidadeEstocada;
    }

    // Getters e Setters
    public String getSaborPizza() {
        return saborPizza;
    }

    public void setSaborPizza(String saborPizza) {
        this.saborPizza = saborPizza;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getBebidas() {
        return bebidas;
    }

    public void setBebidas(String bebidas) {
        this.bebidas = bebidas;
    }

    public int getQuantidadeEstocada() {
        return quantidadeEstocada;
    }

    public void setQuantidadeEstocada(int quantidadeEstocada) {
        this.quantidadeEstocada = quantidadeEstocada;
    }

    public static void main(String[] args) {
        Produto produto = new Produto("Margherita", "Tomate, Queijo Mozzarella", "Coca-Cola", 100);
        System.out.println("Sabor da pizza: " + produto.getSaborPizza());
        System.out.println("Ingredientes: " + produto.getIngredientes());
        System.out.println("Bebidas: " + produto.getBebidas());
        System.out.println("Quantidade em estoque: " + produto.getQuantidadeEstocada());
    }
}