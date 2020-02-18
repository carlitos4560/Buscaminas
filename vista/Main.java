
public class Main {

    public static void main( String arg[] ) {
        Buscaminas buscaminas = new Buscaminas();
        buscaminas.iniciarJuego();
        JuegoVista juego = new JuegoVista( buscaminas);
    }
}
