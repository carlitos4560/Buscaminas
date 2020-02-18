import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.List;

public class EventoMouse implements ActionListener {

    private Juego juego;
    private MatrizBoton matrizBoton;

    public EventoMouse( Juego juego ) {
        this. juego = juego;
        this.matrizBoton = null;
    }

    @Override
    public void actionPerformed ( ActionEvent actionEvent ) {
        Boton boton = (Boton) actionEvent.getSource() ;
        boolean activa = activa( actionEvent, boton );
        if( !activa ){
            List<FiguraValor> figuras = this.juego.contendio( boton.posicion() );
            juegoTerminado( boton, figuras );
        }
    }

    public void juegoTerminado(  Boton boton, List<FiguraValor> figuras ) {
        this.matrizBoton.actualizarMatriz( figuras );
        if ( this.juego.juegoTerminado( boton.posicion() ) ) {
            JOptionPane.showMessageDialog( null, "GAME OVER" );
            this.matrizBoton.bloquearBotones();
        }
    }

    public boolean activa( ActionEvent actionEvent, Boton boton){
        if ( ( actionEvent.getModifiers() & ActionEvent.CTRL_MASK ) == ActionEvent.CTRL_MASK ) {
            Posicion posicion = boton.posicion();
            juego.estado( posicion ) ;
            boton.bandera();
            return true;
        }
        return false;
    }

    public void matrizBotones( MatrizBoton matrizBoton ) {
        this.matrizBoton = matrizBoton;
    }
}
