public class Tamanio {

    private int fila;
    private int columna;

    public Tamanio ( int fila, int columna ) {
        this.fila = fila;
        this.columna = columna;
    }

    public int getFila() {
        return fila;
    }

    public int getColumna() {
        return columna;
    }

    public int[] posicion(){
        int [] posicion = new int[]{ this.fila, this.columna };
        return posicion;
    }

    public boolean rangoValido( int cordenadaX, int cordenadaY ) {
        boolean valido = false;
        if ( cordenadaX >= 0 && cordenadaY >= 0) {
            valido = rangoMaximo( cordenadaX, cordenadaY);
        }
        return valido;
    }

    private boolean rangoMaximo( int cordenadaX, int cordenadaY ) {
        boolean maximoValido = false;
        if ( cordenadaX < this.fila  && cordenadaY < this.columna ) {
            maximoValido = true;
        }
        return maximoValido;
    }

}
