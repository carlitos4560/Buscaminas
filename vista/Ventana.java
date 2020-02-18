import javax.swing.JPanel;
import java.awt.GridLayout;

public class Ventana extends JPanel {

    private Tablero tablero;
    private MatrizBoton matrizBotones;

    public Ventana ( Tablero tablero, Tamanio dimension, EventoMouse eventoMouse ) {

        this.tablero = tablero;
        matrizBotones = new MatrizBoton( dimension );
        crearMatriz ( dimension, eventoMouse );
        eventoMouse.matrizBotones( this.matrizBotones );
        this.setLayout ( new GridLayout ( dimension.getFila(), dimension.getColumna() ) );

    }

    private void crearMatriz ( Tamanio dimension, EventoMouse eventoMouse ) {
        for ( int fila = 0; fila < dimension.getFila(); fila++ ) {
            crearColumna(fila, dimension, eventoMouse);
        }
    }

    private void crearColumna ( int fila, Tamanio dimension, EventoMouse eventoMouse ) {
        for ( int columna = 0; columna < dimension.getColumna(); columna++ ) {
            Boton boton = new Boton ( new Posicion ( fila, columna ) );
            boton.addActionListener( eventoMouse );
            this.add( matrizBotones.agregarBotones ( boton, new Posicion( fila, columna ) ) );
        }
    }
}
