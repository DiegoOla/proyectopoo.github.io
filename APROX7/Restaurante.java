
/**
 * Write a description of class Colegio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Restaurante
{
    private final String nit;
    private String nombreRestaurante;
    private String direccion;
    private ArrayList cliente;
    
    public Restaurante(String nit,String nombreRestaurante,String direccion){
        if(nit != null) this.nit = nit;
        else this.nit = ""; 
        setNombreRestaurante(nombreRestaurante);
        setDireccion(direccion);        
        cliente = cliente = new ArrayList();
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
        
    public double calcularPromedioGeneral(){
        double promedio = 0;
        for(int i = 0; i < cliente.size(); i++){
            promedio += ((Cliente)cliente.get(i)).calcularPromedio();
        }

        return promedio / 3;
    }
    
    public void adicionarCliente(String identificacion, String nombre, String sede, double calificacionuno, double calificaciondos)throws Exception{
        cliente.add(new Cliente1(identificacion, nombre, sede, calificacionuno, calificaciondos));
    }
    
    public void adicionarCliente(String identificacion, String nombre, String sede, double calificacionuno, double calificaciondos, double calificaciontres)throws Exception{
        cliente.add(new Cliente2(identificacion, nombre, sede, calificacionuno, calificaciondos, calificaciontres));
    }
    
    public void adicionarCliente(String identificacion, String nombre, String sede, double calificacionuno, double calificaciondos, double calificaciontres, double calificacioncuatro)throws Exception{
        cliente.add(new Cliente3(identificacion, nombre, sede, calificacionuno, calificaciondos, calificaciontres, calificacioncuatro));
    }
}    