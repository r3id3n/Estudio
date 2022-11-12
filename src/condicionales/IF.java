package condicionales;

public class IF {
    public static void main(String[] args) {
        int edad = 17;
        boolean valorEdad = edad>=18;
        if (valorEdad){
            System.out.println("Mayor de edad");
        }else {
            System.out.println("Menor de edad");
        }
        System.out.println("Edad: " + edad);
    }
}
