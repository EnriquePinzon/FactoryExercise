package Facturacion;

public class GenerarFactura {

    public static Facturacion getFacturacion(double cantidad, String tipo){
        if (tipo == "ESPECIAL"){
            return new FacturacionEspecial(cantidad);
        }else if (tipo == "IVA"){
            return new FacturacionIva(cantidad);
        }else{
            throw new RuntimeException("No existe ese tipo de factura" + tipo);
        }

    }
}
