package fabrica;

import personagem.Androide;
import personagem.Personagem;
import arma.Arma;
import arma.Laser;
import transporte.NaveEspacial;
import transporte.Transporte;

public class FabricaFuturista implements FabricaTema {

    @Override
    public Personagem criarPersonagem() {
        return new Androide();
    }

    @Override
    public Arma criarArma() {
        return new Laser();
    }

    @Override
    public Transporte criarTransporte() {
        return new NaveEspacial();
    }
}
