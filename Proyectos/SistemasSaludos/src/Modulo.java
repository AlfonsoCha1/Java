void  Main(){

   System.out.println(Message.hello());
    Message.hello("Alex");

    var messages = Message.hellos("Ana", "Luis", "Marta");
    for(var msg : messages){
        System.out.println(msg);
    }

}