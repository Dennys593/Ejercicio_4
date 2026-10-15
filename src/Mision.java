
public class Mision {
    private String nombre;
    private int nivelAmenaza;
    private int heroes;

    // Constructor por defecto: valores predeterminados
    public Mision() {
        this("Sin asignar", 1, 0);
    }

    // Sobrecargado: solo el nombre
    public Mision(String nombre) {
        this(nombre, 1, 0);
    }

    // Sobrecargado: nombre y nivel de amenaza
    public Mision(String nombre, int nivelAmenaza) {
        this(nombre, nivelAmenaza, 0);
    }

    // Constructor principal: el unico que asigna y valida
    public Mision(String nombre, int nivelAmenaza, int heroes) {
        this.nombre = nombre;
        if (nivelAmenaza < 1) {
            this.nivelAmenaza = 1;
        } else if (nivelAmenaza > 10) {
            this.nivelAmenaza = 10;
        } else {
            this.nivelAmenaza = nivelAmenaza;
        }
        if (heroes < 0) {
            this.heroes = 0;
        } else {
            this.heroes = heroes;
        }
    }

    // Constructor de copia: crea una mision nueva e independiente
    public Mision(Mision otra) {
        this(otra.nombre, otra.nivelAmenaza, otra.heroes);
    }

    // Suma heroes solo si la cantidad es positiva
    public void reforzar(int cantidad) {
        if (cantidad > 0) {
            heroes += cantidad;
        }
    }

    public void mostrar() {
        System.out.println(nombre + " | amenaza " + nivelAmenaza + " | heroes " + heroes);
    }
}
