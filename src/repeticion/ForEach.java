package repeticion;

public class ForEach {
    public static void main(String[] args) {

        String[] nombres = {"Pipe", "Eli"};
        String valor = "Welcome ";
        int i = 0;
        for (String nombre : nombres){
            System.out.println(++i + " " + valor.concat(nombre));
        }
        int[] numeros = {5, 10, 15};
        int suma = 0;
        for (int numero : numeros){
            suma += numero;
        }
        System.out.println(suma);
    }
}
