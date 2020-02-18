public class Valor {

    private char caracter;

    public Valor ( char caracter){
        this.caracter = caracter;
    }

    public char caracter() {
        return this.caracter;
    }

    public boolean esBomba() {
        return caracter == '*';
    }

    public boolean esVacio(){
        return caracter == '0';
    }

    public char incremento(){
        int valor = 0;
        char valorActualizado;
        if( !esBomba() ) {
            valor = Integer.parseInt (""+ this.caracter );
            valor = valor + 1;
            valorActualizado = ( valor +"" ).charAt ( 0 );
            this.caracter = valorActualizado;
        }
        return this.caracter;
    }

    public boolean esNumero() {
        if ( !esBomba() && !esVacio()){
            return true;
        }
        return false;
    }

}
