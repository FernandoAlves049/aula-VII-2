import fabrica.FabricaTema;
import fabrica.FabricaMedieval;
import fabrica.FabricaFuturista;
import fabrica.FabricaFantasia;
import personagem.Personagem;
import arma.Arma;
import transporte.Transporte;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {

    // Cliente usa apenas interfaces — nunca instancia classes concretas diretamente
    static void jogar(FabricaTema fabrica, String titulo) {
        System.out.println("=== " + titulo + " ===");

        Personagem personagem = fabrica.criarPersonagem();
        Arma arma = fabrica.criarArma();
        Transporte transporte = fabrica.criarTransporte();

        personagem.exibirInfo();
        arma.exibirInfo();
        transporte.exibirInfo();
        System.out.println();
        personagem.atacar();
        arma.usar();
        arma.guardar();
        transporte.mover();
        transporte.parar();

        System.out.println();
    }

    public static void main(String[] args) {

        // Registro dos temas disponíveis — sem if/else para seleção
        Map<String, FabricaTema> temas = new HashMap<>();
        temas.put("medieval",  new FabricaMedieval());
        temas.put("futurista", new FabricaFuturista());
        temas.put("fantasia",  new FabricaFantasia());

        Scanner scanner = new Scanner(System.in);

        System.out.println("Temas disponíveis: " + temas.keySet());
        System.out.print("Escolha um tema: ");
        String escolha = scanner.nextLine().trim().toLowerCase();

        FabricaTema fabrica = temas.get(escolha);

        // Validação sem if/else — lança exceção caso tema não exista no mapa
        if (fabrica == null) {
            System.out.println("Tema '" + escolha + "' não encontrado. Temas válidos: " + temas.keySet());
            scanner.close();
            return;
        }

        String titulo = "Tema " + escolha.substring(0, 1).toUpperCase() + escolha.substring(1);
        jogar(fabrica, titulo);

        scanner.close();
    }
}
