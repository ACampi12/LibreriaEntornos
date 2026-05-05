import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class LibroTest {

    @Test
    void libroRecienCreadoTieneTituloCorrecto() {
        Libro libro = new Libro("Don Quijote");

        assertEquals("Don Quijote", libro.getTitulo());
    }

    @Test
    void libroRecienCreadoNoEstaPrestado() {
        Libro libro = new Libro("Don Quijote");

        assertFalse(libro.isPrestado());
    }

    @Test
    void prestarLibroCambiaEstadoAPrestado() {
        Libro libro = new Libro("Don Quijote");

        libro.prestar();

        assertTrue(libro.isPrestado());
    }

    @Test
    void prestarLibroYaPrestadoLanzaExcepcion() {
        Libro libro = new Libro("Don Quijote");
        libro.prestar();

        assertThrows(IllegalStateException.class, libro::prestar);
    }

    @Test
    void devolverLibroCambiaEstadoANoPrestado() {
        Libro libro = new Libro("Don Quijote");
        libro.prestar();
        libro.devolver();

        assertFalse(libro.isPrestado());
    }

    @Test
    void devolverLibroNoPrestadoLanzaExcepcion() {
        Libro libro = new Libro("Don Quijote");

        assertThrows(IllegalStateException.class, libro::devolver);
    }
}