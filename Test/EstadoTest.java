import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EstadoTest {

    private Estado estado;

    @BeforeEach
    void setUp() {
        estado = new Estado();
    }

    @Test
    void TestVisible() {
        assertTrue( estado.esVisible() );
    }
    @Test
    void TestNoVisible() {
        assertNotEquals( false, estado.esVisible() );
    }

}