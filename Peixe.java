
import java.util.Random;

// Classe que representa um peixe do jogo.
class Peixe {
    // Atributos do peixe.
    String nome;
    String raridade;
    int valor;
    private static Random _random = new Random();
    private static String[] _nomes = {
        "Tubarão-branco",
        "Tubarão-martelo",
        "Tubarão-tigre",
        "Tubarão-baleia",
        "Tubarão-mako",
        "Peixe-espada",
        "Peixe-palhaço",
        "Peixe-leão",
        "Peixe-lua",
        "Peixe-serra",
        "Peixe-agulha",
        "Peixe-pedra",
        "Peixe-gato",
        "Peixe-boi",
        "Peixe-papagaio",
        "Peixe-borboleta",
        "Peixe-anjo",
        "Peixe-cofre",
        "Peixe-balão",
        "Peixe-cirurgião",
        "Salmão",
        "Truta",
        "Bacalhau",
        "Atum",
        "Sardinha",
        "Anchova",
        "Arenque",
        "Cavala",
        "Merluza",
        "Linguado",
        "Garoupa",
        "Badejo",
        "Robalo",
        "Dourado",
        "Pargo",
        "Vermelho",
        "Tainha",
        "Corvina",
        "Pescada",
        "Congro",
        "Moreia",
        "Barracuda",
        "Marlim",
        "Agulhão-vela",
        "Bonito",
        "Peixe-voador",
        "Enguia",
        "Raia",
        "Cação",
        "Quimera",
        "Pirarucu",
        "Tambaqui",
        "Pacu",
        "Piranha",
        "Traíra",
        "Tucunaré",
        "Tilápia",
        "Lambari",
        "Piau",
        "Curimbatá",
        "Dourado-do-rio",
        "Pintado",
        "Cachara",
        "Jaú",
        "Pirarara",
        "Piraíba",
        "Matrinxã",
        "Barbado",
        "Surubim",
        "Aruanã",
        "Baiacu",
        "Bagre",
        "Cascudo",
        "Carpa",
        "Koi",
        "Peixe-dourado",
        "Betta",
        "Guppy",
        "Molinésia",
        "Plati",
        "Espada",
        "Neon-tetra",
        "Tetra-cardinal",
        "Acará-bandeira",
        "Acará-disco",
        "Oscar",
        "Ciclídeo",
        "Corydora",
        "Botia",
        "Arraia-de-água-doce",
        "Esturjão",
        "Peixe-elétrico",
        "Poraquê",
        "Candiru",
        "Muçum",
        "Jeju",
        "Tuvira",
        "Saicanga"
    };
    private static String[] _raridade = {
        "Comum",
        "Raro",
        "Epico",
        "Lendario"
    };

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

    public static Peixe CreatPeixe(){
        String nome = _nomes[_random.nextInt(_nomes.length)];

        // Sortear a raridade
        int sorte = _random.nextInt(100);
        int id = 0;
        if(sorte > 75) id = 1;
        else if (sorte > 90) id = 2;
        else if (sorte > 99) id = 3;

        String raridade = _raridade[id];
        int valor = 0;

        switch(raridade){
            case("Comum"):
                valor = 10;
                break;
            case("Raro"):
                valor = 40;
                break;
            case("Epico"):
                valor = 150;
                break;
            case("Lendario"):
                valor = 600;
                break;
        }
        return new Peixe(nome, raridade, valor);
    }
}
