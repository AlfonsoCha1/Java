void main() {
   /*
    var contador = 1;

    while(contador <= 10){
        IO.println("Contador: " + contador );
        contador ++;
    }

    for (var i = 1; i <= 10; i++){

        if( i == 5){
            continue;
        }
        IO.println("Valor de i: " + i);
    }
    */

    var frutas = new String[]{"🍎","🍌", "🍊", "🍉", "🍇"};


    for (var i = 0;  i< frutas.length; i++){
        IO.println(i +1 + "-> " + frutas[i]);
    }
    //foreach
    for (var fruta: frutas){
        IO.println(fruta);
    }
}