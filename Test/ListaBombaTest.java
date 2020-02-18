import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListaBombaTest {

    private ListaBomba bombas;
    @BeforeEach
    void setUp() {
        bombas = new ListaBomba();
    }

    @Test
    void testCrearCantidadBombas() {
        assertEquals(5, bombas.crearBombas( new Tamanio(5,5 ), 5).size());
    }

    @Test
    void testCrearCantidadBombasDiferentes() {
        assertNotEquals(6, bombas.crearBombas( new Tamanio(5,5 ), 5).size());
    }

    @Test
    void testExisteBomba() {
        List<Posicion> posiciones = bombas.crearBombas( new Tamanio(5,5 ), 5  );
        Posicion posicion = new Posicion( 0,1);
        if ( bombas.existeBomba( posicion ).size() == 0 ) {
            assertTrue( true, "No existe Bomba"  );
        }
        else{
            assertEquals(5, bombas.existeBomba( posicion ).size(), "existe Bomba");
        }
    }


}