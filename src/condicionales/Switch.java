package condicionales;

public class Switch {
    public static void main(String[] args) {
        String dia = "Martes";
        switch (dia){
            case "lunes":
                System.out.println("Es lunes");
                break;
            case "martes":
                System.out.println("Es martes");
                break;
            case "miercoles":
                System.out.println("Es miercoles");
                break;
            case "jueves":
                System.out.println("Es jueves");
                break;
            default:
                System.out.println("Valor no valido");
        }
    }
}
