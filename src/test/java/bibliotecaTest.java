import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class bibliotecaTest {

    @Test
    void añadirLibrosYContar() {
        biblioteca biblioteca = new biblioteca();

        biblioteca.añadirLibro(new Libro("Libro 1"));
        biblioteca.añadirLibro(new Libro("Libro 2"));

        assertEquals(2, biblioteca.getNumeroLibros());
    }
    @Test
    void añadirVariosLibrosIncrementaTotalCorrectamente() {
        biblioteca biblioteca = new biblioteca();

        biblioteca.añadirLibro(new Libro("Libro 1"));
        biblioteca.añadirLibro(new Libro("Libro 2"));
        biblioteca.añadirLibro(new Libro("Libro 3"));

        assertEquals(3, biblioteca.getNumeroLibros());
    }
}