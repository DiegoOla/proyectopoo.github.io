public class Restaurante {
    private final String nit;
    private String nombreRestaurante;
    private String direccion;
    private ClienteUno[] cliente1;
    private ClienteDos[] cliente2;
    private ClienteTres[] cliente3;
    private int numClientes1;
    private int numClientes2;
    private int numClientes3;

    public Restaurante(String nit, String nombreRestaurante, String direccion) {
        if (nit != null)
            this.nit = nit;
        else
            this.nit = "";
        setNombreRestaurante(nombreRestaurante);
        setDireccion(direccion);
        cliente1 = new ClienteUno[50];
        cliente2 = new ClienteDos[50];
        cliente3 = new ClienteTres[50];
        numClientes1 = 0;
        numClientes2 = 0;
        numClientes3 = 0;
    }

    public String getNit() {
        return nit;
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public void setNombreRestaurante(String nombreRestaurante) {
        if (nombreRestaurante != null) {
            this.nombreRestaurante = nombreRestaurante;
        } else {
            this.nombreRestaurante = "";
        }
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        if (direccion != null) {
            this.direccion = direccion;
        } else {
            this.direccion = "";
        }
    }

    public int getNumClientes1() {
        return numClientes1;
    }

    public int getNumClientes2() {
        return numClientes2;
    }

    public int getNumClientes3() {
        return numClientes3;
    }

    public double calcularPromedioGeneral() {
        double promedio = 0;
        for (int i = 0; i < numClientes1; i++) {
            promedio = promedio + cliente1[i].calcularPromedio() / numClientes1;
        }
        for (int i = 0; i < numClientes2; i++) {
            promedio = promedio + cliente2[i].calcularPromedio() / numClientes2;
        }
        for (int i = 0; i < numClientes3; i++) {
            promedio = promedio + cliente3[i].calcularPromedio() / numClientes3;
        }
        return promedio / 3;
    }

    public void adicionarClienteUno(String identificacion, String nombre, String sede, double calificacionuno,
            double calificaciondos) {
        cliente1[numClientes1] = new ClienteUno(identificacion, nombre, sede, calificacionuno, calificaciondos);
        numClientes1++;
    }

    public void adicionarClienteDos(String identificacion, String nombre, String sede, double calificacionuno,
            double calificaciondos, double calificaciontres) {
        cliente2[numClientes2] = new ClienteDos(identificacion, nombre, sede, calificacionuno, calificaciondos,
                calificaciontres);
        numClientes2++;
    }

    public void adicionarClienteTres(String identificacion, String nombre, String sede, double calificacionuno,
            double calificaciondos, double calificaciontres, double calificacioncuatro) {
        cliente3[numClientes3] = new ClienteTres(identificacion, nombre, sede, calificacionuno, calificaciondos,
                calificaciontres, calificacioncuatro);
        numClientes3++;
    }
}
