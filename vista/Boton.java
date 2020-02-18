import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;

public class Boton extends JButton {

    private Posicion posicion;

    public Boton ( Posicion posicion ) {
        this.posicion = posicion;
        this.setEnabled( true );
        this.setBackground( Color.black );
        this.setOpaque ( true );
        this.setFont( new Font("Arial",Font.BOLD,20));
    }

    public void verCasilla ( Figura figura) {
        this.setBackground( Color.white );
        if ( figura.esBomba() ) {
            this.setBackground( Color.red );
        }
        if ( figura.esVacio() ){
            this.setBackground( Color.cyan);
        }
        String simbolo = ""+ figura.tipoDato();
        this.setText( simbolo);
        this.setOpaque ( true );
        this.setEnabled( false );
    }

    public void bandera(  ){
        this.setBackground( Color.yellow );
        this.setText("B");
    }

    public Posicion posicion() {
        return posicion;
    }

    public void bloquearBoton(){
        this.setEnabled( false );
    }


}
