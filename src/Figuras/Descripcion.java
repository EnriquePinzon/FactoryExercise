package Figuras;

public class Descripcion {
    public static Figura descripcionFigura(String figura){

        if(figura == "CUADRADO"){
            return new Cuadrado();
        } else if (figura == "CIRCULO") {
            return new Circulo();
        } else if (figura == "RECTANGULO") {
            return new Rectangulo();
        }else {
            throw new RuntimeException("Error tipo figura: " +  figura);
        }

    }
}
