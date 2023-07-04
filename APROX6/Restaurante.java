public class Restaurante {
    private final String nit;
    private String nombreRestaurante;
    private String direccion;
    private Cliente[] cliente;
    private int numeroClientes;

    public Restaurante(String nit, String nombre, String direccion) {
        if (nit != null)
            this.nit = nit;
        else
            this.nit = "";
        setNombreRestaurante(nombreRestaurante);
        setDireccion(direccion);
        cliente = new Cliente[10];
        numeroClientes = 0;
    }

    public String getNit() {
        return nit;
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public void setNombreRestaurante(String nombreRestaurante) {
        if (nombreRestaurante != null)
            this.nombreRestaurante = nombreRestaurante;
        else
            this.nombreRestaurante = "";
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        if (direccion != null)
            this.direccion = direccion;
        else
            this.direccion = "";
    }

    public double calcularPromedioGeneral() {
        double promedio = 0;
        for (int i = 0; i < numeroClientes; i++)
            promedio = promedio + cliente[i].calcularPromedio();
        return promedio / 3;
    }

    public void adicionarClienteUno(String identificacion, String nombre, String genero, double calificacionuno,
            double calificaciondos) {
        cliente[numeroClientes] = new ClienteUno(identificacion, nombre, genero, calificacionuno, calificaciondos);
        numeroClientes++;
    }

    public void adicionarClienteDos(String identificacion, String nombre, String genero, double calificacionuno,
            double calificaciondos, double calificaciontres) {
        cliente[numeroClientes] = new ClienteDos(identificacion, nombre, genero, calificacionuno, calificaciondos,
                calificaciontres);
        numeroClientes++;
    }

    public void adicionarClienteTres(String identificacion, String nombre, String genero, double calificacionuno,
            double calificaciondos, double calificaciontres, double calificacioncuatro) {
        cliente[numeroClientes] = new ClienteTres(identificacion, nombre, genero, calificacionuno, calificaciondos,
                calificaciontres, calificacioncuatro);
        numeroClientes++;
    }
}
