import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


class ValorTest {

    private List<Valor> valor;

    @BeforeEach
    void setUp() {
        this.valor = new LinkedList<>();
        this.valor.add( new Valor('0') );
        this.valor.add( new Valor('*') );
        this.valor.add( new Valor('2') );
    }

    @Test
    void testCaracter() {
        Valor auxiliar = new Valor('0');
        assertEquals ( this.valor.get(0).caracter(), auxiliar.caracter() );
    }

    @Test
    void testEsBomba() {
        assertTrue ( this.valor.get( 1 ).esBomba() );
    }
    @Test
    void testNoEsBomba() {
        assertFalse ( this.valor.get( 2 ).esBomba() );
    }

    @Test
    void testEsVacio() {
        assertTrue ( this.valor.get( 0 ).esVacio() );
    }

    @Test
    void testNoEsVacio() {
        assertFalse ( this.valor.get( 1 ).esVacio() );
    }

    @Test
    void testIncremento() {
        Valor auxiliar = new Valor('0');
        char incremento = auxiliar.incremento();
        assertEquals ( '1', incremento );
    }

    @Test
    void testNoIncremento() {
        Valor auxiliar = new Valor('0');
        char incremento = auxiliar.incremento();
        assertNotEquals( '0', incremento );
    }
}