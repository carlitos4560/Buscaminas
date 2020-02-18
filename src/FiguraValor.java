public class FiguraValor {

    private Figura figura;
    private Posicion posicion;

    public FiguraValor ( Figura figura, Posicion posicion ) {
        this.figura = figura;
        this.posicion = posicion;
    }

    public Figura figura() {
        return this.figura;
    }

    public int[] posicion(){
        int []posicion = new int[2];
        posicion[0] = this.posicion.getFila();
        posicion[1] = this.posicion.getColumna();
        return posicion;
    }

    public boolean esBomba() {
        return this.figura.esBomba();
    }

    public boolean esVisible(){
        return this.figura.esVisible();
    }
}
