package mundosvideojuegos;

import ClasesAbstractasMundos.Estructura;
import ClasesAbstractasMundos.Personaje;
import ClasesAbstractasMundos.Arma;

public class GeneradorMundos {
    // Atributo para almacenar la fábrica concreta
    private FabricaMundos fabrica;

    // Constructor que recibe una fábrica concreta
    public GeneradorMundos(FabricaMundos fabrica) {
        this.fabrica = fabrica;
    }

    // Método para generar y mostrar el mundo
    public void generarMundo() {
        // Crear los objetos usando la fábrica
        Personaje personaje = fabrica.crearPersonaje();
        Estructura estructura = fabrica.crearEstructura();
        Arma arma = fabrica.crearArma();

        // Mostrar los detalles del mundo
        System.out.println("=== Generando Mundo ===");
        personaje.atacar();
        System.out.println("Estructura: " + estructura.obtenerUso());
        System.out.println("Arma: " + arma.obtenerUso());
        System.out.println("=======================");
    }
}