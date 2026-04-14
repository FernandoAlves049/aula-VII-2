package fabrica;

import personagem.Personagem;
import arma.Arma;
import transporte.Transporte;

public interface FabricaTema {
    Personagem criarPersonagem();
    Arma criarArma();
    Transporte criarTransporte();
}
