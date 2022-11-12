package repeticion;

import java.util.Arrays;

public class While {
    public static void main(String[] args) {
        int contador = 0;
        while(contador < 10){
            System.out.println("Hola mundo" + " " + contador);
            contador++;
            if (contador == 5){
                //break;
                continue;
            }
        }
        String[] nombres = {"el uno", "el dos"};
       //while (){
           System.out.println(nombres);

    }
}
