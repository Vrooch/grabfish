// [EXTRA] Scanner e uma classe pronta do Java usada para ler o teclado.
import java.util.Scanner;

// [EXTRA] Random e uma classe pronta do Java usada para gerar numeros aleatorios.
import java.util.Random;

public class JogoPesca {

    // [EXTRA] O metodo main e o ponto inicial de um programa Java.
    // String[] args faz parte do formato padrao do main.
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        // Criacao de um objeto da classe Jogador usando o construtor.
        Jogador jogador = new Jogador("Pescador");

        int opcao = 0;

        System.out.println("============================");
        System.out.println("       JOGO DE PESCA");
        System.out.println("============================");

        // [EXTRA] while repete o jogo ate o usuario escolher sair.
        while (opcao != 4) {

            jogador.mostrarStatus();

            System.out.println();
            System.out.println("1 - Pescar");
            System.out.println("2 - Evoluir vara");
            System.out.println("3 - Consertar vara");
            System.out.println("4 - Sair");
            System.out.print("Escolha: ");

            opcao = teclado.nextInt();

            // [EXTRA] switch escolhe o que fazer de acordo com a opcao digitada.
            switch (opcao) {

                case 1:
                    // [EXTRA] if verifica se a vara ainda pode ser usada.
                    if (jogador.durabilidadeVara <= 0) {
                        System.out.println("Sua vara esta quebrada. Conserte primeiro!");
                        break;
                    }

                    int sorteio = random.nextInt(100) + 1;
                    Peixe peixe;

                    // O sorteio define qual objeto Peixe sera criado.
                    if (sorteio <= 70) {
                        peixe = new Peixe("Tilapia", "Comum", 10);
                    } else if (sorteio <= 90) {
                        peixe = new Peixe("Dourado", "Raro", 40);
                    } else if (sorteio <= 98) {
                        peixe = new Peixe("Atum", "Epico", 150);
                    } else {
                        peixe = new Peixe("Marlin", "Lendario", 600);
                    }

                    // Double/double: aumenta o valor do peixe conforme o nivel da vara.
                    double multiplicador = 1.0 + (jogador.nivelVara * 0.10);

                    // [EXTRA] (int) transforma o resultado double em int.
                    int valorFinal = (int) (peixe.valor * multiplicador);

                    jogador.receberDinheiro(valorFinal);

                    int desgaste = random.nextInt(5) + 3;
                    jogador.desgastarVara(desgaste);

                    System.out.println();
                    System.out.println("Voce pescou!");
                    peixe.mostrarDados();
                    System.out.println("Valor recebido: R$ " + valorFinal);
                    System.out.println("Desgaste da vara: " + desgaste);
                    break;

                case 2:
                    int custoEvoluir = 150 * jogador.nivelVara;

                    if (jogador.dinheiro >= custoEvoluir) {
                        jogador.dinheiro = jogador.dinheiro - custoEvoluir;
                        jogador.evoluirVara();

                        System.out.println("Vara evoluida!");
                        System.out.println("Novo nivel: " + jogador.nivelVara);
                    } else {
                        System.out.println("Dinheiro insuficiente.");
                        System.out.println("Custo: R$ " + custoEvoluir);
                    }
                    break;

                case 3:
                    int custoConserto = 40 * jogador.nivelVara;

                    if (jogador.dinheiro >= custoConserto) {
                        jogador.dinheiro = jogador.dinheiro - custoConserto;
                        jogador.consertarVara();

                        System.out.println("Vara consertada!");
                    } else {
                        System.out.println("Dinheiro insuficiente.");
                        System.out.println("Custo: R$ " + custoConserto);
                    }
                    break;

                case 4:
                    System.out.println("Obrigado por jogar!");
                    break;

                default:
                    System.out.println("Opcao invalida.");
            }
        }

        teclado.close();
    }
}
