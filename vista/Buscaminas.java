import javax.swing.JFrame;

public class Buscaminas {

    private JFrame frame;

    public void iniciarJuego() {
        this.frame = new JFrame("Busca Minas");
        int maximoBomba = 50;
        Tamanio dimension = new Tamanio(15,15);

        Tablero tablero = new Tablero( dimension, maximoBomba);
        Juego juego = new Juego ( tablero, dimension );

        EventoMouse eventoMouse = new EventoMouse( juego );
        Ventana ventana = new Ventana( tablero, dimension, eventoMouse );
        this.frame.add( ventana );
        this.frame.setSize( 500,500 );
        this.frame.setLocationRelativeTo( null );
        this.frame.setVisible( true );
    }

    public void cerra(){
//        this.frame.setVisible( false );
        this.frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    }
}

