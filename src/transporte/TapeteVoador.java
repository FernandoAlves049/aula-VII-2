package transporte;

public class TapeteVoador implements Transporte {

    @Override
    public void mover() {
        System.out.println("Tapete Voador eleva-se e surfa pelos céus mágicos!");
    }

    @Override
    public void parar() {
        System.out.println("Tapete Voador pousa suavemente com uma brisa encantada.");
    }

    @Override
    public void exibirInfo() {
        System.out.println("Transporte: Tapete Voador | Tipo: Magia");
    }
}
