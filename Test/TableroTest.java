import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TableroTest {
    Tablero tablero;
    @BeforeEach
    void setUp() {
        tablero = new Tablero( new Tamanio(5,5 ),15 );
    }

}