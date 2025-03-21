package mundosvideojuegos;

import FabricasMundosConcretos.MundoFuturista;
import FabricasMundosConcretos.MundoMedieval;
import FabricasMundosConcretos.MundoPostapocaliptico;

public class MundosVideojuegos {
    public static void main(String[] args) {
        // Crear y mostrar el mundo futurista
        GeneradorMundos mundoFuturista = new GeneradorMundos(new MundoFuturista());
        System.out.println("=== Generado: Mundo Futurista ===");
        mundoFuturista.generarMundo();

        // Crear y mostrar el mundo medieval
        GeneradorMundos mundoMedieval = new GeneradorMundos(new MundoMedieval());
        System.out.println("\n=== Generado: Mundo Medieval ===");
        mundoMedieval.generarMundo();

        // Crear y mostrar el mundo postapocalíptico
        GeneradorMundos mundoPostapocaliptico = new GeneradorMundos(new MundoPostapocaliptico());
        System.out.println("\n=== Generado: Mundo Postapocaliptico ===");
        mundoPostapocaliptico.generarMundo();
    }
}
