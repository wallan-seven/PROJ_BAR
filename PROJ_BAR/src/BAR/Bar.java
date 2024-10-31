package BAR;

public class Bar {
    double PRECO_INGRESSO_HOMEM = 10.0;
    double PRECO_INGRESSO_MULHER = 8.0;
    double PRECO_CERVEJA = 5.0;
    double PRECO_REFRIGERANTE = 3.0;
    double PRECO_ESPETINHO = 7.0;
    double TAXA_COUVERT = 4.0;
    double LIMITE_CONSUMO_PARA_ISENCAO_COUVERT = 30.0;

    public double calcularIngresso(Cliente cliente) {
        return cliente.getSexo().equalsIgnoreCase("M") ? PRECO_INGRESSO_HOMEM : PRECO_INGRESSO_MULHER;
    }

    public double calcularConsumo(Cliente cliente) {
        double consumoCerveja = cliente.getQtdCervejas() * PRECO_CERVEJA;
        double consumoRefrigerante = cliente.getQtdRefrigerantes() * PRECO_REFRIGERANTE;
        double consumoEspetinho = cliente.getQtdEspetinhos() * PRECO_ESPETINHO;
        return consumoCerveja + consumoRefrigerante + consumoEspetinho;
    }

    public double calcularCouvert(double consumoTotal) {
        return consumoTotal > LIMITE_CONSUMO_PARA_ISENCAO_COUVERT ? 0.0 : TAXA_COUVERT;
    }

    public double calcularTotal(Cliente cliente) {
        double ingresso = calcularIngresso(cliente);
        double consumo = calcularConsumo(cliente);
        double couvert = calcularCouvert(consumo);
        return ingresso + consumo + couvert;
    }

    public void gerarRelatorio(Cliente cliente) {
        double ingresso = calcularIngresso(cliente);
        double consumo = calcularConsumo(cliente);
        double couvert = calcularCouvert(consumo);
        double total = calcularTotal(cliente);

        // Exibe o relatório no formato desejado
        System.out.println("### RELATÓRIO ###");
        System.out.printf("Consumo = R$ %.2f%n", consumo);
        if (couvert == 0.0) {
            System.out.println("Isento de Couvert");
        } else {
            System.out.printf("Couvert = R$ %.2f%n", couvert);
        }
        System.out.printf("Ingresso = R$ %.2f%n", ingresso);
        System.out.printf("Valor a pagar = R$ %.2f%n", total);
    }
}