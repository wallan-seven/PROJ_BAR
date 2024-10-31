package BAR;

public class Main {

	public static void main(String[] args) {
		

        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Digite o sexo do cliente (F ou M): ");
        String sexo = sc.nextLine();

        System.out.print("Quantas cervejas consumidas: ");
        int qtdBreja = sc.nextInt();

        System.out.print("Quantos refrigerantes consumidos: ");
        int qtdRefri = sc.nextInt();

        System.out.print("Quantos espetinhos consumidos: ");
        int qtdEspetinhos = sc.nextInt();

        Cliente cliente = new Cliente(sexo, qtdBreja, qtdRefri, qtdEspetinhos);
        Bar bar = new Bar();

        bar.gerarRelatorio(cliente);

	}

}
