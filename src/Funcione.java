public class Funcione {
    public static void main(String[] args) {
        //opcion 1:
        showMenu();
        //opcion 2: funcion sin parametros
        String menu = getMenu();
        System.out.println(menu);
        double price = getPrice();
        System.out.println(price);
        //opcion 3: funciones con parametros y sin tipo de retorno
        imprimirSaludoBuenosDias("OpenBootCamp");
        //Opcion 4: funciones con parametros y retorno
        String nombre = "Felipe";
        String apellido = "Valencia";
        String saludo = obtenerSaludo(nombre, apellido);
        System.out.println(saludo);
        //ejmplo Opcion 4
        int resultado = suma(50, 50);
        System.out.println(resultado);
    }
    static int suma(int numero1, int numero2){
        return numero1 + numero2;
    }
    static String obtenerSaludo(String nombre, String apellido){
        return "buenas tardes " + nombre + ' ' + apellido;
    }
    /* Opcion 1
    * void indica que no devulve nada
    */
    static void showMenu(){
        System.out.println("Bienvenidos al E-Commerce de zapatilla:");
        System.out.println("1 - Ver zapatillas");
        System.out.println("2 - comprar zapatilla");
        System.out.println("3 - salir");
    }
    // Opcion 2
    static String getMenu(){
        return "Bienvenidos al E-Commerce de zapatilla:";
    }
    //Opcion 2
    static double getPrice(){
        return 1000.99;
    }
    //Opcion 3
    static void imprimirSaludoBuenosDias(String name){
        System.out.println("buenas tardes " + name);
    }
}
