
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Hola");
        words.add("Saludos");
        words.add("Desde");
        words.add("Colombia");
        
    }
    
    public static void removeLast(ArrayList<String> strings) {
        if (strings.size() > 0){
            int last = strings.size() - 1;
            strings.remove(last);            
        }
    }

}
