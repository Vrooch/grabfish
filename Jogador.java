// Classe que representa o jogador.
class Jogador {
    // Atributos do jogador.
    String nome;
    int dinheiro;
    int nivelVara;
    int durabilidadeVara;
    int durabilidadeMaxima;

    // Construtor: define os valores iniciais do jogador.
    Jogador(String nomeJogador) {
        nome = nomeJogador;
        dinheiro = 100;
        nivelVara = 1;
        durabilidadeMaxima = 100;
        durabilidadeVara = 100;
    }

    // Metodo para receber dinheiro depois de pescar.
    void receberDinheiro(int valor) {
        dinheiro = dinheiro + valor;
    }

    // Metodo para diminuir a durabilidade da vara.
    void desgastarVara(int desgaste) {
        durabilidadeVara = durabilidadeVara - desgaste;

        // [EXTRA] if verifica uma condicao.
        if (durabilidadeVara < 0) {
            durabilidadeVara = 0;
        }
    }

    // Metodo para consertar a vara.
    void consertarVara() {
        durabilidadeVara = durabilidadeMaxima;
    }

    // Metodo para evoluir a vara.
    void evoluirVara() {
        nivelVara = nivelVara + 1;
        durabilidadeMaxima = durabilidadeMaxima + 25;
        durabilidadeVara = durabilidadeMaxima;
    }

    // Metodo que mostra os dados atuais do jogador.
    void mostrarStatus() {
        System.out.println();
        System.out.println("------ STATUS ------");
        System.out.println("Jogador: " + nome);
        System.out.println("Dinheiro: R$ " + dinheiro);
        System.out.println("Nivel da vara: " + nivelVara);
        System.out.println("Durabilidade: " + durabilidadeVara + "/" + durabilidadeMaxima);
    }
}
