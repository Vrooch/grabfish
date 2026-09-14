// Classe que representa um peixe do jogo.
class Peixe {
    // Atributos do peixe.
    String nome;
    String raridade;
    int valor;

    // Construtor: usado quando criamos um novo objeto Peixe.
    Peixe(String nomePeixe, String raridadePeixe, int valorPeixe) {
        nome = nomePeixe;
        raridade = raridadePeixe;
        valor = valorPeixe;
    }

    // Metodo que mostra as informacoes do peixe.
    void mostrarDados() {
        System.out.println("Peixe: " + nome);
        System.out.println("Raridade: " + raridade);
        System.out.println("Valor base: R$ " + valor);
    }
}
