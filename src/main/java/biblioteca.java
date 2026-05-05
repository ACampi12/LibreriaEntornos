import java.util.ArrayList;
import java.util.List;

public class biblioteca {

    private List<Libro> libros;

    public biblioteca() {
        libros = new ArrayList<>();
    }

    public void añadirLibro(Libro libro) {
        libros.add(libro);
    }

    public int getNumeroLibros() {
        return libros.size();
    }
}