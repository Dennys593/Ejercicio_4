
public class Mision {
    private String nombre;
    private int nivelAmenaza;
    private int heroes;

    public Mision() {
        this("Sin asignar", 1, 0);
    }

    public Mision(String nombre) {
        this(nombre, 1, 0);
    }

    public Mision(String nombre, int nivelAmenaza) {
        this(nombre, nivelAmenaza, 0);
    }

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

    public Mision(Mision otra) {
        this(otra.nombre, otra.nivelAmenaza, otra.heroes);
    }

    public void reforzar(int cantidad) {
        if (cantidad > 0) {
            heroes += cantidad;
        }
    }

    public void mostrar() {
        System.out.println(nombre + " | amenaza " + nivelAmenaza + " | heroes " + heroes);
    }
}
