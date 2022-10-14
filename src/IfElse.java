public class IfElse {
    public static void main(String[] args) {
        boolean check = 5<10;
        int number1 = 50;
        int number2 = 100;
        int number3 = 20;
        int number4 = 100;

        if (number1 < number2 && number2 < number3){
            System.out.println("If: " + check);
        }else if (number2 < number4){
            System.out.println("Else-If: " + check);
        }else {
            System.out.println("Fin: " + check);
        }
        System.out.println("Fin");
    }
}
