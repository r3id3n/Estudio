/*
Sobre carga permite duplicar un metodo siempre y cuando tenga diferente numero / tipo parametros.
 */

public class Sobrecarga {
    public static void main(String[] args) {
    double resultado = suma(5);

        System.out.println(resultado);
    }
    static double suma(int numero1){
        return (numero1 * 0.19) + numero1;
    }
}
