
/**
 * Write a description of class Notas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Calificaciones{
    public static void main(String Args[]) throws Exception{
        Scanner sc = new Scanner(System.in);        
        Restaurante miRestaurante = new Restaurante("123456","BONA PETIT","Tunjuelito");
        String identificacion, nombre, sede;
        double calificacion1, calificacion2, calificacion3, calificacion4;
        double promedio = 0;
        int opcionMenu = 0;
        
        do{
            System.out.println("\nMenu de Opciones");
            System.out.println("[1]- Adicionar Cliente1: ");
            System.out.println("[2]- Adicopnar Cliente2: ");
            System.out.println("[3]- Adicionar Cliente3 ");
            System.out.println("[4]- Calcular Promedio ");
            System.out.println("[5]- Salir \n");
            System.out.println("Escoja una Opcion: ");
            opcionMenu = sc.nextInt();
            switch(opcionMenu){
                case 1:
                        sc.nextLine();
                        System.out.println("Digite la Identificacion del Cliente: ");
                        identificacion = sc.next();
                        System.out.println("Digite el nombre del Cliente: ");
                        nombre = sc.next();
                        System.out.println("Digite la sede del Restaurante: ");
                        sede = sc.next();
                        System.out.println("Digite primera calificacion del cliente: ");
                        calificacion1 = sc.nextDouble();
                        System.out.println("Digite segunda calificacion del cliente: ");
                        calificacion2 = sc.nextDouble();
                        try{
                            miRestaurante.adicionarCliente(identificacion, nombre, sede, calificacion1, calificacion2);
                        }catch(Exception e){
                            System.out.println(e.getMessage());
                        }
                        System.out.println("********************");
                        break;
                case 2:
                        sc.nextLine();
                        System.out.println("Digite la Identificacion del Cliente: ");
                        identificacion = sc.next();
                        System.out.println("Digite el nombre del Cliente: ");
                        nombre = sc.next();
                        System.out.println("Digite la sede del Restaurante: ");
                        sede = sc.next();
                        System.out.println("Digite primera calificacion del cliente: ");
                        calificacion1 = sc.nextDouble();
                        System.out.println("Digite segunda calificacion del cliente: ");
                        calificacion2 = sc.nextDouble();
                        System.out.println("Digite tercera calificacion del cliente: ");
                        calificacion3 = sc.nextDouble();
                        try{                        
                        miRestaurante.adicionarCliente(identificacion, nombre, sede, calificacion1, calificacion2, calificacion3);
                        }catch(Exception e){
                            System.out.println(e.getMessage());
                        }
                        System.out.println("********************");
                        break;
                case 3:
                        sc.nextLine();
                        System.out.println("Digite la Identificacion del Cliente: ");
                        identificacion = sc.next();
                        System.out.println("Digite el nombre del Cliente: ");
                        nombre = sc.next();
                        System.out.println("Digite la sede del Restaurante: ");
                        sede = sc.next();
                        System.out.println("Digite primera calificacion del cliente: ");
                        calificacion1 = sc.nextDouble();
                        System.out.println("Digite segunda calificacion del cliente: ");
                        calificacion2 = sc.nextDouble();
                        System.out.println("Digite tercera calificacion del cliente: ");
                        calificacion3 = sc.nextDouble();
                        System.out.println("Digite cuarta calificacion del cliente: ");
                        calificacion4 = sc.nextDouble();
                        try{                         
                        miRestaurante.adicionarCliente(identificacion, nombre, sede, calificacion1, calificacion2, calificacion3, calificacion4);
                        }catch(Exception e){
                            System.out.println(e.getMessage());
                        }
                        System.out.println("********************");
                        break;
                case 4:
                        sc.nextLine();
                        promedio = miRestaurante.calcularPromedioGeneral();
                        System.out.println("\n El promedio de calificaciones es: " + promedio); 
                        break;
                default:
                        System.out.println("Ha Seleccionado Salir");
                        
            }
        }while(opcionMenu != 5);
    }
}

