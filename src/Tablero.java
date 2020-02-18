import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Tablero {

    private Matriz matriz;
    private ListaBomba bombas;

    public Tablero( Tamanio dimension, int maximoBomba) {
        this.matriz = new Matriz( dimension );
        this.bombas = new ListaBomba();
        iniciarJuego(dimension, maximoBomba);
    }

    private void iniciarJuego ( Tamanio dimension, int cantidadBombas ) {
        List<Posicion> bombas = this.bombas.crearBombas ( dimension, cantidadBombas );
        ActualizarTablero actualizarTablero = new ActualizarTablero( );
        actualizarTablero.actualizar( bombas, this.matriz, dimension );
    }

    public List<FiguraValor> casilla ( Posicion posicion ) {
        List<Posicion> figuras = bombas.existeBomba( posicion );
        if ( figuras.size() > 0 ) {
            return casillasBomba ( figuras );
        }
        return this.matriz.casillas ( posicion ) ;
    }

    public Figura figuraCasilla( Posicion posicion ){
        return this.matriz.figura( posicion );
    }


    private List<FiguraValor> casillasBomba( List<Posicion>posiones ) {
        List<FiguraValor> bombas = new LinkedList<>();
        Iterator<Posicion> iterador = posiones.iterator();
        while ( iterador.hasNext() ) {
            Posicion posicionAuxiliar = iterador.next();
            Figura auxiliar = new Figura ( new Valor('*' ) );
            bombas.add( new FiguraValor( auxiliar, posicionAuxiliar ));
        }
        return bombas;
    }

    public void bandera( Posicion posicion ){
        this.matriz.bandera( posicion );
    }
    public boolean esBandera( Posicion posicion ) {
        return this.matriz.esBandera(posicion);
    }
}
