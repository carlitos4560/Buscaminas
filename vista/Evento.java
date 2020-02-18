import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Evento implements ActionListener {

    private Buscaminas buscaminas;

    public Evento(Buscaminas buscaminas ) {
        this.buscaminas = buscaminas;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.buscaminas.cerra();
        this.buscaminas.iniciarJuego();

    }
}
