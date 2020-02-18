public class Figura {

    private Valor valor;
    private Estado estado;

    public Figura( Valor valor) {
        this.valor = valor;
        this.estado = new Estado();
    }

    public boolean esBomba(){
        return valor.esBomba();
    }

    public boolean esVacio(){
        return valor.esVacio();
    }

    public void incremento(){
        this.valor.incremento();
    }

    public char tipoDato() {
        return this.valor.caracter();
    }

    public void visible() {
        this.estado.visible();
    }

    public boolean esVisible() {
        return this.estado.esVisible();
    }

    public boolean esNumero () {
        return this.valor.esNumero();
    }

    public void bandera() {
        this.estado.bandera();
    }

    public boolean esBandera() {
        return this.estado.esBandera();
    }
}