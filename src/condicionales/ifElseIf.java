package condicionales;

public class ifElseIf {
    public static void main(String[] args) {
        String dia = "dia";
        boolean resultado = dia.equals("Lunes");
        System.out.println(resultado);
        if (dia.equals("Lunes")){
            System.out.println("Animo 1");
        }else if (dia.equals("Martes")){
            System.out.println("Animo 2");
        }else{
            System.out.println("valor no valido");
        }
    }
}
