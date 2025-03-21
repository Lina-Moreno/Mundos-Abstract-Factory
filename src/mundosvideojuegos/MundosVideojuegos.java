package mundosvideojuegos;

import FabricasMundosConcretos.MundoFuturista;
import FabricasMundosConcretos.MundoMedieval;
import FabricasMundosConcretos.MundoPostapocaliptico;

public class MundosVideojuegos {
    public static void main(String[] args) {
        GeneradorMundos mundoFuturista = new GeneradorMundos(new MundoFuturista());
        System.out.println("=== Generado: Mundo Futurista ===");
        mundoFuturista.generarMundo();

        GeneradorMundos mundoMedieval = new GeneradorMundos(new MundoMedieval());
        System.out.println("\n=== Generado: Mundo Medieval ===");
        mundoMedieval.generarMundo();

        GeneradorMundos mundoPostapocaliptico = new GeneradorMundos(new MundoPostapocaliptico());
        System.out.println("\n=== Generado: Mundo Postapocaliptico ===");
        mundoPostapocaliptico.generarMundo();
    }
}
