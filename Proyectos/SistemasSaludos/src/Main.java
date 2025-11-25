//void saludo(String nombre, int edad) {
  //  IO.println("Hola,  "+ nombre+ ". Tienes "+edad+" años.");
//}
//Metodos
/*void saludo(){
    System.out.println("Hola desconocido");
}

String saludo(String nombre){
    return "Hola. "+ nombre;
}

String saludo(String nombre, int edad){
    return "Hola. "+ nombre + ". Tienes " +edad+" años.";
}

void main(){
    saludo();
   var saludo2 = saludo("Juan");
   var saludo3 = saludo("Alfonso", 25);

   IO.println(saludo2);
   IO.println(saludo3);

}*/

//varargs
String hello(){
    return  "¡Hola, como estas!";
}
String hello(String name){

    if (name == null || name.trim().isEmpty()){
        System.out.println("El nombre no puede ser vacio.");
        return  null;
    }
    var format = randomFormat();
    var message = String.format(format, name);
    return message;
}

String[] hellos(String... names){
    var messages = new String[names.length];

    for(var i =0; i < names.length; i++){
        messages[i] = hello(names[i]);
    }
    return messages;
}

String randomFormat(){
    // Lista de formatos  de mensaje
    var formats = new String[]{
            "¡Hola,  %s!  ¡Bienevenido a mundo de Java! 👋",
            "¡Hola,  %s!  ¿Cómo estás hoy? ☺️",
            "¡Saludos, %s!  ¡Bienvenido a una aventura! 🚀",
            "¡Buenos dias %s ☀️",
            "¡Hey, %s! ¿Listo para aprender algo nuevo? 📚",
            "¡Hola, %s! ¡Espero que tengas un día increible! ☀️",
            "¡Que tal, %s!  ¡Vamos a programar algo genial! 💻",
    };
            //Selecciona un formato aleatorio
    var indiceAleatorio = (int)(Math.random()*formats.length);
    return formats[indiceAleatorio];
}
void main(){
   System.out.println(hello());
   System.out.println(hello("Maria"));

   var messages = hellos("Alex", "Roel", "Maria", "Juan");
   for(var msg : messages){
       System.out.println(msg);
   }

}