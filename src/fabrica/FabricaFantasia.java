package fabrica;

import personagem.Mago;
import personagem.Personagem;
import arma.Arma;
import arma.Cajado;
import transporte.TapeteVoador;
import transporte.Transporte;

public class FabricaFantasia implements FabricaTema {

    @Override
    public Personagem criarPersonagem() {
        return new Mago();
    }

    @Override
    public Arma criarArma() {
        return new Cajado();
    }

    @Override
    public Transporte criarTransporte() {
        return new TapeteVoador();
    }
}
