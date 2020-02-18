import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PosicionTest {

    private List<Posicion> posicion;

    @BeforeEach
    void setUp() {
        posicion = new LinkedList<>();
        posicion.add( new Posicion(5,6));
        posicion.add( new Posicion(-5,-6));
    }

    @Test
    void testExistePosicion() {
        assertTrue( new Posicion( 5,6 ).existePosicion ( posicion.get ( 0 ) ) );
    }

    @Test
    void testNoExistePosicion() {
        assertFalse( new Posicion( 4,6 ).existePosicion ( posicion.get ( 0 ) ) );
    }

    @Test
    void testNoExistePosicionNegativa() {
        assertFalse( new Posicion( 4,6 ).existePosicion ( posicion.get ( 1 ) ) );
    }
}