
public class Main {

    public static void main(String[] args) {
        System.out.println("===== TABLERO DE MISIONES =====");
        Mision m1 = new Mision();                                   // por defecto
        Mision m2 = new Mision("Rescate en Asgard");                // sobrecargado (1 parametro)
        Mision m3 = new Mision("Defensa de Wakanda", 8);            // sobrecargado (2 parametros)
        Mision m4 = new Mision("Asalto a Latveria", 15, 4);         // principal: amenaza se ajusta a 10
        Mision m5 = new Mision("Patrulla fantasma", 5, -2);         // principal: heroes se ajusta a 0
        Mision m6 = new Mision(m4);                                 // copia independiente de m4
        m6.reforzar(3);                                             // solo cambia m6
        m1.mostrar();
        m2.mostrar();
        m3.mostrar();
        m4.mostrar();
        m5.mostrar();
        m6.mostrar();
    }
}
 