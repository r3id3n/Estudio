public class WhileLoop {
    public static void main(String[] args) {
        int count = 0;
        while (count < 10){
            count++;
            if (count == 6)
                //continue;
                break;
                System.out.println("Hola mundo -"+count);
        }
        System.out.println("Fin");
    }
}
