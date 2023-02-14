package Facturacion;

import Facturacion.Facturacion;

public class FacturacionEspecial implements Facturacion {



    private double cantidad;

    public FacturacionEspecial(double cantidad){
         this.cantidad = cantidad;

    }

    @Override
    public double obtenerCantidad(){
        return cantidad + (cantidad * 0.08);
    }


}
