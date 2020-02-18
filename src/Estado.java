public class Estado {

    private boolean visible;
    private boolean bandera;

    public Estado(){
        this.visible = false;
        this.bandera = false;
    }

    public void visible(){
        this.bandera = false;
        this.visible = true;
    }

    public void bandera(){
        this.bandera = true;
    }

    public boolean esVisible() {
        return this.visible;
    }

    public boolean esBandera(){
        return this.bandera;
    }
}
