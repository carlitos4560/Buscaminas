import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrizTest {

    Matriz matriz;

    @BeforeEach
    void setUp() {
        matriz = new Matriz( new Tamanio( 3,3));
    }

     @Test
    void testAgregarFigigura(){
        Figura figura = new Figura( new Valor ('1') );
        Posicion posicion = new Posicion( 0,0);
        matriz.agregarFigura( posicion, figura );
        FiguraValor figuraValor = matriz.casillas( posicion ).get(0);
        Figura auxiliar = figuraValor.figura();
        assertEquals('1', auxiliar.tipoDato() );
    }

}