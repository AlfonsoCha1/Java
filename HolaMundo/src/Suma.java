void main() {

    var n1 = IO.readln("Ingreso de numero 1: ");
    var n2 = IO.readln("Ingreso de numero 2: ");

   var resultado = Integer.parseInt(n1) + Integer.parseInt(n2);

    var salida = String.format("%s + %s = %d", n1, n2, resultado);
    IO.println(salida);
}