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
public class Nuevoproyectodesafio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        // 1variables declaradas para el primer elemmento
        System.out.println("Ingrese el primer producto");
        String item1 = scanner.nextLine();
        System.out.println("Ingrese cantidad del primer producto");
        int stock1 = scanner.nextInt();
        System.out.println("Ingrese el costo del primer producto");
        double costo1 = scanner.nextDouble();
        System.out.println("Ingrese la categoria del primer producto (1.- Electronicos, 2.- Alimentos, 3.- Ropa):");
        int tipo1 = scanner.nextInt();
        double totalCosto1 = stock1 * costo1;
        double descuentoPor1 = 0;

        if (stock1 > 100) {
            descuentoPor1 = 0.20;
        } else if (stock1 > 50) {
            descuentoPor1 = 0.10;
        }

        totalCosto1 -= totalCosto1 * descuentoPor1;

        String mensajeCat1 = "";
        
        mensajeCat1 = switch (tipo1) {
            case 1 -> "Producto electronico. Revisar garantia.";
            case 2 -> "Producto alimenticio. Revisar fecha de caducidad.";
            case 3 -> "Producto de ropa. Revisar tallas disponibles.";
            default -> "Categoria no valida.";
        };
        
        

        System.out.println("Producto: " + item1);
        System.out.println("Cantidad: " + stock1);
        System.out.println("Precio unitario: " + costo1);
        System.out.println("Valor total antes de descuento: " + (stock1 * costo1));
        System.out.println("Descuento aplicado: " + (descuentoPor1 * 100) + "%");
        System.out.println("Valor total despues de descuento: " + totalCosto1);
        System.out.println(mensajeCat1);
        if (totalCosto1 > 500) {
            System.out.println("Atencion: Se recomienda reducir el inventario ya que el valor total supera los 500 soles.");
        }
        System.out.println("/////////////////////////////////////////////////////////////////////////////////");
        
        /////hasta aqui se repite * 5 veces

        // variables declaradas para el segundo elemento
        scanner.nextLine(); // Limpieza del buffer
        System.out.println("Ingrese el nombre del producto segundo producto:");
        String item2 = scanner.nextLine();
        System.out.println("Ingrese la cantidad en inventario del segundo producto:");
        int stock2 = scanner.nextInt();
        System.out.println("Ingrese el precio unitario del segundo producto:");
        double costo2 = scanner.nextDouble();
        System.out.println("Ingrese la categoria del producto segundo producto (1.- Electronicos, 2.- Alimentos, 3.- Ropa):");
        int tipo2 = scanner.nextInt();
        double totalCosto2 = stock2 * costo2;
        double descuentoPor2 = 0;

        if (stock2 > 100) {
            descuentoPor2 = 0.20;
        } else if (stock2 > 50) {
            descuentoPor2 = 0.10;
        }

        totalCosto2 -= totalCosto2 * descuentoPor2;
        //
        String mensajeCat2 = "";
        mensajeCat2 = switch (tipo2) {
            case 1 -> "Producto electronico. Revisar garantia.";
            case 2 -> "Producto alimenticio. Revisar fecha de caducidad.";
            case 3 -> "Producto de ropa. Revisar tallas disponibles.";
            default -> "Categoria no valida.";
        };

        System.out.println("Producto: " + item2);
        System.out.println("Cantidad: " + stock2);
        System.out.println("Precio unitario: " + costo2);
        System.out.println("Valor total antes de descuento: " + (stock2 * costo2));
        System.out.println("Descuento aplicado: " + (descuentoPor2 * 100) + "%");
        System.out.println("Valor total despues de descuento: " + totalCosto2);
        System.out.println(mensajeCat2);
        if (totalCosto2 > 500) {
            System.out.println("Atencion: Se recomienda reducir el inventario ya que el valor total supera los 500 soles.");
        }
        System.out.println("/////////////////////////////////////////////////////////////////////////////////");

        

        // variables declaradas para el tercer elemento
        scanner.nextLine(); // Limpieza del buffer
        System.out.println("Ingrese el nombre del tercer producto:");
        String item3 = scanner.nextLine();
        System.out.println("Ingrese la cantidad en inventario del tercer producto:");
        int stock3 = scanner.nextInt();
        System.out.println("Ingrese el precio unitario del tercer producto:");
        double costo3 = scanner.nextDouble();
        System.out.println("Ingrese la categoria del producto tercer producto (1.- Electrónicos, 2.- Alimentos, 3.- Ropa):");
        int tipo3 = scanner.nextInt();
        double totalCosto3 = stock3 * costo3;
        double descuentoPor3 = 0;

        if (stock3 > 100) {
            descuentoPor3 = 0.20;
        } else if (stock3 > 50) {
            descuentoPor3 = 0.10;
        }

        totalCosto3 -= totalCosto3 * descuentoPor3;

        String mensajeCat3 = "";
        mensajeCat3 = switch (tipo3) {
            case 1 -> "Producto electronico. Revisar garantia.";
            case 2 -> "Producto alimenticio. Revisar fecha de caducidad.";
            case 3 -> "Producto de ropa. Revisar tallas disponibles.";
            default -> "Categoria no valida.";
        };

        System.out.println("Producto: " + item3);
        System.out.println("Cantidad: " + stock3);
        System.out.println("Precio unitario: " + costo3);
        System.out.println("Valor total antes de descuentos: " + (stock3 * costo3));
        System.out.println("Descuento aplicado: " + (descuentoPor3 * 100) + "%");
        System.out.println("Valor total después de descuentos: " + totalCosto3);
        System.out.println(mensajeCat3);
        if (totalCosto3 > 500) {
            System.out.println("Atencion: Se recomienda reducir el inventario ya que el valor total supera los 500 soles.");
        }
        System.out.println("/////////////////////////////////////////////////////////////////////////////////");

        // variables declarades para el cuarto elemento
        scanner.nextLine(); // Limpieza del buffer
        System.out.println("Ingrese el nombre del cuarto producto:");
        String item4 = scanner.nextLine();
        System.out.println("Ingrese la cantidad en inventario del cuarto producto:");
        int stock4 = scanner.nextInt();
        System.out.println("Ingrese el precio unitario del cuarto producto:");
        double costo4 = scanner.nextDouble();
        System.out.println("Ingrese la categoria del cuarto producto (1.- Electronicos, 2.- Alimentos, 3.- Ropa):");
        int tipo4 = scanner.nextInt();
        double totalCosto4 = stock4 * costo4;
        double descuentoPor4 = 0;

        if (stock4 > 100) {
            descuentoPor4 = 0.20;
        } else if (stock4 > 50) {
            descuentoPor4 = 0.10;
        }

        totalCosto4 -= totalCosto4 * descuentoPor4;

        String mensajeCat4 = "";
        mensajeCat4 = switch (tipo4) {
            case 1 -> "Producto electronico. Revisar garantia.";
            case 2 -> "Producto alimenticio. Revisar fecha de caducidad.";
            case 3 -> "Producto de ropa. Revisar tallas disponibles.";
            default -> "Categoria no valida.";
        };

        System.out.println("Producto: " + item4);
        System.out.println("Cantidad: " + stock4);
        System.out.println("Precio unitario: " + costo4);
        System.out.println("Valor total antes de descuento: " + (stock4 * costo4));
        System.out.println("Descuento aplicado: " + (descuentoPor4 * 100) + "%");
        System.out.println("Valor total despues de descuento: " + totalCosto4);
        System.out.println(mensajeCat4);
        if (totalCosto4 > 500) {
            System.out.println("Atención: Se recomienda reducir el inventario ya que el valor total supera los 500 soles.");
        }
        System.out.println("/////////////////////////////////////////////////////////////////////////////////");

        
        
        // variables declaradas para el quinto elemento
        scanner.nextLine(); // Limpieza del buffer
        System.out.println("Ingrese el nombre del quinto producto:");
        String item5 = scanner.nextLine();
        System.out.println("Ingrese la cantidad en inventario del quinto producto:");
        int stock5 = scanner.nextInt();
        System.out.println("Ingrese el precio unitario del quinto producto:");
        double costo5 = scanner.nextDouble();
        System.out.println("Ingrese la categoría del quinto producto (1.- Electronicos, 2: Alimentos, 3: Ropa):");
        int tipo5 = scanner.nextInt();
        double totalCosto5 = stock5 * costo5;
        double descuentoPor5 = 0;

        if (stock5 > 100) {
            descuentoPor5 = 0.20;
        } else if (stock5 > 50) {
            descuentoPor5 = 0.10;
        }

        totalCosto5 -= totalCosto5 * descuentoPor5;

        String mensajeCat5 = "";
        mensajeCat5 = switch (tipo5) {
            case 1 -> "Producto electronico. Revisar garantia.";
            case 2 -> "Producto alimenticio. Revisar fecha de caducidad.";
            case 3 -> "Producto de ropa. Revisar tallas disponibles.";
            default -> "Categoría no válida.";
        };

        System.out.println("Producto: " + item5);
        System.out.println("Cantidad: " + stock5);
        System.out.println("Precio unitario: " + costo5);
        System.out.println("Valor total antes de descuento: " + (stock5 * costo5));
        System.out.println("Descuento aplicado: " + (descuentoPor5 * 100) + "%");
        System.out.println("Valor total después de descuento: " + totalCosto5);
        System.out.println(mensajeCat5);
        if (totalCosto5 > 500) {
            System.out.println("Atención: Se recomienda reducir el inventario ya que el valor total supera los 500 soles.");
        }
        System.out.println("/////////////////////////////////////////////////////////////////////////////////");

        // Cálculo del valor total del inventario
        double inventarioTotal = totalCosto1 + totalCosto2 + totalCosto3 + totalCosto4 + totalCosto5;
        System.out.println("El valor total del inventario es: " + inventarioTotal + " soles.");
        if (inventarioTotal > 500) {
            System.out.println("Atencion: Se recomienda reducir el inventario ya que el valor total supera los 500 soles.");
        }
    }
    
}
