import java.util.Scanner;

public class Executa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner captura = new Scanner(System.in);

		int Pedido;

		System.out.println("******Clodualdo Lanches******");
		System.out.println(" Card�pio dos Lanches ");
		System.out.println("1 - X-Bacon ");
		System.out.println("2 - X-Salada ");
		System.out.println("3 - X-Picanha ");
		System.out.println("4 - X-Tudo ");

		System.out.println("Digite o n�mero do seu lanche :");
		Pedido = captura.nextInt();

		switch (Pedido) {

		case 1:
			System.out.println("Vo�� escolheu o X-Bacon.");
			System.out.println("O pre�o do X-Bacon � : R$ 20,00.");
			break;
		case 2:
			System.out.println("Voc� escolheu o X-Salada.");
			System.out.println("O pre�o do X-Salada � : R$ 15,00.");
			break;
		case 3:
			System.out.println("Vo�� escolheu o X-Picanha.");
			System.out.println("O pre�o do X-Picanha � : R$ 22,00.");
			break;
		case 4:
			System.out.println("Vo�� escolheu o X-Tudo.");
			System.out.println("O pre�o do X-Tudo � : R$ 30,00.");
			break;
		default:
			System.out.println("ERRO!!! Vo�� escolheu um que n�o est� no card�pio !");
			break;

		}
	}

}
