public class Posicion {

    private int fila;
    private int columna;

    public Posicion( int fila, int columna ) {
        this.fila = fila;
        this.columna = columna;
    }

    public int getFila(){
        return this.fila;
    }

    public int getColumna(){
        return this.columna;
    }

    public boolean existePosicion ( Posicion posicion ) {
        boolean existe = false;
        if ( ( posicion.getFila() == this.fila ) && ( posicion.getColumna() == this.columna ) ) {
           existe = true;
        }
        return existe;
    }
}
