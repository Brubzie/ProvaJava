class ItemDoPedido {
   private String saborPizza;
   private String formaPagamento;
   private double valorPedido;
   private double valorEntrega;
   private int quantidadeEstocada;
   private String ingredientes;
   private String bebidas;

   public ItemDoPedido(String saborPizza, String formaPagamento, double valorPedido, double valorEntrega, int quantidadeEstocada, String ingredientes, String bebidas) {
      this.saborPizza = saborPizza;
      this.formaPagamento = formaPagamento;
      this.valorPedido = valorPedido;
      this.valorEntrega = valorEntrega;
      this.quantidadeEstocada = quantidadeEstocada; // Adicionado
      this.ingredientes = ingredientes; // Adicionado
      this.bebidas = bebidas; // Adicionado
   }

   public void requisicaoProduto() {
    if (quantidadeEstocada > 0) {
        quantidadeEstocada--;
        System.out.println("Produto requisitado: " + saborPizza);
        System.out.println("Ingredientes: " + ingredientes);
        System.out.println("Bebida: " + bebidas);
        System.out.println("Quantidade restante em estoque: " + quantidadeEstocada);
    } else {
        System.out.println("Desculpe, o produto está fora de estoque.");
    }
   }


   public double retornaValorTotal() {
      return this.valorPedido + this.valorEntrega;
   }

   public String getSaborPizza() {
      return this.saborPizza;
   }

   public void setSaborPizza(String saborPizza) {
      this.saborPizza = saborPizza;
   }

   public String getFormaPagamento() {
      return this.formaPagamento;
   }

   public void setFormaPagamento(String formaPagamento) {
      this.formaPagamento = formaPagamento;
   }

   public double getValorPedido() {
      return this.valorPedido;
   }

   public void setValorPedido(double valorPedido) {
      this.valorPedido = valorPedido;
   }

   public double getValorEntrega() {
      return this.valorEntrega;
   }

   public void setValorEntrega(double valorEntrega) {
      this.valorEntrega = valorEntrega;
   }

   public static void main(String[] args) {
      ItemDoPedido item = new ItemDoPedido("Margherita", "Cartão de crédito", 20.0, 5.0, 10, "Tomate, Queijo Mozzarella", "Coca-Cola");
      item.requisicaoProduto();
      System.out.println("Sabor da pizza: " + item.getSaborPizza());
      System.out.println("Forma de pagamento: " + item.getFormaPagamento());
      System.out.println("Valor do pedido: " + item.getValorPedido());
      System.out.println("Valor da entrega: " + item.getValorEntrega());
      System.out.println("Valor total: " + item.retornaValorTotal());
   }
}