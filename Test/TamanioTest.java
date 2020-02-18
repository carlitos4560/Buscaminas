import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TamanioTest {
    List<Tamanio> tamanio;
    @BeforeEach
    void setUp() {
        tamanio = new LinkedList<>();
        tamanio.add( new Tamanio( 5, 5 ) );
        tamanio.add( new Tamanio( 3, 3 ) );
        tamanio.add( new Tamanio( 7, 7 ) );
        tamanio.add( new Tamanio( 2, 2 ) );
    }

    @Test
    void testRangoValidoXY() {
        assertTrue( tamanio.get( 0 ).rangoValido( 2, 3 ) );
    }
    @Test
    void testRangoNoValidoXnegativo() {
        assertFalse( tamanio.get( 0 ).rangoValido( -1, 3 ) );
    }
    @Test
    void testRangoNoValidoYnegativo() {
        assertFalse( tamanio.get( 0 ).rangoValido( 2, -3 ) );
    }
    @Test
    void testRangoNoValidoXYNegativos() {
        assertFalse( tamanio.get( 0 ).rangoValido( -1, -1 ) );
    }
}