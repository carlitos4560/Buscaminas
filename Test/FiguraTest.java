import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FiguraTest {
    List<Figura> figuras;
    @BeforeEach
    void setUp() {
        figuras = new LinkedList<>();
        figuras.add( new Figura( new Valor('0') ) );
        figuras.add( new Figura( new Valor('*') ) );
        figuras.add( new Figura( new Valor('1') ) );
        figuras.add( new Figura( new Valor('2') ) );
        figuras.add( new Figura( new Valor('3') ) );
    }

    @Test
    void testTipoBomba() {
        assertTrue( figuras.get( 1 ).esBomba() );
    }

    @Test
    void testNoTipoBomba() {
        assertFalse( figuras.get( 3 ).esBomba() );
    }

    @Test
    void testTipoVacio() {
        assertTrue( figuras.get( 0 ).esVacio() );
    }
    @Test
    void testNoTipoVacio() {
        assertFalse( figuras.get( 4 ).esVacio() );
    }

}
