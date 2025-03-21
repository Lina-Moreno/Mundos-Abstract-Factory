package MundoFuturista;

import ClasesAbstractasMundos.Personaje;

public class PersonajeFuturista extends Personaje {
    // Constructor
    public PersonajeFuturista(String nombre, int vida) {
        super(nombre, vida);
    }

    // Implementación del método atacar
    @Override
    public void atacar() {
        System.out.println(getNombre() + " ataca con un laser futurista.");
    }

    // Implementación del método defenderse
    @Override
    public void defenderse() {
        System.out.println(getNombre() + " se defiende con un campo magnetico.");
    }
}