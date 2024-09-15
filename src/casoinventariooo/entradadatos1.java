/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nuevoproyectodesafio;

/**
 *
 * @author domingoram
 */
import java.util.Scanner;
public class entradadatos1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
     /*   . Entrada de Datos:

    El programa solicitará al usuario la siguiente información para exactamente 5 productos (para lo cual se creara gran cantidad de variables, pero ese es el objetivo del ejercicio en base a los temas tratados en el curso):

    Nombre del producto.
    Cantidad en inventario (número de unidades disponibles).
    Precio unitario del producto.
    Categoría del producto, la cual será seleccionada por el usuario:
    1: Productos electrónicos
    2: Alimentos
    3: Ropa
        */

    
        Scanner scanner=new Scanner(System.in);//declarado scanner para poder leer los datos
        
        System.out.println("Ingrese el primer producto");
        String item1 = scanner.nextLine();
        System.out.println("Ingrese cantidad del primer producto");
        int stock1 = scanner.nextInt();
        System.out.println("Ingrese el costo del primer producto");
        double costo1 = scanner.nextDouble();
        System.out.println("Ingrese la categoria del primer producto (1.- Electronicos, 2.- Alimentos, 3.- Ropa):");
        int tipo1 = scanner.nextInt();
        
        System.out.println("producto1:\t"+item1);
        System.out.println("cantidad de producto1:\t"+stock1);
        System.out.println("costo de producto1:\t"+costo1);
        System.out.println("tipo de producto:\t"+tipo1);
    }
    
}
