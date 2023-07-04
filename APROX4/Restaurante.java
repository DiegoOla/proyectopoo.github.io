public class Restaurante
{
    private final String nit;
    private String nombreRestaurante;
    private String direccion;
    private Cliente[] cliente;
    private int numClientes;
    
    public Restaurante(String nit,String nombreRestaurante,String direccion){
        if(nit != null) this.nit = nit;
        else this.nit = ""; 
        setNombreRestaurante(nombreRestaurante);
        setDireccion(direccion);        
        cliente = new Cliente[50];
        numClientes = 0;
    }
    
    public String getNit(){
        return nit;
    }
    
    public String getNombreRestaurante(){
        return nombreRestaurante;
    }
    public void setNombreRestaurante(String nombreRestaurante){
        if(nombreRestaurante != null){
            this.nombreRestaurante = nombreRestaurante;
        }else{
            this.nombreRestaurante = "";
        }        
    }
    
    public String getDireccion(){
        return direccion;
    }
    public void setDireccion(String direccion){
        if(direccion != null){
            this.direccion = direccion;
        }else{
            this.direccion = "";
        }        
    }
    
    public int getNumClientes(){
        return numClientes;
    }
    
    public double calcularPromedioGeneral(){
        double promedio = 0;
        for(int i = 0; i < numClientes; i++){
            promedio = promedio + cliente[i].calcularPromedio() / numClientes;
        }
        return promedio;
    }
    
    public void adicionarCliente(String identificacion, String nombre, String sede, double calificacionuno, double calificaciondos, double calificaciontres){
        Cliente e = new Cliente(identificacion, nombre, sede, calificacionuno, calificaciondos, calificaciontres);
        cliente[numClientes] = e;
        numClientes++;
    }
}   