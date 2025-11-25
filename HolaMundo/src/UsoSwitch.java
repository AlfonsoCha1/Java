void main() {
    char genero = 'M';
    int edad = 30;
    //String r = (edad >= 18) ? "Es mayor de edad: ": "Menor de edad";
    //IO.println(r);
    String resultado = switch(genero){
        case 'M' -> (edad >= 18)? "Hombre adulto": "Hombre joven";
        case 'F' -> (edad >= 18)? "Mujer adulto": "Mujer joven";
        default -> "Otro caso";
    };
    IO.println(resultado);
}