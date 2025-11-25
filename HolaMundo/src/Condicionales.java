void main() {
    int numero = 87;
    if (numero > 0){
        if(numero % 2 == 0){
            IO.println("El numero es PAR positivo");
        }else{
            IO.println("El numero es IMPAR positivo ");
        }
    }else if (numero < 0){
        if( numero % 2 == 0){
            IO.println("El numero es PAR negativo");
        }
    }else{
        IO.println("El numero no es IMPAR negativo");
    }
}