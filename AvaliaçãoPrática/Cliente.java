import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Cliente {
    public static void main(String[] args) {

        LocalDateTime agora = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        
        long endereco = 13606620;
        long cpf = 111222333;
        long idPgto = 123456789;

        String dataHoraFormatada = agora.format(formatter);
        String formaPagto = "Dinheiro";
        String nome = "Bruno";
        String tipoPedido = "Pizza (salgada)";
        String pedido = "Pizza de quatro queijos";
        String bordaPizza = "Catupiry";

        System.out.println("Nome do Cliente: " + nome);
        System.out.println("CEP: " + endereco);
        System.out.println("Forma de Pagamento: " + formaPagto);
        System.out.println("Id do Pagamento: " + idPgto);
        System.out.println("CPF: " + cpf);
        System.out.println("Tipo do Pedido: " + tipoPedido);
        System.out.println("Pedido: " + pedido);
        System.out.println("Borda: " + bordaPizza);
        System.out.println("Data e Hora do Pedido: " + dataHoraFormatada);
        
    }
}