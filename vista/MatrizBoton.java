import javax.swing.JButton;
import java.util.Iterator;
import java.util.List;

public class MatrizBoton extends JButton{

    private Boton [][]jButtons;
    private Tamanio dimension;

    public MatrizBoton ( Tamanio dimension ) {
        this. dimension = dimension;
        this.jButtons = new Boton[ dimension.getFila() ][ dimension.getColumna() ];
    }

    public JButton agregarBotones ( Boton button, Posicion posicion ) {
        this.jButtons[ posicion.getFila() ][ posicion.getColumna() ] = button;
        return this.jButtons[ posicion.getFila() ][ posicion.getColumna() ];
    }

    public void actualizarMatriz ( List<FiguraValor> figuras ) {
        Iterator<FiguraValor> iterador = figuras.iterator();
        while ( iterador.hasNext() ){
            FiguraValor auxiliar = iterador.next();
            Boton boton = this.jButtons[ auxiliar.posicion() [ 0 ] ] [ auxiliar.posicion() [ 1 ] ];
            boton.verCasilla(auxiliar.figura());
        }
    }

    public void bloquearBotones(){
        BloquearBotones bloquearBotones = new BloquearBotones();
        bloquearBotones.bloquearBotones( this.jButtons, dimension );
    }
}
