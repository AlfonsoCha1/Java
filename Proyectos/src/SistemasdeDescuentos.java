void main() {
/*
    PROYECTO - SISTEMA DE DESCUENTOS
    En este proyecto vamos a crear un sistema de descuentos para un restaurante. El sistema
    debe aplicar descuentos a los clientes según el monto de su compra. A continuación, se
    detallan los descuentos a aplicar:

    Detalles del proyecto
    1. Solicitar al usuario el monto total de consumo.
    2. Aplicar descuentos según el monto de consumo:
    Si el monto de consumo es mayor a S/.50 pero menor o igual a $/.100, aplicar un descuento del 10%.
    Si el monto de consumo es mayor a S/.100 pero menor o igual a S/.200, aplicar un descuento del 20%.
    Si el monto de consumo es mayor a S/.200, aplicar un descuento del 30%.
    Si el monto de consumo es menor o igual a S/.50, no aplicar descuento.
   3. Mostrar el monto total de consumo y el monto con descuento aplicado/
    */

    //Entrada de datos
    var ValorVentas = Double.parseDouble(IO.readln("Ingrese el total del consumo: "));

    //Calcular impuesto
    double d10 = 0.10;
    double d20 = 0.20;
    double d30 = 0.30;

    double totalFinal = ValorVentas;


    //Bucle
    if (ValorVentas <= 50 || ValorVentas == 100 || ValorVentas == 200) {
        System.out.println("No se aplica descuento.");
        System.out.println("Su total es: " + ValorVentas);
    }
    else if (ValorVentas > 50 && ValorVentas < 100) {
        // aplica 10%
        System.out.println("Su descuento es de 10%");
        System.out.println((" Su total es: " + totalFinal * d10));
    }

    else if (ValorVentas > 100 && ValorVentas < 200) {
        // aplica 20%
        System.out.println("Su descuento es de 20%");
        System.out.println((" Su total es: " + totalFinal * d20));
    }
    else if (ValorVentas > 200) {
        // aplica 30%
        System.out.println("Su descuento es de 30%");
        System.out.println(" Su total es: " + totalFinal * d30);
    }

   // System.out.println("Total a pagar: " + totalFinal);
}