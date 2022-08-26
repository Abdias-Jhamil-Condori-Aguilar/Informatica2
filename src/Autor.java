import java.util.List;

public class Autor {
    //variables globales
    String nombre;
    String primerApellido;
    String segundoApellido;
    List<Titulo> titulos;

    //metodo constructor;

    public Autor() {

    }

    public Autor(String nombre, String primerApellido) {
        this.nombre = nombre;
        this.primerApellido = primerApellido;
    }

    public Autor(String nombre, String primerApellido, String segundoApellido) {
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
    }
}
