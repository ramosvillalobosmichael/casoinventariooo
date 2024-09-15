/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nuevoproyectodesafio;

/**
 *
 * @author domingoram
 */
public class totaldescuento3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /* Se aplicará un descuento en base a la cantidad de productos en inventario:

        10% de descuento si la cantidad es mayor a 50 unidades.
        20% de descuento si la cantidad es mayor a 100 unidades.
        No se aplica descuento si la cantidad es menor o igual a 50.
        Ejemplo: Si la cantidad es 60 y el precio unitario es 1200, el valor total es 72,000. Con el descuento del 10%, el valor final será 64,800.*/
        
       
       int stock5=60;
       int costo5=1200;
       
       double totalCosto5=0,descuentoPor=0;
       double preciodescuento=0;
       
        if (stock5 > 100) {
            totalCosto5 = stock5*1200;
            descuentoPor = 0.20*totalCosto5;
        } else if (stock5 > 50) {
            totalCosto5 = stock5*1200;
            descuentoPor = 0.10*totalCosto5;
            
        }

        preciodescuento = totalCosto5-descuentoPor;
        
        
        
        System.out.println("dtotal :"+totalCosto5);
        System.out.println("precio con descuento:"+preciodescuento);
        
    }
    
}
