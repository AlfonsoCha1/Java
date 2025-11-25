public class Message {
    //varargs
    static String hello() {
        return "¡Hola, como estas!";
    }

    static String hello(String name) {

        if (name == null || name.trim().isEmpty()) {
            System.out.println("El nombre no puede ser vacio.");
            return null;
        }
        var format = randomFormat();
        var message = String.format(format, name);
        return message;
    }

    static String[] hellos(String... names) {
        var messages = new String[names.length];

        for (var i = 0; i < names.length; i++) {
            messages[i] = hello(names[i]);
        }
        return messages;
    }

    static String randomFormat() {
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
        var indiceAleatorio = (int) (Math.random() * formats.length);
        return formats[indiceAleatorio];
    }
}
