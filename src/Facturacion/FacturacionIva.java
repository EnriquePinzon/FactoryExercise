package Facturacion;

import Facturacion.Facturacion;

public class FacturacionIva implements Facturacion {


    private double cantidad;

    public FacturacionIva(double cantidad){
        this.cantidad = cantidad;

    }
    @Override
    public double obtenerCantidad(){
        return cantidad + (cantidad * 0.19);
    }
}
