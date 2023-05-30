package tareaed;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * @author Alba
 */  
public class Tarea6ED {
    
    static final Logger txt = LoggerFactory.getLogger(Tarea6ED.class);
    
    public void aplicarDescuento(double precioProducto, int numProductos){    
        final double Total;
        if(numProductos>3)
            precioProducto-=5;
                if (numProductos!=0){
                Total = precioProducto*PLUS80;
                cantidadTotal(Total);
            }else {
                Total = precioProducto*PLUS95;
                cantidadTotal(Total);
            }   

    }
    public static final double PLUS95 = 0.95;
    public static final double PLUS80 = 0.08;
    

    public void cantidadTotal(final double Total) {
        txt.info("El total a pagar es: {}", Total);
        txt.info("Enviado");
    }
}