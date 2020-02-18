import java.util.List;

public class Juego {

    private Tablero tablero;
    private Tamanio dimension;

    public Juego (Tablero tablero, Tamanio dimension ) {

        this.tablero = tablero;
        this.dimension = dimension;
    }

    public List<FiguraValor> contendio ( Posicion posicion ) {
        List<FiguraValor> contenido = tablero.casilla( posicion );
        FiguraValor figuraValor = contenido.get( 0 );
        Figura figura = figuraValor.figura();
        if ( figura.esVacio() ) {
            CasillasVacias casillasVacias = new CasillasVacias();
            return casillasVacias.casillas( posicion, this.dimension, tablero);
        }
        return contenido;
    }


    public void estado ( Posicion posicion ) {
        this.tablero.bandera( posicion );
    }

    public Boolean juegoTerminado( Posicion posicion ){
        List<FiguraValor> figuras = this.tablero.casilla( posicion );
        FiguraValor esBomba = figuras.get(0);
        if ( esBomba.esBomba() ) {
            return true;
        }
        return false;
    }

}
