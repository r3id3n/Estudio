public class Funcione {
    public static void main(String[] args) {
        //opcion 1:
        showMenu();
        //opcion 2: funcion sin parametros
        String menu = getMenu();
        System.out.println(menu);
    }
    /*
    * void indica que no devulve nada
    */
    static void showMenu(){
        System.out.println("Bienvenidos al E-Commerce de zapatilla:");
        System.out.println("1 - Ver zapatillas");
        System.out.println("2 - comprar zapatilla");
        System.out.println("3 - salir");
    }
    static String getMenu(){
        return "Bienvenidos al E-Commerce de zapatilla:";
    }
}
