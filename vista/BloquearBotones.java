public class BloquearBotones {

    public void bloquearBotones( Boton [][]botones, Tamanio dimension ) {
        int []posicion = dimension.posicion();
        for ( int fila = 0; fila < posicion[0]; fila++ ){
            bloquearBotones( botones, posicion, fila);
        }
    }
    private void bloquearBotones( Boton [][]botones, int[] posicion, int fila ) {
        for ( int columna = 0; columna < posicion[ 1 ]; columna++ ) {
            botones[ fila][ columna ].bloquearBoton();
        }
    }
}
