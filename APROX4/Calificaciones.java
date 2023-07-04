import java.util.Scanner;
public class Calificaciones{
    public static void main(String Args[]){
        Scanner sc = new Scanner(System.in);
        int numClientes;
        Restaurante miRestaurante = new Restaurante("123456","BONA PETIT","Tunjuelito");
        String identificacion, nombre, genero;
        double calificacion1, calificacion2, calificacion3;
        double promedio = 0;
        
        System.out.println("Digite el numero de clientes: ");
        numClientes = sc.nextInt();

        for(int i = 0; i < numClientes; i++){
            System.out.println("Digite la Identificacion del Cliente: ");
            identificacion = sc.next();
            System.out.println("Digite el nombre del Cliente: ");
            nombre = sc.next();
            System.out.println("Digite el genero del Cliente: ");
            genero = sc.next();
            System.out.println("Digite primera calificacion del cliente: ");
            calificacion1 = sc.nextDouble();
            System.out.println("Digite segunda calificacion del cliente: ");
            calificacion2 = sc.nextDouble();            
            System.out.println("Digite tercera calificacion del cliente: ");
            calificacion3 = sc.nextDouble();
            miRestaurante.adicionarCliente(identificacion, nombre, genero, calificacion1, calificacion2, calificacion3);
        }
        promedio = miRestaurante.calcularPromedioGeneral();        
        System.out.println("\n El promedio de calificacion es: " + promedio); 
    }
}
