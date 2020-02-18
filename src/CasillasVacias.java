import java.util.Iterator;
import java.util.List;
import java.util.LinkedList;
public class CasillasVacias {

    private Tablero tablero;

    public List<FiguraValor> casillas( Posicion posicion, Tamanio dimension, Tablero tablero ) {

        this.tablero = tablero;

        List<FiguraValor> figuraValor = new LinkedList<>();
        ActualizarTablero actualizartablero = new ActualizarTablero();

        Posicion[] auxilar = actualizartablero.tableroPosiciones( posicion );

        List<Posicion> posiciones = recorrer( auxilar, actualizartablero );
        posiciones = posicionValidas(posiciones, dimension);

        figuraValor.add( new FiguraValor( this.tablero.figuraCasilla( posicion ), posicion ) );
        actualizarRecorrido(figuraValor, posiciones, dimension);

        return figuraValor;
    }

    public List<Posicion> posicionValidas( List<Posicion> posicions, Tamanio dimension){
        List<Posicion> respuesta = new LinkedList<>();
        Iterator<Posicion> iterator = posicions.iterator();
        while ( iterator.hasNext() ){
            validaPosicion( iterator.next(), dimension, respuesta );
        }
        return respuesta;
    }

    public void validaPosicion( Posicion posicion, Tamanio dimension, List<Posicion> respuesta) {
        if( dimension.rangoValido(posicion.getFila(), posicion.getColumna())){
            Figura figura = this.tablero.figuraCasilla( posicion);
            if ( !this.tablero.esBandera(posicion) && !figura.esBomba() && figura.esVacio() ){
                respuesta.add( posicion );
            }
        }

    }

    public List<Posicion> recorrer( Posicion []posiciones,ActualizarTablero actualizartablero ) {
        List<Posicion> respuesta = new LinkedList<>();
        Posicion []auxiliar;
        for ( int indice = 0; indice < posiciones.length; indice++ ) {
            auxiliar = actualizartablero.tableroPosiciones( posiciones[ indice ] );
            guardadPosicion(respuesta, auxiliar);
        }
        return respuesta;
    }

    public void guardadPosicion(List<Posicion> respuesta, Posicion[]auxiliar){
        for( int indice = 0; indice < auxiliar.length; indice++){
            respuesta.add(auxiliar[indice]);
        }
    }


    private void actualizarRecorrido( List<FiguraValor> figuraValor, List<Posicion>auxilar, Tamanio dimension ) {
        for( int index = 0; index < auxilar.size(); index++){
            valido( figuraValor, auxilar.get( index ), dimension);
        }
    }

    private void valido( List<FiguraValor> figuraValor, Posicion posicion, Tamanio dimension ) {
        if( dimension.rangoValido( posicion.getFila(), posicion.getColumna() ) ) {
            figuraValor.add( new FiguraValor( this.tablero.figuraCasilla(posicion), posicion));
        }
    }

}
