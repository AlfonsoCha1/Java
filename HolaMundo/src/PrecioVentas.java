void main() {
    //Entrada de datos
    var valorVentas = Double.parseDouble(IO.readln("Ingrese el valor de venta:"));

    //Calcular el impuesto

    var igv = valorVentas * 0.18;
    var precioVenta = valorVentas + igv;

    //Salida  de datos
    IO.println("Boleta de vetna \n================================");
    IO.println(String.format("Valor de venta 💰: S/. %.2f", valorVentas));
    IO.println(String.format("IGV 💰: S/. %.2f", igv));
    IO.println("--------------------------------");
    IO.println(String.format("Precio de venta 💰: S/. %.2f", precioVenta));
    IO.println("========================================");


}