import java.util.Iterator;
import java.util.List;

public class ActualizarTablero {

    public void actualizar (  List<Posicion> bombas, Matriz matriz, Tamanio dimension ) {
        tableroBombas( bombas, matriz );
        Iterator<Posicion> iterable = bombas.iterator();
        while( iterable.hasNext() ){
            Posicion auxiliar = iterable.next();
            Posicion []tableroNumeros = tableroPosiciones( auxiliar );
            actualizarTablero( tableroNumeros, matriz, dimension);
        }
    }

    private void tableroBombas ( List<Posicion> posiciones, Matriz matriz ) {
        Iterator<Posicion> iterador = posiciones.iterator();
        while( iterador.hasNext() ){
            Valor valor = new Valor('*');
            Figura figura = new Figura( valor );
            matriz.agregarFigura( iterador.next(), figura );
        }
    }

    public  Posicion[] tableroPosiciones( Posicion posiciones) {
        Posicion []coordenadas = new Posicion[ 8 ];
        coordenadas [0] = new Posicion( posiciones.getFila() -1, posiciones.getColumna() );
        coordenadas [1] = new Posicion( posiciones.getFila() -1, posiciones.getColumna() + 1 );
        coordenadas [2] = new Posicion( posiciones.getFila() , posiciones.getColumna() + 1 );
        coordenadas [3] = new Posicion( posiciones.getFila() + 1, posiciones.getColumna() + 1 );
        coordenadas [4] = new Posicion( posiciones.getFila() + 1, posiciones.getColumna() );
        coordenadas [5] = new Posicion( posiciones.getFila() + 1, posiciones.getColumna() - 1);
        coordenadas [6] = new Posicion( posiciones.getFila() , posiciones.getColumna() - 1 );
        coordenadas [7] = new Posicion( posiciones.getFila() - 1, posiciones.getColumna() - 1 );
        return coordenadas;
    }

    private void actualizarTablero( Posicion []posiciones, Matriz matriz, Tamanio dimension){
        for ( int i = 0; i< posiciones.length; i++ ) {
            matriz.actualizarCelda( posiciones[ i ], dimension );
        }
    }

}
