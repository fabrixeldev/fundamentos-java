package fundamentosBasicos;

import java.math.BigDecimal;

public class Ejercicio_11 {
    public static void main(String[]args){
        /*
        11: Precio base 350.00 Bs, descuento 12%, IVA 13% sobre el precio ya descontado. Calcula total.
        (si usas decimales, prefiere BigDecimal; si no, trabaja en centavos como int y al final formatea)
        */

        BigDecimal precioBase = new BigDecimal(350);
        BigDecimal descuento12 = new BigDecimal(0.12);

        BigDecimal operacionDes12 = precioBase.multiply(descuento12);
        BigDecimal precioDes12 = precioBase.subtract(operacionDes12);

        BigDecimal descuentoIva = new BigDecimal(0.13);
        BigDecimal operacionDes13 = precioDes12.multiply(descuentoIva);
        BigDecimal totalDes13 = precioDes12.add(operacionDes13);

        System.out.println("El total del precio Base con el descuento del 12% y mas el descuento del 13% del IVA es: " + totalDes13);
    }
}
