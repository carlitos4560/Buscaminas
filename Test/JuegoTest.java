import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class JuegoTest {

    private Tablero tablero;

    @BeforeEach
    void setUp() {
        this.tablero = new Tablero( new Tamanio( 3,3 ), 2 );
    }

}