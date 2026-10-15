
public class Main {

    public static void main(String[] args) {
        System.out.println("===== TABLERO DE MISIONES =====");
        Mision m1 = new Mision();
        Mision m2 = new Mision("Rescate en Asgard");
        Mision m3 = new Mision("Defensa de Wakanda", 8);
        Mision m4 = new Mision("Asalto a Latveria", 15, 4);
        Mision m5 = new Mision("Patrulla fantasma", 5, -2);
        Mision m6 = new Mision(m4);
        m6.reforzar(3);
        m1.mostrar();
        m2.mostrar();
        m3.mostrar();
        m4.mostrar();
        m5.mostrar();
        m6.mostrar();
    }
}
 