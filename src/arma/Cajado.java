package arma;

public class Cajado implements Arma {

    @Override
    public void usar() {
        System.out.println("Cajado lança uma rajada mágica devastadora!");
    }

    @Override
    public void guardar() {
        System.out.println("Mago guarda o Cajado.");
    }

    @Override
    public void exibirInfo() {
        System.out.println("Arma: Cajado | Tipo: Magia");
    }
}
