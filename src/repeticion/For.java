package repeticion;

public class For {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        for (int i = 1;i <= 10; i++){
            System.out.println("El valor es: " + i);
        }
        String[] nombre = {"Pipe", "Eli"};
        for (int i = 0; i < nombre.length; i++){
            System.out.println(nombre[i]);
        }
        int suma = 0;
        int[] numero = {1,2,4,5};
        for (int i = 0;i < numero.length; i++ ){
            suma = suma + numero[i];
            System.out.println(suma);
        }
    }
}
