import java.util.LinkedList;
import java.util.List;

public class Matriz {

    private Figura matriz[][];

    public Matriz ( Tamanio dimension) {
        this.matriz = new Figura [ dimension.getFila() ][ dimension.getColumna() ];
        crearMatrizCero( dimension );
    }

    private void crearMatrizCero ( Tamanio dimension) {
        for ( int fila = 0; fila < dimension.getFila(); fila++) {
            crearMatrizCero( fila, dimension );
        }
    }

    private void crearMatrizCero ( int fila, Tamanio dimension ) {
        final char VACIO = '0';
        for ( int columna = 0; columna < dimension.getFila(); columna++ ) {
            Valor valor = new Valor( VACIO );
            Figura figura = new Figura( valor );
            agregarFigura( new Posicion( fila, columna ), figura );
        }
    }

    public void agregarFigura( Posicion posicion, Figura figura ) {
        this.matriz [ posicion.getFila() ] [ posicion.getColumna() ] = figura;
    }

    public void actualizarCelda(Posicion posicion, Tamanio dimension){
        if( dimension.rangoValido ( posicion.getFila(), posicion.getColumna() ) ) {
            this.matriz[ posicion.getFila() ][ posicion.getColumna() ].incremento();
        }
    }

    public List<FiguraValor> casillas( Posicion posicion ) {
        List<FiguraValor> figuraValor = new LinkedList<>();
        actualizarVisible( posicion);
        FiguraValor auxiliar = new FiguraValor ( this.matriz [ posicion.getFila() ][ posicion.getColumna() ], posicion );
        figuraValor.add ( auxiliar );
        return figuraValor;
    }

    public void actualizarVisible( Posicion posicion ){
        this.matriz[ posicion.getFila() ][ posicion.getColumna() ].visible();
    }

    public void bandera( Posicion posicion ){
        this.matriz[ posicion.getFila() ][ posicion.getColumna() ].bandera();
    }

    public Figura figura( Posicion posicion ) {
        this.matriz[ posicion.getFila() ][ posicion.getColumna()].visible();
        return this.matriz[ posicion.getFila() ][ posicion.getColumna() ];
    }

    public boolean esBandera(Posicion posicion) {
        return this.matriz[ posicion.getFila() ][ posicion.getColumna() ].esBandera();
    }
}
