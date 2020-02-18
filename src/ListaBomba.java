import java.util.LinkedList;
import java.util.List;

public class ListaBomba {

    private List<Posicion> bombas;

    public ListaBomba () {
        this.bombas = new LinkedList<>();
    }

    public List<Posicion> crearBombas( Tamanio dimension , int cantidad ) {
        int fila = 0, columna = 0;
        do {
            fila = numeroAleatorio ( dimension.getFila () );
            columna = numeroAleatorio ( dimension.getColumna() );
            cantidad = existeBomba ( new Posicion ( fila, columna ), cantidad );
        } while ( cantidad != 0 );
        return this.bombas;
    }

    private int existeBomba( Posicion posicion, int cantidad ){
        if ( this.bombas.size() == 0){
            agregarBomba ( posicion );
            cantidad = cantidad - 1;
            return cantidad;
        }
        return verificarBomba( posicion, cantidad );
    }

    private int verificarBomba( Posicion posicion, int cantidad ) {
        boolean existe = false;
        int i = 0;
        Posicion posicion1;
        while ( !existe && i < this.bombas.size() ) {
            posicion1 = this.bombas.get( i );
            existe = posicion1.existePosicion( posicion );
            i++;
        }
        if (existe) {
            return cantidad;
        }
        agregarBomba( posicion );
        cantidad = cantidad - 1;
        return cantidad;
    }

    public List<Posicion> existeBomba( Posicion posicion ) {
        boolean existe = false;
        int indice = 0;
        while( indice < this.bombas.size() && !existe ) {
            existe = existeBomba1 ( this.bombas.get(indice), posicion );
            indice++;
        }
        if ( existe ){
            return this.bombas;
        }
        List<Posicion> noExiste = new LinkedList<>();
        return noExiste;
    }

    private boolean existeBomba1( Posicion posicionBomba, Posicion posicion ) {
        if ( posicionBomba.existePosicion( posicion ) ) {
            return true;
        }
        return false;
    }

    private int numeroAleatorio( int limite ) {
        return ( int ) Math.floor( Math.random() * ( limite - 1 ) );
    }

    public void agregarBomba ( Posicion posicion ) {
        this.bombas.add( posicion );
    }
}