public class Main {
    public static void main(String[] args) {
        holaMundo();
        String hola = devolverHola();
        System.out.println(hola);
        holaMundo("Felipe");
    }
    public static void holaMundo(){
        System.out.println("Hola: ");
    }
    //sobrecarga de funsiones
    private static void holaMundo(String name){
        System.out.println("Hola: " + name);
    }
    private static String devolverHola(){
        return "Hola";
    }
}