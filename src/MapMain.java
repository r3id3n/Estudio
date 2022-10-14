import java.util.HashMap;
import java.util.Map;

public class MapMain {
    public static void main(String[] args) {
        Map<String, String> personas = new HashMap<>();
        personas.put("Nombre1G", "Nombre Apellido 1");
        personas.put("Nombre1H", "Nombre Apellido 2");
        System.out.println(personas);

        for (String key: personas.keySet()){
            System.out.println(key);
        }
        for (String value: personas.values()){
            System.out.println(value);
        }
    }
}
