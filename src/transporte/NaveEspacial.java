package transporte;

public class NaveEspacial implements Transporte {

    @Override
    public void mover() {
        System.out.println("Nave Espacial acelera na velocidade da luz!");
    }

    @Override
    public void parar() {
        System.out.println("Nave Espacial ativa freios gravitacionais.");
    }

    @Override
    public void exibirInfo() {
        System.out.println("Transporte: Nave Espacial | Tipo: Veículo Espacial");
    }
}
