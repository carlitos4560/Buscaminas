import javax.swing.JButton;
import javax.swing.JFrame;

public class JuegoVista extends JFrame {

    private Evento evento;
    private Buscaminas buscaminas;

    public JuegoVista( Buscaminas buscaminas ) {

        this.buscaminas = buscaminas;
        this.evento = new Evento( buscaminas );
        JFrame jFrame = new JFrame( "reiniciar ");
        jFrame.setSize( 100, 100);
        JButton jButton = new JButton("reiniciar");
        jButton.addActionListener( evento);
        jFrame.add( jButton);
        jFrame.setVisible(true);

    }
}
