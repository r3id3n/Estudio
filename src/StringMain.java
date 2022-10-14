public class StringMain {
    public static void main(String[] args) {
        String nombre = "  Hola mundo  ";
        System.out.println(nombre.length());
        String mensajeMAY = nombre.toUpperCase();
        System.out.println(mensajeMAY);
        System.out.println(mensajeMAY.trim());
        mensajeMAY = mensajeMAY.trim();

        String otro = "HOLA MUNDO";
        if (mensajeMAY.equals(otro)){
            System.out.println("Verdadero!");
        }
    }
}
