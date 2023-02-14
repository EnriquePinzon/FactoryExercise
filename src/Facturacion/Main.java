package Facturacion;

import Figuras.Descripcion;
import Figuras.Figura;

public class Main {
    public static void main(String[] args) {

        Facturacion factura = GenerarFactura.getFacturacion(5000, "IVA");
        Facturacion factura2 = GenerarFactura.getFacturacion(2000, "ESPECIAL");

        System.out.println (factura2.obtenerCantidad());
        System.out.println("=====================");
        System.out.println(factura.obtenerCantidad());
        System.out.println("=====================");

        Figura figura = Descripcion. descripcionFigura("CUADRADO");
        Figura figura2 = Descripcion.descripcionFigura("CIRCULO");
        Figura figura3 = Descripcion.descripcionFigura("RECTANGULO");
        Figura figura4 = Descripcion.descripcionFigura("TRIANGULO");

        System.out.println(figura.dibujar());
        System.out.println("================");
        System.out.println(figura2.dibujar());
        System.out.println("================");
        System.out.println(figura3.dibujar());
        System.out.println("================");
        System.out.println(figura4.dibujar());


    }

    }
