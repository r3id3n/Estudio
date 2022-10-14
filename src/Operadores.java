public class Operadores {
    public static void main(String[] args) {
        //aritmeticos:
        int numero01 = 10;
        int numero02 = 20;
        int resultado = numero01 + numero02;
        System.out.println(resultado);
        System.out.println(resultado + 5.77);

        //comparacion
        /*
        * > mayor que
        * < menor que
        * >= mayor igual que
        * <= menor igual que
        * == igual que
        * */
        boolean resultado1 = numero01 > numero02;
        System.out.println(resultado1); //false
        boolean resultado2 = numero01 < numero02;
        System.out.println(resultado2); //true

        //logico
        /*
        *and &&
        *or ||
        * */
        boolean resultado3 = numero01 > 5 && numero01 < 30;
        System.out.println(resultado3);
    }
}
