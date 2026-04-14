package transporte;

public class Cavalo implements Transporte {

    @Override
    public void mover() {
        System.out.println("Cavalo galopa velozmente pelo campo de batalha!");
    }

    @Override
    public void parar() {
        System.out.println("Cavalo para e relincha.");
    }

    @Override
    public void exibirInfo() {
        System.out.println("Transporte: Cavalo | Tipo: Animal");
    }
}
