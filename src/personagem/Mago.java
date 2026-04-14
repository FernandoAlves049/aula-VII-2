package personagem;

public class Mago implements Personagem {

    @Override
    public void atacar() {
        System.out.println("Mago ataca conjurando feitiços com seu Cajado!");
    }

    @Override
    public void defender() {
        System.out.println("Mago cria um escudo mágico protetor!");
    }

    @Override
    public void exibirInfo() {
        System.out.println("Personagem: Mago | Tema: Fantasia");
    }
}
